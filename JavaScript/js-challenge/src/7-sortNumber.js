/**
 * sortNumber - orders array of numbers in descending order by default
 *
 * @param {number|number[]} arr
 * @param {string} order
 * @returns {number[]}
 */

export default function sortNumber(arr, order = "desc") {
  if (order === "asc") return arr.sort((a, b) => a - b);
  return arr.sort((a, b) => b - a);
}
