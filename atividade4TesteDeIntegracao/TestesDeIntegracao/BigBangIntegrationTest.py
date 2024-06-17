import unittest
from database import Database
from book_catalog_service import BookCatalogService
from order_processing_service import OrderProcessingService
from user_interface import UserInterface

class BigBangIntegrationTest(unittest.TestCase):

    def testEndToEndFunctionality(self):
        db = Database()
        bcs = BookCatalogService(db)
        ops = OrderProcessingService(db)
        ui = UserInterface(bcs, ops)
        
        book_id = "123"
        book_details = {"title": "Python Programming", "author": "John Doe"}
        user_id = "user1"
        
        db.add_book(book_id, book_details)
        
        fetched_details = ui.display_book(book_id)
        self.assertEqual(fetched_details, book_details)
        
        order_result = ui.order_book(user_id, book_id)
        self.assertEqual(order_result, f"Order placed for user {user_id} for book {book_id}")

if __name__ == "__main__":
    unittest.main()
