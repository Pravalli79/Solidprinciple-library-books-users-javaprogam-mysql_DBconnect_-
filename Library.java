import java.util.ArrayList;

public class Library {
    BookDAO db = new BookDAO();

    Library() {}

    void addBook(String name, String publisherName) {
        Book book = new Book(name, publisherName, "TEST");
        db.addBook(book);
    }
    
    void searchBook(Book book) {}
    
    ArrayList<Book> searchBook(String bookName) {
        ArrayList<Book> books = db.searchBooks(bookName);
        return books;
    }

    void addUser(String name, String phoneNumber) {
        User user = new User(name, phoneNumber, "8680244223");
        db.addUser(user);
    }
    
    void searchUser(User user) {}
    
    ArrayList<User> searchUser(String userName) {
        ArrayList<User> User = db.searchUsers(userName);
        return User;
    }

}
