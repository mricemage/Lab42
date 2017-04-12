/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyApp;

public class main {
    public static void main(String[] args) { 
    	Product product = new Product("Edam", 3.3, 120, 5);
    	System.out.println("Product value is " + product.countValue());
    	product.printProduct();
        product.priceChange();
     }
}

 class Product {
	private String name;
	private double price;
	private int amount; //Amount in storage
        private double pricechanged;
	public Product(String name, double price, int amount, double pricechanged) {
		this.name = name;
		this.price = price;
		this.amount = amount;
                this.pricechanged = pricechanged; 
	}
	public double countValue() {
		return(amount * price);
	}
 
	public void printProduct() {
		System.out.printf("Product %s, price %4.1f and balance %d pcs", name,price,amount);
	}
        
        public void priceChange() {
                System.out.printf("If the price has changed to %4.1f, the product value will be %s", pricechanged, amount*pricechanged);
        }
}
