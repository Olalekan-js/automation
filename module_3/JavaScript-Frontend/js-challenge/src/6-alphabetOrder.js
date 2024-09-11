/**
 * arrangeAlphabeticalOrder - orders words array in alphabetical order
 *
 * @param {string|string[]} arr
 * @returns {string[]}
 */

export default function arrangeAlphabeticalOrder(arr) {
  return arr.sort((a, b) => {
    // Ignore both uppercase and lowercase letters
    if (a.toLowerCase() < b.toLowerCase()) {
      return -1;
    }
  });
}
