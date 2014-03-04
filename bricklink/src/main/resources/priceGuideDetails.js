function getData (column) {
    var rows = $(column).find('tr[align="right"]'),
        priceGuide = {
            price_detail: []
        };

    $.each(rows, function (index, row) {
        if (0 === index) {
            return;
        }
        var childs = $(row).children();
        if (3 == childs.length) {
            var seller_country = $($(childs[0]).find('img[src*="flagsS"]')).attr('src'),
                quantity = parseInt($(childs[1]).text(), 10),
                unit_price = parseFloat($(childs[2]).text().replace('~', '').replace('EUR', ''), 10);
            var priceDetail = {
                qunatity: quantity,
                unit_price: unit_price,
            };
            priceGuide.price_detail.push(priceDetail);
            if (seller_country) {
                priceDetail.seller_country_code = seller_country.split('/')[3].split('.')[0];
            }
        }
        if (2 == childs.length) {
            var name = $(childs[0]).text(),
                value = $(childs[1]).text().replace('~', '').replace('EUR', '');
            if (name.indexOf('Times Sold') !== -1 || name.indexOf('Total Lots') !== -1) {
                priceGuide.unit_quantity = parseInt(value, 10);
            }
            if (name.indexOf('Total Qty', 0) !== -1) {
                priceGuide.total_quantity = parseInt(value, 10);
            }
            if (name.indexOf('Min Price') !== -1) {
                priceGuide.min_price = parseFloat(value, 10);
            }
            if (name.indexOf('Avg Price') !== -1 && name.indexOf('Qty') === -1) {
                priceGuide.avg_price = parseFloat(value, 10);
            }
            if (name.indexOf('Qty Avg Price') !== -1) {
                priceGuide.qty_avg_price = parseFloat(value, 10);
            }
            if (name.indexOf('Max Price') !== -1) {
                priceGuide.max_price = parseFloat(value, 10);
            }
        }
    });

    return JSON.stringify(priceGuide, 2, undefined);
}

return getData(arguments[0]);
