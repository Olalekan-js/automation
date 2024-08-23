let result = "";

for (let num = 0; num <= 20; num++) {
  if (num % 2 !== 0) result += num + (20 - num > 1 ? ", " : "");
}
console.log(result);
