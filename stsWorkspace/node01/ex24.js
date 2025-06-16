const http = require("http");
const url = require("url");
const path = require("path");
const fs = require("fs");

const server = http.createServer((req, resp) => {
  const call = url.parse(req.url).pathname;
  const file = path.join(__dirname, "html", call);
  if (fs.existsSync(file)) {
    resp.setHeader("Content-Type", "text/html;charset=utf8");
    const msg = fs.readFileSync(file, { encoding: "utf-8" });
    fs.close(0);
    resp.write(msg);
    resp.end();
  }
});

// server.on("connection", (req, resp) => {
//   console.log(resp);
//   console.log("callback connection");
// });
// server.on("listening", () => {
//   console.log("callback listening");
// });

server.listen(3000, "localhost", () => {
  console.log("실행중...");
});
