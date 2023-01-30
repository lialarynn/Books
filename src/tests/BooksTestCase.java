/**
 * @author Lia Kruger - alkruger2
 * CIS175 - Spring 2023
 * Jan 29, 2023
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.BooksLogic;
import model.Books;

public class BooksTestCase {
	BooksLogic bksL = new BooksLogic();
	Books books = new Books();
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testCalculatePriceWithTax() {
		books.setPrice(32);
		double priceWithTax = bksL.calculatePriceWithTax(books);
		assertEquals(33.92, priceWithTax, 0.0); 
	}
	
	@Test 
	public void testPriceWithSale() {
		books.setPrice(40);
		double salesPrice = bksL.priceWithSale(books);
		assertEquals(30, salesPrice, 0.0);
	}
	
	@Test
	public void testIsLowCost() {
		books.setPrice(11.50);
		assertTrue(bksL.isLowCost(books));
	}
	
	@Test
	public void testIsNotLowCost() {
		books.setPrice(46.75);
		assertFalse(bksL.isLowCost(books));
	}
}
