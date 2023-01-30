/**
 * @author Lia Kruger - alkruger2
 * CIS175 - Spring 2023
 * Jan 29, 2023
 */
package model;

public class BooksLogic {
	
	public double calculatePriceWithTax(Books books) {
		double priceWithTax = 0;
		priceWithTax = (books.getPrice() * .06) + books.getPrice();
		return priceWithTax;
	}
	
	public double priceWithSale(Books books) {
		double salesPrice = 0;
		salesPrice = books.getPrice() - (books.getPrice() * .25);
		return salesPrice;
	}
	
	public boolean isLowCost(Books books) {
		boolean lowCost = false;
		
		if (books.getPrice() <= 15) {
			lowCost = true;
		} else {
			lowCost = false;
		}
		return lowCost;
	}

}
