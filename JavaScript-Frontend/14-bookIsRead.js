const book = {
  title: "Eloquent JavaScript",
  description: "A modern introduction to programming",
  numberOfPages: 463,
  author: "Marijn Haverbeke",
  reading: true,
  toggleReadingStatus() {
    this.reading = !this.reading;
  },
};

book.toggleReadingStatus();
console.log(book.reading);
