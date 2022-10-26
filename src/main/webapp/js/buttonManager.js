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
        }
    }
}