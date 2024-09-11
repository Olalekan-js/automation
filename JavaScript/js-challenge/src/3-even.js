export default function even(range) {
  return !Array.isArray(range)
    ? range
    : range
        .map((num) => {
          if (num % 2 === 0) return num;
        })
        .filter((num) => num !== undefined)
        .join(", ");
}
