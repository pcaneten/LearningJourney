/* 
1. Use the inquirer npm package to get user input.
2. Use the qr-image npm package to turn the user entered URL into a QR code image.
3. Create a txt file to save the user input using the native fs node module.
*/

import { input } from '@inquirer/prompts';
import { confirm } from '@inquirer/prompts';
import qr from "qr-image";
import fs from "fs";



const userURL = await input({ message: 'Enter the URL here:' });
const answer = await confirm({message: `Do you want to save following URL:\n  ${userURL}\n`});


if (answer) {
    var qr_svg = qr.image(userURL);
    qr_svg.pipe(fs.createWriteStream("qr.image.png"));
    
    fs.writeFile("URL.txt", userURL, (err) => {
        if (err) throw err;
        console.log("The file has been saved!");
    });
} else {
    console.log("No file has been saved.");
}