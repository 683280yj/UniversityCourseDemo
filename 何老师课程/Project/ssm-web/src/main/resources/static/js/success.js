$(document).ready(function () {
    function jump(count) {
        window.setTimeout(function () {
            count--;
            if (count > 0) {
                $('.num').text(count);
                jump(count);
            } else {
                location.href = "login";
            }
        }, 1000);
    }
    jump(5);
});