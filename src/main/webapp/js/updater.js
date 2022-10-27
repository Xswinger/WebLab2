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

canvas.addEventListener('click', ev => {
    if (checkOnActiveR()) {
        clearCanvas();
        drawCanvas(selectedRValue);
        putDot(ev.offsetX, ev.offsetY);
    } else {
        alert("Значение R не выбрано!")
    }
})

//Отправка запроса при нажатии кнопки
$("#forms").on("submit", function (event) {
    event.preventDefault();
    infoValidation = "";
    if (checkInputValues(xValues, yValues, rValues)) {
        yValue = Number(yValues.value.trim()).toFixed(2);
        $.post("./controller", {x_coordinate: xValue, y_coordinate: yValue, r_coordinate: rValue, time: new Date().getTimezoneOffset()}).done(function (data) {
            $(".check_button").attr("disabled", false);
            window.location.replace("result.jsp");
        }).fail(function () {
            $(".check_button").attr("disabled", false);
        })
    }
})