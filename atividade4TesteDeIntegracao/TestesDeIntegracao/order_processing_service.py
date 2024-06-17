# order_processing_service.py
class OrderProcessingService:
    def __init__(self, db):
        self.db = db
    
    def place_order(self, user_id, book_id):
        book = self.db.get_book(book_id)
        if book:
            return f"Order placed for user {user_id} for book {book_id}"
        else:
            return "Book not available"
