import express from "express";
import bodyParser from "body-parser";
// import bootstrap from 'bootstrap';

const app = express();
const port = 3000;
let userArticles = [
  {articleNr: 0, title : "Zero", article: "This is nothing but a zero article." },
  {articleNr: 1, title : "One", article: "This is nothing but a one article."},
  {articleNr: 2, title : "Two", article: "This is nothing but a two article."}
];
var nrOfArticles = userArticles.length;

app.use(bodyParser.urlencoded({extended: true}));
app.use(express.static("public"));

app.get("/", (req, res) => {
  var latestCreations = latestArticles();
  res.render("index.ejs", latestCreations);
});

app.get("/about", (req, res) => {
  res.render("about.ejs");
});

app.get("/contact", (req, res) => {
  res.render("contact.ejs");
});

app.get("/create", (req,res) => {
  res.render("createPost.ejs");
});

app.post("/create", (req, res) => {
  uploadNewArticle(req.body["title"], req.body["userPost"]);
  res.render("createPost.ejs", { 
    title : userArticles[nrOfArticles]["title"],
    articleNr : nrOfArticles
  });
});

app.get("/article", (req,res) => { 
  res.render("article.ejs", { 
    title : userArticles[req.query.nr]["title"],
    articleText : userArticles[req.query.nr]["article"]
  });
});



app.listen(port, () =>{
    console.log(`Server running under port ${port}`);
})

function uploadNewArticle(title, article) {
  userArticles.push({ articleNr: nrOfArticles, title : title, article: article });
}


function latestArticles(){
  var data = {
    title1 : userArticles[nrOfArticles-1]["title"],
    articleText1 : userArticles[nrOfArticles-1]["article"].slice(0, 50),
    articleNr1 : nrOfArticles-1
  }
  if (nrOfArticles > 1 ) {
    data.title2 = userArticles[nrOfArticles-2]["title"];
    data.articleText2 = userArticles[nrOfArticles-2]["article"].slice(0, 50);
    data.articleNr2 = nrOfArticles-2;
  };
  if (nrOfArticles > 2) {
    data.title3 = userArticles[nrOfArticles-3]["title"];
    data.articleText3 = userArticles[nrOfArticles-3]["article"].slice(0, 50);
    data.articleNr3 = nrOfArticles-3;
  }
  return data
}