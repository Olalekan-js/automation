const books = [
  {
    title: "Eloquent JavaScript",
    description: "A modern introduction to programming",
    numberOfPages: 463,
    author: "Marijn Haverbeke",
    reading: true,
  },
  {
    title: "Computer Organization and Architecture",
    description: "Designing for performance",
    numberOfPages: 881,
    author: "William Stallings",
    reading: true,
  },
  {
    title: "Digital Systems",
    description: "Principles and applications of digital systems",
    numberOfPages: 881,
    author: ["Ronald J. Tocci", "Neal S. Widmer", "Gregory L. Moss"],
    reading: true,
  },
  {
    title: "Clean Code",
    description: "This is a handbook of agile software craftmanship",
    numberOfPages: 462,
    author: "Robert C. Martin",
    reading: false,
  },
  {
    title: "Clean Architecture",
    description: "A craftman's guide to software structure and design",
    numberOfPages: 429,
    author: "Robert C. Martin",
    reading: false,
  },
];

const noOfBooks = books.length;

for (let idx = 0; idx < noOfBooks; idx++) {
  const book = books[idx];

  if (book.reading) console.log(book);
}
