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
        <svg width="300" height="500" class="schedule">
            <line x1="0" x2="300" y1="150" y2="150" stroke="black"></line>
            <line x1="150" x2="150" y1="0" y2="300" stroke="black"></line>
            <!--Стрелочки-->
            <polygon points="150,0 145,15 155,15" stroke="black"></polygon>
            <polygon points="300,150 285,145 285,155" stroke="black"></polygon>
            <!--Треугольник-->
            <polygon points="150,150 250,150 150,50" class="figure"></polygon>
            <!--Прямоугольник-->
            <polygon points="150,250 100,250 100,150 150,150" class="figure"></polygon>
            <!--Четверть круга-->
            <path d="M150,100 A50,50 90 0,0 100,150 L 150,150 Z" class="figure"></path>
            <!-- Подписи к осям -->
            <text x="285" y="135">X</text>
            <text x="160" y="15">Y</text>
            <!-- Метки для значений R на оси X -->
            <line id="division" x1="50" x2="50" y1="140" y2="160"></line>
            <line id="division" x1="100" x2="100" y1="140" y2="160"></line>
            <line id="division" x1="200" x2="200" y1="140" y2="160"></line>
            <line id="division" x1="250" x2="250" y1="140" y2="160"></line>
            <!-- Метки для значений R на оси Y -->
            <line id="division" x1="140" x2="160" y1="50" y2="50"></line>
            <line id="division" x1="140" x2="160" y1="100" y2="100"></line>
            <line id="division" x1="140" x2="160" y1="200" y2="200"></line>
            <line id="division" x1="140" x2="160" y1="250" y2="250"></line>
            <!-- Значения R на оси X -->
            <text x="40" y="130">-R</text>
            <text x="85" y="130">-R/2</text>
            <text x="190" y="130">R/2</text>
            <text x="245" y="130">R</text>
            <!-- Значения R на оси Y -->
            <text x="170" y="52.5">R</text>
            <text x="170" y="102.5">R/2</text>
            <text x="170" y="202.5">-R/2</text>
            <text x="170" y="252.5">-R</text>
        </svg>
    </div>
    <div id="main" class="main_field">
        <h2 class="center">Ввод данных</h2>
        <jsp id="area" scope="request" type="ControllerServet.Area">
            <form id="forms" action="area?action=submit" method="get">
                <div class="input_values"> Введите X:<br>
                    <input type="button" name="x_coordinate" onchange="changeActiveCheckboxX(id)" class="x" id="x_value_-3" value="-3">-3
                    <input type="button" name="x_coordinate" onchange="changeActiveCheckboxX(id)" class="x" id="x_value_-2" value="-2">-2
                    <input type="button" name="x_coordinate" onchange="changeActiveCheckboxX(id)" class="x" id="x_value_-1" value="-1">-1
                    <input type="button" name="x_coordinate" onchange="changeActiveCheckboxX(id)" class="x" id="x_value_0" value="0">0
                    <input type="button" name="x_coordinate" onchange="changeActiveCheckboxX(id)" class="x" id="x_value_1" value="1">1
                    <input type="button" name="x_coordinate" onchange="changeActiveCheckboxX(id)" class="x" id="x_value_2" value="2">2
                    <input type="button" name="x_coordinate" onchange="changeActiveCheckboxX(id)" class="x" id="x_value_3" value="3">3
                    <input type="button" name="x_coordinate" onchange="changeActiveCheckboxX(id)" class="x" id="x_value_4" value="4">4
                    <input type="button" name="x_coordinate" onchange="changeActiveCheckboxX(id)" class="x" id="x_value_5" value="5">5
                </div>
                <div class="input_values">
                    <label for="y_value">Введите Y:</label> <br>
                    <input style="margin-bottom: 10px" type="text" name="y_coordinate" class="y" id="y_value" placeholder="(-5...5)*" autocomplete="off"><br>
                    <span id="note">*Происходит округление значений до 2 знаков после запятой</span>
                </div>
                <div class="input_values">Введите R:<br>
                    <input type="button" name="r_coordinate" onchange="changeActiveCheckboxR(id)" class="r" id="r_value_1" value="1">1
                    <input type="button" name="r_coordinate" onchange="changeActiveCheckboxR(id)" class="r" id="r_value_1,5" value="1,5">1,5
                    <input type="button" name="r_coordinate" onchange="changeActiveCheckboxR(id)" class="r" id="r_value_2" value="2">2
                    <input type="button" name="r_coordinate" onchange="changeActiveCheckboxR(id)" class="r" id="r_value_2,5" value="2,5">2,5
                    <input type="button" name="r_coordinate" onchange="changeActiveCheckboxR(id)" class="r" id="r_value_3" value="3">3
                </div>
                <div class="input_values">
                    <input type="submit" class="check_button" value="Проверить">
                </div>
                <div class="validation_message">

                </div>
            </form>
        </jsp>
    </div>
</div>
<div id="footer" class="main_field">
    <h2 class="center">Таблица результатов</h2>
    <table id="result_table" rules="all">
        <thead>
        <th>Значение X</th>
        <th>Значение Y</th>
        <th>Значение R</th>
        <th>Время выполнения</th>
        <th>Текущее время выполнения</th>
        <th>Результат</th>
        </thead>
        <tbody>

        </tbody>
    </table>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.min.js" ></script>
<script src="js/updater.js"></script>
<script src="js/checker.js"></script>
<script src="js/setterMessage.js"></script>
<script src="js/checkboxManager.js"></script>
</body>
</html>
