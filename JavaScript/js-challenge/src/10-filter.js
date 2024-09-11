export default function filterNegative(arr) {
  const resArr = [];

  for (let idx = 0; idx < arr.length; idx++) {
    arr[idx] >= 0 ? resArr.push(arr[idx]) : "";
  }
  return resArr;
}
