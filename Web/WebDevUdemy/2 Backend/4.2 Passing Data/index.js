import express from "express";
import bodyParser from "body-parser";

const app = express();
const port = 3000;

app.use(bodyParser.urlencoded({ extended: true }));

app.get("/", (req, res) => {
  res.render("index.ejs")
});

app.post("/submit", (req, res) => {
  var fullName = capitalizeFirstLetter(req.body["fName"]) + " " + capitalizeFirstLetter(req.body["lName"])
  const data = {
    name : fullName,
    nameLength : fullName.length - 1 // we substract 1 to not count the space between fName and lName
   }
  res.render("index.ejs",  data );
});

app.listen(port, () => {
  console.log(`Server running on port ${port}`);
});

function capitalizeFirstLetter (name) {
  return name.charAt(0).toUpperCase() + name.slice(1);
}