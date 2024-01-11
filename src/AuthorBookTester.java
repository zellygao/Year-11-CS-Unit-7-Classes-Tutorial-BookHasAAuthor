import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class AuthorBookTester {

    Author author;
    Book book;

    public void setUp() {
        author = new Author("Philip K Dick", "pkd@gmail.com", 'm');
        book = new Book("The Man in the High Castle", author, 100, 10);
    }

    public void tearDown() {
        author = null;
        book = null;
    }

    @Test
    public void testAuthorConstructorName() {
        setUp();
        assertTrue(author.getName().equals("Philip K Dick"), "Ensure that your constructor in your Author class has been implemented correctly!");
        tearDown();
    }

    @Test
    public void testAuthorConstructorEmail() {
        setUp();
        assertTrue(author.getEmail().equals("pkd@gmail.com"), "Ensure that your constructor in your Author class has been implemented correctly!");
        tearDown();
    }

    @Test
    public void testAuthorConstructorGender() {
        setUp();
        assertTrue(author.getGender() == 'm', "Ensure that your constructor in your Author class has been implemented correctly!");
        tearDown();
    }

    @Test
    public void testAuthorSetEmail() {
        setUp();
        author.setEmail("pkd@cis.edu.hk");
        assertTrue(author.getEmail().equals("pkd@cis.edu.hk"), "Ensure that your setEmail method in your Author class has been implemented correctly!");
        tearDown();
    }

    @Test
    public void testAuthorToString() {
        setUp();
        assertTrue(author.toString().equals("Philip K Dick (m) at pkd@gmail.com"), "Ensure that your constructor in your Author class has been implemented correctly!");
        tearDown();
    }

    @Test
    public void testBookConstructorName() {
        setUp();
        assertTrue(book.getName().equals("The Man in the High Castle"), "Ensure that your constructor in your Book class has been implemented correctly!");
        tearDown();
    }

    @Test
    public void testBookConstructorAuthor() {
        setUp();
        assertTrue(book.getAuthor().toString().equals("Philip K Dick (m) at pkd@gmail.com"), "Ensure that your constructor in your Book class has been implemented correctly!");
        tearDown();
    }

    @Test
    public void testBookConstructorPrice() {
        setUp();
        assertTrue(book.getPrice() == 100, "Ensure that your constructor in your Book class has been implemented correctly!");
        tearDown();
    }

    @Test
    public void testBookConstructorQuantity() {
        setUp();
        assertTrue(book.getQty() == 10, "Ensure that your constructor in your Book class has been implemented correctly!");
        tearDown();
    }

    @Test
    public void testBookGetName() {
        setUp();
        assertTrue(book.getName().equals("The Man in the High Castle"), "Ensure that your getName method in your Book class has been implemented correctly!");
        tearDown();
    }

    @Test
    public void testBookGetAuthor() {
        setUp();
        assertEquals("Philip K Dick (m) at pkd@gmail.com", book.getAuthor().toString(), "Ensure that your getAuthor method in your Book class has been implemented correctly!");
        tearDown();
    }

    @Test
    public void testBookGetPrice() {
        setUp();
        assertTrue(book.getPrice() == 100, "Ensure that your getPrice method in your Book class has been implemented correctly!");
        tearDown();
    }

    @Test
    public void testBookSetPrice() {
        setUp();
        book.setPrice(150);
        assertTrue(book.getPrice() == 150, "Ensure that your setPrice method in your Book class has been implemented correctly!");
        tearDown();
    }

    @Test
    public void testBookGetQty() {
        setUp();
        assertTrue(book.getQty() == 10, "Ensure that your getQty method in your Book class has been implemented correctly!");
        tearDown();
    }

    @Test
    public void testBookSetQty() {
        setUp();
        book.setQty(20);
        assertTrue(book.getQty() == 20, "Ensure that your setQty method in your Book class has been implemented correctly!");
        tearDown();
    }

    @Test
    public void testBookToString() {
        setUp();
        assertEquals("'The Man in the High Castle' by Philip K Dick (m) at pkd@gmail.com", book.toString(), "Ensure that your toString method in your Book class has been implemented correctly!");
        tearDown();
    }

}
