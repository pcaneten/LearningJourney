for (var i = 0; i < document.querySelectorAll(".drum").length; i++){
    document.querySelectorAll(".drum")[i].addEventListener("click", function (){
       var buttonInnerHTML = this.innerHTML;
       drumAudio(buttonInnerHTML)
    })   
}

document.addEventListener("keydown", function(event){
    drumAudio(event.key);        
})

function drumAudio(key){
    buttonAnimation(key)
    switch (key){
        case "w": 
            var fileName = "crash";
            break;
        case "a": 
            var fileName = "kick-bass";
            break;
        case "s":
            var fileName = "snare";
            break;
        case "d":
            var fileName = "tom-1";
            break;
        case "j":
            var fileName = "tom-2";
            break;
        case "k":
            var fileName = "tom-3";
            break;
        case "l":
            var fileName = "tom-4";
            break;
        default:
            // console.log(key)
            break;
       }   
    var fileURL = "./sounds/" + fileName + ".mp3";
    var audio = new Audio(fileURL);
    audio.play();
}

function buttonAnimation (key){
    var activeButton = document.querySelector("."+ key);
    console.log(activeButton);
    activeButton.classList.add("pressed");
    setTimeout(function (){activeButton.classList.remove("pressed")}, 200);
}