<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=utf-8" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Лабораторная работа №2</title>
    <link rel="stylesheet" type="text/css" href="resources/style.css">
</head>
<body>
<div id="header" class="main_field">
        <span id="header_text">
            Аллаяров Игорь, P32121, Вариант №1101
        </span>
</div>
<div id="wrapper" class="main_field">
    <div id="form_table" class="main_field">
        <h2 class="center">Система координат с областью</h2>
        <div class="">
            <canvas class="schedule" id="canvas" width="300" height="300">
            </canvas>
        </div>
    </div>
    <div id="main" class="main_field">
        <h2 class="center">Ввод данных</h2>
        <form id="forms" method="post">
            <div class="input_values"> Введите X:<br>
                <input type="button" name="x_coordinate" onclick="changeActiveCheckboxX(id)" class="x" id="x_value_-2" value="-2">
                <input type="button" name="x_coordinate" onclick="changeActiveCheckboxX(id)" class="x" id="x_value_-1.5" value="-1.5">
                <input type="button" name="x_coordinate" onclick="changeActiveCheckboxX(id)" class="x" id="x_value_-1" value="-1">
                <input type="button" name="x_coordinate" onclick="changeActiveCheckboxX(id)" class="x" id="x_value_-0.5" value="-0.5">
                <input type="button" name="x_coordinate" onclick="changeActiveCheckboxX(id)" class="x" id="x_value_0" value="0">
                <input type="button" name="x_coordinate" onclick="changeActiveCheckboxX(id)" class="x" id="x_value_0.5" value="0.5">
                <input type="button" name="x_coordinate" onclick="changeActiveCheckboxX(id)" class="x" id="x_value_1" value="1">
                <input type="button" name="x_coordinate" onclick="changeActiveCheckboxX(id)" class="x" id="x_value_1.5" value="1.5">
                <input type="button" name="x_coordinate" onclick="changeActiveCheckboxX(id)" class="x" id="x_value_2" value="2">
            </div>
            <div class="input_values">
                <label for="y_value">Введите Y:</label> <br>
                <input style="margin-bottom: 10px" type="text" name="y_coordinate" class="y" id="y_value" placeholder="(-3...3)*" autocomplete="off"><br>
                <span id="note">*Происходит округление значений до 2 знаков после запятой</span>
            </div>
            <div class="input_values">Введите R:<br>
                <input type="button" name="r_coordinate" onclick="changeActiveCheckboxR(id)" class="r" id="r_value_1" value="1">
                <input type="button" name="r_coordinate" onclick="changeActiveCheckboxR(id)" class="r" id="r_value_1.5" value="1.5">
                <input type="button" name="r_coordinate" onclick="changeActiveCheckboxR(id)" class="r" id="r_value_2" value="2">
                <input type="button" name="r_coordinate" onclick="changeActiveCheckboxR(id)" class="r" id="r_value_2.5" value="2.5">
                <input type="button" name="r_coordinate" onclick="changeActiveCheckboxR(id)" class="r" id="r_value_3" value="3">
            </div>
            <div class="input_values">
                <input type="submit" class="check_button" value="Проверить">
            </div>
            <div class="validation_message">

            </div>
        </form>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="js/updater.js"></script>
<script src="js/drawCanvas.js"></script>
<script src="js/checker.js"></script>
<script src="js/setterMessage.js"></script>
<script src="js/buttonManager.js"></script>
</body>
</html>
