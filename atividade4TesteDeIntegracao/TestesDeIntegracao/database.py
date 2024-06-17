# database.py
class Database:
    def __init__(self):
        self.books = {}
    
    def add_book(self, book_id, details):
        self.books[book_id] = details
    
    def get_book(self, book_id):
        return self.books.get(book_id)
