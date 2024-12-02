class Book:
    def __init__(self, title, pages):
        
        self.title = title
        self.pages = pages

    def __add__(self, other):

        if isinstance(other, Book):
            return Book(f"{self.title} & {other.title}", self.pages + other.pages)
        return NotImplemented

    def __sub__(self, other):

        if isinstance(other, Book):
            return abs(self.pages - other.pages)
        return NotImplemented

    def __str__(self):
        
        return f"'{self.title}' with {self.pages} pages"

if __name__ == "__main__":
    print("Name : Sameer\nClass : M.Sc(IT) - 3rd Sem\n")

    book1 = Book("Python Programming", 300)
    book2 = Book("Data Science", 250)

    combined_book = book1 + book2
    print(f"Combined Book: {combined_book}")
    
    page_difference = book1 - book2
    print(f"Difference in pages: {page_difference}")