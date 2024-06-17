# book_catalog_service.py
class BookCatalogService:
    def __init__(self, db):
        self.db = db
    
    def fetch_book_details(self, book_id):
        return self.db.get_book(book_id)
