let context = canvas.getContext("2d");

function drawCanvas(r) {
    //Triangle
    context.beginPath();
    context.fillStyle = "#004cff";
    context.strokeStyle = "#004cff";
    context.moveTo(150, 150);
    context.lineTo(200, 150);
    context.lineTo(150, 100);
    context.fill();
    //Rect
    context.rect(50, 100, 100, 50);
    context.fill();
    //Circle
    context.beginPath();
    context.arc(150, 150, 100, 0.5 * Math.PI, Math.PI);
    context.lineTo(150, 150);
    context.fill();
    context.closePath();
    context.stroke();
    //Horizontal line
    context.beginPath();
    context.strokeStyle = "rgb(0,0,0)";
    context.lineWidth = 2;
    context.moveTo(0, 150);
    context.lineTo(290, 150);
    //Vertical line
    context.moveTo(150, 10);
    context.lineTo(150, 300);
    //Serifs
    context.moveTo(50, 140);
    context.lineTo(50, 160);
    context.moveTo(100, 140);
    context.lineTo(100, 160);
    context.moveTo(200, 140);
    context.lineTo(200, 160);
    context.moveTo(250, 140);
    context.lineTo(250, 160);
    context.moveTo(140, 50);
    context.lineTo(160, 50);
    context.moveTo(140, 100);
    context.lineTo(160, 100);
    context.moveTo(140, 200);
    context.lineTo(160, 200);
    context.moveTo(140, 250);
    context.lineTo(160, 250);
    context.stroke();
    //Arrows
    context.fillStyle = "#000000";
    context.moveTo(150, 0);
    context.lineTo(145, 15);
    context.lineTo(155, 15);
    context.closePath();

    context.moveTo(300, 150);
    context.lineTo(285, 145);
    context.lineTo(285, 155);
    context.closePath();
    context.fill();
    context.stroke();
}

function clearCanvas() {
    context.clearRect(0, 0, 300, 300);
}

function putDot(x, y) {
    context.beginPath();
    context.fillStyle = "#fd0000";
    context.rect(x, y, 3, 3);
    context.fill();
    context.closePath();
    changeActiveButtonY(selectedRValue, y);
    changeActiveButtonX(selectedRValue, x);
    document.getElementById("forms").submit();
}