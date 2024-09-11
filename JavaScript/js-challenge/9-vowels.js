export default function countVowelLetters(str) {
  let count = 0;
  const vowels = ["a", "e", "i", "o", "u"];
  for (let i = 0; i < str.length; i++) {
    let char = str[i];
    if (vowels.includes(char)) count += 1;
  }

  return count;
}
