function getData (column) {
    var rows = $(column).find('tr[align="right"]'),
        list = [],
        priceGuide = new Object();

    $.each(rows, function (index, row) {
        if (0 === index) {
            return;
        }
        var childs = $(row).children();
        if (3 == childs.length) {
            var seller_country = $($(childs[0]).find('img')[1]).attr('src'),
                quantity = parseInt($(childs[1]).text(), 10),
                unit_price = parseFloat($(childs[2]).text().replace('~EUR', ''), 10);
            if (seller_country) {
                seller_country = seller_country.split('/')[3].split('.')[0];
                list.push({
                    qunatity: quantity,
                    unit_price: unit_price,
                    seller_country_code: seller_country
                });
            } else {
                list.push({
                    qunatity: quantity,
                    unit_price: unit_price,
                });
            }
        }
        if (2 == childs.length) {
            var name = $(childs[0]).text();
            var value = $(childs[1]).text();
            console.log(name + "," + value);
            if ("Times Sold: " == name || "Total Lots: " == name) {
                priceGuide.unit_quantity = parseInt(value, 10);
            }
            if (name == 'Total Qty: ') {
                priceGuide.total_quantity = parseInt(value, 10);
            }
            if ("Min Price: " == name) {
                priceGuide.min_price = parseFloat(value.replace('~EUR', ''), 10);
            }
            if ("Avg Price: " == name) {
                priceGuide.avg_price = parseFloat(value.replace('~EUR', ''), 10);
            }
            if ("Qty Avg Price: " == name) {
                priceGuide.qty_avg_price = parseFloat(value.replace('~EUR', ''), 10);
            }
            if ("Max Price: " == name) {
                priceGuide.max_price = parseFloat(value.replace('~EUR', ''), 10);
            }
        }
    });
    priceGuide.price_detail = list;

    console.log(JSON.stringify(priceGuide, 0, undefined));
    return priceGuide;
}

return JSON.stringify(getData($('td[width="25%"]:nth-of-type(3)')), 2, undefined);
