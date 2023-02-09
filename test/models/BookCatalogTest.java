package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BookCatalogTest {

	private BookCatalog bc;
	private Book book1;

	public BookCatalogTest() {
		bc = new BookCatalog();
		book1 = new Book(1,"Learning Java","","","",0);
		bc.addBook(book1);
	}

	//G
	@Test
	public void testAddABook() {
		Book myBook = new Book(2,"Rasing a kid","","","",0);
		int before = bc.getNumberOfBooks();
		bc.addBook(myBook);
		int after = bc.getNumberOfBooks();
		assertEquals(before+1,after);

	}

	//G
	@Test
	public void testFindBook() {
		try {
			Book bookFound = bc.findBook("Learning Java");
			assertEquals(bookFound, book1);
		}
		catch (Exception e) {
			fail("Could not find book");
		}

	}

	//G
	@Test
	public void testFindBookIgnoringCase() {
		try {
			Book bookFound = bc.findBook("learning java");
			assertEquals(bookFound, book1);
		}
		catch (Exception e) {
			fail("Could not find book");
		}

	}

	//G
	@Test
	public void testFindBookWithExtraSpaces() {
		try {
			Book bookFound = bc.findBook("     Learning Java  ");
			assertEquals(bookFound, book1);
		}
		catch (Exception e) {
			fail("Could not find book");
		}

	}

	//VG
	// This test should throw BookNotFoundException in order to pass.
	@Test
	public void testFindBookThatDoesntExist() throws BookNotFoundException {
		assertThrows(BookNotFoundException.class,
					() -> bc.findBook("NotExistBook"),
				"Expected BookNotFoundException to be thrown, but it wasn't");
		
	}

}
