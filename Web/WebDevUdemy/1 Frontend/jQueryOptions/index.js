$(".a").click(function(){
    $("h1").css("color", randomRGB);
})

$(".b").click(function(){
    if (!$("h1").hasClass("font5")){
        $("h1").addClass("font5")
    } else {
        $("h1").removeClass("font5")
    }
})

$(".c").click(function(){
    $("h1").text(randomRGB());
})

$(".d").click(function(){
    var randomPadding = "padding: "+ Math.floor(Math.random()*11) + "rem;"
    $("h1").attr("style", randomPadding);
    console.log(randomPadding)
})

$("body").keydown(function(e){
    if (e.key === "Escape") {
        revertToOriginal();
        return
    } else if(e.key === "x") {
        $("p").css("color", "black");
    } else {
        $("p").css("color", randomRGB);
    } 
    $("h1").text(e.key)
})

$(".e").click(function(){
    $("h1").before("<h2>😊<h2>");
})

$(".f").click(function(){
    $("h1").after("<h2>😊<h2>");
})
$(".g").click(function(){
    $("h1").prepend("<h2>😊<h2>");
})
$(".h").click(function(){
    $("h1").append("<h2>😊<h2>");
})

$(".i").click(function(){
    $("h1").hide();
})

$(".j").click(function(){
    $("h1").show();
})

$(".k").click(function(){
    $("h1").toggle();
})

$(".l").click(function(){
    $("h1").fadeOut();
})

$(".m").click(function(){
    $("h1").fadeIn();
})

$(".n").click(function(){
    $("h1").fadeToggle();
})

$(".o").click(function(){
    $("h1")
        .hide()
        .text("hi!")
        .slideDown()
        .animate({margin: "40"})
        .animate({opacity: 0.1})
        .animate({opacity: 1})
        .text("bye!")
        .slideUp();
})

$(".z").click(revertToOriginal);

function revertToOriginal() {
    $("h1").removeAttr("style");
    $("p").removeAttr("style");
    $("h1").removeClass();
    $("h1").text("H1 header to test with JQuery");
    $("body > div h2").remove();
    return
}

function randomHex () {
    var number = Math.floor(Math.random()*16)
    switch (number){
        case 10:
            return number = "a";
        case 11:
            return number = "b";
        case 12:
            return number = "c";
        case 13:
            return number = "d"; 
        case 14:
            return number = "e";
        case 15: 
            return number = "f"
        default:
            return number
    }
}

function randomRGB (){
    var valueRed = randomHex();
    var valueBlue = randomHex();
    var valueGreen = randomHex();
    var randomRGB = "#" + valueRed + valueBlue + valueGreen;
    return randomRGB
}
