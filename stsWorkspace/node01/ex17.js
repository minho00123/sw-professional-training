const querystring = require("querystring");
let msg =
  "https://search.naver.com/search.naver?query=%ED%95%9C%EA%B8%80&key2=val2";
msg = msg.split("?")[1];
console.log(querystring.parse(msg));
console.log(querystring.parse(msg).query);
console.log(querystring.parse(msg).key2);
console.log(querystring.stringify({ k1: "v1", k2: "v2" }));
