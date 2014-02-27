var getDetails = function () {
    var rows = $($('table.fv')[7]).find('tr'),
        list = [];

    $.each(rows, function (index, row) {
        var childs = $(row).children(),
            seller_country = $($(childs[0]).find('img')[1]).attr('src'),
            quantity = parseInt($(childs[1]).text(), 10),
            unit_price = parseFloat($(childs[2]).text().replace('~EUR', ''), 10);

        //ignore headlines
        if (seller_country) {
            //get flag from filename
            seller_country = seller_country.split('/')[1].split('.')[0];
            //add to list
            list.push({
                quantity: quantity,
                unit_price: unit_price,
                seller_country: seller_country
            });
        }
    });

    console.log(JSON.stringify(list, 2, undefined));

}

return getDetails();
