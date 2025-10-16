var buttonColours = ["red", "blue", "green", "yellow"];

var gamePattern = [];
var userClickedPattern = [];

var level = 0;
var gameStarted = false;
var UserTurn = false;



$(".btn").on("click", function(){
    if (gameStarted && UserTurn){
        userClickedPattern.push(this.id);
        playSound(this.id);
        animatePress(this.id);
        checkAnswer(userClickedPattern.length -1)
    }
})

$(document).keypress(function(){
    if (!gameStarted) {
        $("#level-title").text("Level " + level);
        nextSequence();
        gameStarted = true;
    } 
})

function nextSequence(){
    userClickedPattern = [];
    level++;
    $("#level-title").text("Level " + level);
    var randomNumber = Math.round(Math.random()*3);
    var randomChosenColour = buttonColours[randomNumber];
    gamePattern.push(randomChosenColour);
    $("#" + randomChosenColour).fadeIn(100).fadeOut(100).fadeIn(100);
    playSound(randomChosenColour);
    UserTurn = true;
}

function checkAnswer(currentLevel){
    if(userClickedPattern[currentLevel] === gamePattern[currentLevel]) {
        if(userClickedPattern.length === gamePattern.length){
            UserTurn = false;
            setTimeout(nextSequence(), 1000);
        }
    } else {
        playSound("wrong");
            $("#level-title").text("Game Over, Press Any Key to Restart");
            $("body").addClass("game-over");
            setTimeout(function(){$("body").removeClass("game-over");}, 200);   
            startOver();
    }
}

function animatePress(currentColour) {
    var buttonID = "#" + currentColour
    $(buttonID).addClass("pressed");
    setTimeout(function (){$(buttonID).removeClass("pressed")}, 100)
}

function startOver(){ 
    level = 0;
    gameStarted = false;
    gamePattern = []
}

function playSound(fileName){
    var fileURL = "./sounds/" + fileName + ".mp3"
    var audio = new Audio(fileURL);
    audio.play();
}

