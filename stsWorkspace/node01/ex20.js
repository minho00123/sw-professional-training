const fs = require("fs");

// const msg = fs.readdirSync("ex01.js");
// console.log(msg);

fs.writeFileSync("test02.txt", "hello javascript", { flag: "a" });

const buf1 = fs.readFileSync("test02.txt");
console.log(buf1.toString());
