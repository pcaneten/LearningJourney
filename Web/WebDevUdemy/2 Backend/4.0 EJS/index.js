import express from "express";
const app = express();
const port = 3000;
const today = new Date();
const day = today.getDay()
var type = "";
var adv = "";

app.get("/", (req, res) => {
    console.log(day);
    weekdayOrNot();
    res.render("index.ejs", { 
        dayType : type,
        advice : adv        
    })
})

app.listen(port, (req, res) => {
    console.log(`Server is running on port ${port}`);
});

function weekdayOrNot (){
    type = "a weekday"
    adv = "it's time to work hard"
    if (day === 0 || day === 6) {
        type = "the weekend"
        adv = "it's time to have fun"
    }
}

