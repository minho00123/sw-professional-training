function Func01() {
  this.su1 = 1111;
}
console.log(new Func01().su1);
class Func02 {
  su1 = 1111;
  func1 = function () {
    console.log("메서드", this);
  };
  func3 = () => console.log("메서드", this);
  func2(a) {
    console.log("메서드", a, this);
  }
  constructor(a) {
    this.su2 = a;
  }
}
// console.log(new Func02(3333));
new Func02(3333).func2(1111);
