/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyApp;

public class main {
    public static void main(String[] args) { 
    	Product product = new Product("Edam", 3.3, 120, 160);
    	System.out.println("Product value is " + product.countValue());
    	product.printProduct();
        product.changeBalance();
     }
}

 class Product {
	private String name;
	private double price;
	private int amount; //Amount in storage
        private int newvalue;
	public Product(String name, double price, int amount, int newvalue) {
		this.name = name;
		this.price = price;
		this.amount = amount;
                this.newvalue = newvalue;
                
	}
	public double countValue() {
		return(amount * price);
	}
 
	public void printProduct() {
		System.out.printf("Product %s, price %4.1f and balance %d pcs \t", name,price,amount);
	}
        
        public void changeBalance() {
                
                System.out.printf("Product has increased to %d pcs", newvalue);
        }
}
