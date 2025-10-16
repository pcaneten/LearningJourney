import express from "express";
import bodyParser from "body-parser";
import morgan from "morgan";
import { dirname } from "path";
import { fileURLToPath } from "url";

const __dirname = dirname(fileURLToPath(import.meta.url));
const app = express();
const port = 3000;

app.use(bodyParser.urlencoded({extended: true}));
// app.use(bandNameGenerator) // alternative to morgan, function is at the bottom

app.post("/submit", (req, res) =>{
  var bandName = req.body["pet"] + req.body["street"];
  res.send(`<h1>Your Band Name is:</h1><h2>${bandName}🤘</h2>`);
})

app.get("/", (req, res) => {
  res.sendFile(__dirname + "/public/index.html");
});

app.listen(port, () => {
  console.log(`Listening on port ${port}`);
});


/* var bandName
function bandNameGenerator(){
 bandName = req.body["pet"] + req.body["street"];
  next();
}  */