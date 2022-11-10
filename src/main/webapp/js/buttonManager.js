//Изменение выбранного бокса для X
function changeActiveCheckboxX(id) {
    let buttons = document.querySelectorAll('.x');
    for (let i = 0; i < buttons.length; i++) {
        if (buttons[i].id !== id) {
            buttons[i].disabled = false;
        } else {
            document.getElementById(id).disabled = true;
        }
    }
}

//Изменение выбранного бокса для R
function changeActiveCheckboxR(id) {
    let buttons = document.querySelectorAll('.r');
    for (let i = 0; i < buttons.length; i++) {
        if (buttons[i].id !== id) {
            buttons[i].disabled = false;
        } else {
            document.getElementById(id).disabled = true;
            clearCanvas();
            drawCanvas(document.getElementById(id).value);
            selectedRValue = document.getElementById(id).value;
        }
    }
}

function changeActiveButtonY(r, y) {
    document.querySelector('.y').value = Number(-(r * 0.01) * y + (r * 1.5)).toFixed(2);
}

function changeActiveButtonX(r, x) {
    let value = (r * 0.01) * x - (r * 1.5);
    let valueWithLowerStep = (Math.round(value * 2) / 2).toFixed(1);
    switch (valueWithLowerStep) {
        case "-2.0":
            changeActiveCheckboxX("x_value_-2");
            break;
        case "-1.5":
            changeActiveCheckboxX("x_value_-1.5");
            break;
        case "-1.0":
            changeActiveCheckboxX("x_value_-1");
            break;
        case "-0.5":
            changeActiveCheckboxX("x_value_-0.5");
            break;
        case "-0":
            changeActiveCheckboxX("x_value_-0");
            break;
        case "0.5":
            changeActiveCheckboxX("x_value_0.5");
            break;
        case "1.0":
            changeActiveCheckboxX("x_value_1");
            break;
        case "1.5":
            changeActiveCheckboxX("x_value_1.5");
            break;
        case "2.0":
            changeActiveCheckboxX("x_value_2");
            break;
    }

}

function checkOnActiveR() {
    let buttons = document.querySelectorAll('.r');
    for (let i = 0; i < buttons.length; i++) {
        if (buttons[i].disabled) {
            return true;
        }
    }
    return false;
}