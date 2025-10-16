import express from "express";
const app = express();
const port = 3000;

app.get("/", (req, res) => {
    // console.log(req.rawHeaders)
    res.send("<h1>Hello, World!</h1>");
});

app.get("/about", (req, res) => {
    // console.log(req.rawHeaders)
    res.send("<h1>About you!</h1>");
});

app.get("/contact", (req, res) => {
    // console.log(req.rawHeaders)
    res.send("<h1>Lets req and res</h1>");
});

app.listen(port, () => {
    console.log(`Your Server is up an running under prot ${port}.`);
});