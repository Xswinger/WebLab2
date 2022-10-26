let xValues = document.querySelectorAll('.x');
let yValues = document.querySelector('.y');
let rValues = document.querySelectorAll('.r');
let canvas = document.getElementById("canvas");
let selectedRValue = 1;
let xValue;
let yValue;
let rValue;
let infoBox = document.querySelector('.validation_message');
let infoValidation = '';

$(document).ready(function (){
    drawCanvas(selectedRValue);
})

$(canvas).onclick = e => {
    clearCanvas();
    drawCanvas(selectedRValue);
    putDot(e.offsetX, e.offsetY);
}

//Отправка запроса при нажатии кнопки
$("#forms").on("submit", function (event) {
    event.preventDefault();
    infoValidation = "";
    if (checkInputValues(xValues, yValues, rValues)) {
        yValue = Number(yValues.value.trim()).toFixed(2);
        $.post("./controller", {x_coordinate: xValue, y_coordinate: yValue, r_coordinate: rValue, time: new Date().getTimezoneOffset()}).done(function (data) {
            $(".check_button").attr("disabled", false);
            $("#result_table>tbody").html(data);
        }).fail(function () {
            $(".check_button").attr("disabled", false);
        })
    }
})