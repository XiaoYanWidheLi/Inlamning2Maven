package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {

	//G
	@Test
	public void test2EqualBooks() {
		Book book1 = new Book(1,"Learning Java","","","",0);
		Book book2 = new Book(1,"Rasing a kid","","","",0);
		assertEquals(book1, book2);
	}

	//G
	@Test
	public void test2NonEqualBooks() {
		Book book1 = new Book(1,"Learning Java","","","",0);
		Book book2 = new Book(2,"Rasing a kid","","","",0);
		assertEquals(book1, book2);
	}
}
