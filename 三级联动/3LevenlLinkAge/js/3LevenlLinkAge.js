let url = "https://restapi.amap.com/v3/config/district";
let type = "GET";
let dataType = "json";
let async = true;
let key = "d625a1f89007373a702bc054fa78c545";

function getProvinceForTll() {
    $.ajax({
        url: url,
        type: type,
        dataType: dataType,
        async: async,
        data: {
            key: key,
            keywords: "",
            subdistrict: 1
        },
        success: function (data) {
            let obj = data.districts[0];

            let html = $.get('templates/province.html', function (data) {
                let render = template.compile(data);
                let str = render(obj);

                document.getElementById('address-constituency-province').innerHTML = str;
            });
        },
        error: function (data) {
            console.log(data);
        }
    });
}

function getCityForTll() {
    $.ajax({
        url: url,
        type: type,
        dataType: dataType,
        async: async,
        data: {
            key: key,
            keywords: $("#tll-address-province option:selected").text(),
            subdistrict: 1
        },
        success: function (data) {
            let obj = data.districts[0];

            let html = $.get('templates/city.html', function (data) {
                let render = template.compile(data);
                let str = render(obj);

                document.getElementById('address-constituency-city').innerHTML = str;
            });
        },
        error: function (data) {
            console.log(data);
        }
    });
}

function getDistrictForTll() {
    let cityName = $("#tll-address-city option:selected").text();
    $.ajax({
        url: url,
        type: type,
        dataType: dataType,
        async: async,
        data: {
            key: key,
            keywords: $("#tll-address-province option:selected").text(),
            subdistrict: 2
        },
        success: function (data) {
            let obj = data.districts[0].districts;
            let district = "";

            for (let i = 0; i < obj.length; i++) {
                if (obj[i].name === cityName) {
                    district = obj[i];
                }
            }

            let html = $.get('templates/district.html', function (data) {
                let render = template.compile(data);
                let str = render(district);

                document.getElementById('address-constituency-district').innerHTML = str;
            });
        },
        error: function (data) {
            console.log(data);
        }
    });
}
