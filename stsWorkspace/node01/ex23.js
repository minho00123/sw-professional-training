const fs = require("fs");
// rwx 1, 2, 4
// a

fs.open("test01.txt", "a", (err, fd) => {
  console.log(fd);
});
