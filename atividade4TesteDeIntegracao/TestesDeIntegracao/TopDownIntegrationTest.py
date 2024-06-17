import unittest
from unittest.mock import Mock, MagicMock
from user_interface import UserInterface

class TopDownIntegrationTest(unittest.TestCase):

    def testDisplayBook(self):
        book_service = Mock()
        book_service.fetch_book_details.return_value = {"title": "Python Programming", "author": "John Doe"}
        ui = UserInterface(book_service, None)
        
        book_id = "123"
        result = ui.display_book(book_id)
        self.assertEqual(result, {"title": "Python Programming", "author": "John Doe"})

    def testPlaceOrder(self):
        order_service = Mock()
        order_service.place_order.return_value = "Order placed for user user1 for book 123"
        ui = UserInterface(None, order_service)
        
        user_id = "user1"
        book_id = "123"
        result = ui.order_book(user_id, book_id)
        self.assertEqual(result, "Order placed for user user1 for book 123")

if __name__ == "__main__":
    unittest.main()
