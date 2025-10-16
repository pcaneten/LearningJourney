var randomNumber1 = Math.ceil(Math.random()*6);
var randomDiceImage1 = "./images/dice" + randomNumber1 + ".png";
var randomNumber2 = Math.ceil(Math.random()*6);
var randomDiceImage2 = "./images/dice" + randomNumber2 + ".png";

document.querySelectorAll(".dice img")[0].setAttribute("src", randomDiceImage1);
document.querySelectorAll(".dice img")[1].setAttribute("src", randomDiceImage2);

if (randomNumber1 > randomNumber2) {
    document.querySelector("h1").innerText = "🚩Player 1 wins!";
} else if (randomNumber1 < randomNumber2) {
    document.querySelector("h1").innerText = "Player 2 wins! 🚩";
} else {
    document.querySelector("h1").innerText = "Draw!";
}
