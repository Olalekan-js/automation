import range from "../utils/range.js";
import even from "../src/3-even.js";
import sum from "../src/1-sum.js";
import revereArray from "../src/5-arrReverse.js";
import arrangeAlphabeticalOrder from "../src/6-alphabetOrder.js";
import sortNumber from "../src/7-sortNumber.js";
import isDivisibleBy10 from "../src/8-isDivisibleBy10.js";
import countVowelLetters from "../src/9-vowels.js";
import filterNegative from "../src/10-filter.js";

const arr = [3, -2, 0, 10, -4, -5, -1];
const words = ["banana", "Banana", "Apple", "cat", "car", "aPP"];
const result = filterNegative(arr);
// console.log(result);
console.log(arrangeAlphabeticalOrder(words));
// console.log(countVowelLetters("Nobody cares!"));

// const array = [2, 1, -3, 0.5, 5, -1];
// console.log(sortNumber(array));
// console.log(isDivisibleBy10(5));
// console.log(isDivisibleBy10(10));
// console.log(isDivisibleBy10(15));
// console.log(isDivisibleBy10(20));
// console.log(array);
// revereArray(array);
// console.log("Reverse Operation done");
// console.log(array);

// console.log(even(range(0, 100)));
// console.log(sum(range(1, 10)));
