//The password is ILoveProgramming
import express from "express";
import bodyParser from "body-parser";
import { dirname } from "path";
import { fileURLToPath} from "url";

const __dirname = dirname(fileURLToPath(import.meta.url));
const app = express();
const port = 3000;
var userIsAuthorized = false;

app.use(bodyParser.urlencoded({extended: true}))

app.get("/", (req, res) => {
  res.sendFile(__dirname + "/public/index.html");
});

app.use(verifyPw);

app.post("/check", (req, res) => {
    if (userIsAuthorized){
        res.sendFile(__dirname + "/public/secret.html");
    } else {
        res.redirect("/");
    }
});


app.listen(port, () => {
  console.log(`Listening on port ${port}`);
});

function verifyPw(req, res, next) {    
    if (req.body["password"] === "ILoveProgramming") {
        userIsAuthorized = true;
    } 
    next();
}