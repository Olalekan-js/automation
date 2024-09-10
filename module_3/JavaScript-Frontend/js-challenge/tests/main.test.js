import range from "../utils/range.js";
import even from "../src/3-even.js";
import sum from "../src/1-sum.js";
import revereArray from "../src/5-arrReverse.js";

const array = range(1, 17);
console.log(array);
revereArray(array);
console.log("Reverse Operation done");
console.log(array);

console.log(even(range(0, 100)));
console.log(sum(range(1, 10)));
