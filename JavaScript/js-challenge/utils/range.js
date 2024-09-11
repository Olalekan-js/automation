export default function range(start = 0, end = 0) {
  if (start === end) return start;
  return Array.from({ length: end - start + 1 }, (_, idx) => start + idx);
}
