let result = "";

for (let num = 0; num <= 20; num++) {
  // Format output with space and comma
  // separator but ignore if the last member
  if (num % 2 !== 0) result += num + (20 - num > 1 ? ", " : "");
}
console.log(result);
