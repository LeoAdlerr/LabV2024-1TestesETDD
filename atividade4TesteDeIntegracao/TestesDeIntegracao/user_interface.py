# user_interface.py
class UserInterface:
    def __init__(self, book_service, order_service):
        self.book_service = book_service
        self.order_service = order_service
    
    def display_book(self, book_id):
        return self.book_service.fetch_book_details(book_id)
    
    def order_book(self, user_id, book_id):
        return self.order_service.place_order(user_id, book_id)
