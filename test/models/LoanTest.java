package models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import utilities.GenderType;

import java.time.LocalDate;

public class LoanTest {

	//VG
	@Test
	public void testDueDate() {
		Customer cust1 = new Customer("Mrs","Xiaoyan","Widhe Li","Barytongatan 12","111222","xioayan@gmail.com",1, GenderType.FEMALE);
		Book book1 = new Book(25,"Java","Tom","123456789101","program",0);
		Loan loan= new Loan(1,cust1,book1);
		assertEquals(loan.getDueDate(),LocalDate.now().plusDays(14));
   }
}