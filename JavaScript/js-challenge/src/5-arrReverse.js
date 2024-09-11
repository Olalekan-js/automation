/**
 * revereArray - reverses the order of elements in the given array
 *               It performs the reverse operation in place.
 */

export default function revereArray(array) {
  const len = array.length;

  for (let idx = 0; idx < Math.floor(len / 2); idx++) {
    // Retrieve the first element of the given array
    // and store in temporary, tmp variable
    const tmp = array[idx];

    // Override the elements at left half with
    // the elements at right half of the array
    array[idx] = array[len - 1 - idx];

    // Override the elements at right half with
    // the elements at left half of the array
    array[len - 1 - idx] = tmp;
  }
}
