import { readFile } from 'node:fs';
import { writeFile } from 'node:fs';

/* writeFile("message.txt", "Hello from NodeJS!", (err) => {
if (err) throw err;
console.log("The file has been saved!");
}); */

readFile("c:/Code/WebDevUdemy/2 Backend/2.2 Native Modules/message.txt", "utf8", (err, data) =>{
    if (err) throw err;
    console.log(data);
});
