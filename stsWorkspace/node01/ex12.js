console.log(global.parseInt("1234") + 1);
console.log(parseInt("1234") + 1);
console.log(Number("12.34") + 1);
console.log(encodeURI("abcdefg"));
console.log(encodeURI("한글"));
console.log(decodeURI("%ED%95%9C%EA%B8%80"));
console.log(
  encodeURIComponent("https://search.naver.com/search.naver?query=한글")
);
console.log(
  decodeURIComponent(
    "https%3A%2F%2Fsearch.naver.com%2Fsearch.naver%3Fquery%3D%ED%95%9C%EA%B8%80"
  )
);
