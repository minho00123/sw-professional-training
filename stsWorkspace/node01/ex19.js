const events = require("events");
const emit = new events.EventEmitter();

const cb1 = (e) => {
  console.log("event 1 run...");
};
const cb2 = (e) => {
  console.log("event 2 run...");
};
// emit.addListener("event1", cb1);
// emit.removeListener("event1", cb1);
emit.on("event1", cb1);
emit.on("event1", cb2);
emit.once("event2", cb2);
// emit.on("event2", cb2);
emit.off("event1", cb1);
// emit.off("event2", cb2);
console.log(emit.listenerCount("event1"));

setTimeout(() => {
  emit.emit("event1");
  emit.emit("event2");
  emit.emit("event2");
}, 3000);
