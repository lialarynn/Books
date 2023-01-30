/**
 * @author Lia Kruger - alkruger2
 * CIS175 - Spring 2023
 * Jan 29, 2023
 */
package model;

public class Books {

		// instance variables
		private String title;
		private String author;
		private int isbn;
		private double price;
		
		// getters and setters
		public String getTitle() {
			return title;
		}
		
		public void setTitle(String newTitle) {
			this.title = newTitle;
		}
		
		public String getAuthor() {
			return author;
		}
		
		public void setAuthor(String newAuthor) {
			this.author = newAuthor;
		}
		
		public int getIsbn() {
			return isbn;
		}
		
		public void setIsbn(int newIsbn) {
			this.isbn = newIsbn;
		}
		
		public double getPrice() {
			return price;
		}
		
		public void setPrice(double newPrice) {
			this.price = newPrice;
		}
		
		// default no arg constructor
		public static void main(String[] args) {
		}
		
}
