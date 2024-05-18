package week03;

public class week03Labs {

	 static double orderTotal(double product1, double product2, double product3, double taxRate) {
	        // Calculate the total price of the products
	        double subtotal = product1 + product2 + product3;
	        System.out.println(subtotal);

	        // Calculate the tax amount
	        double taxAmount = subtotal * (taxRate);
	        System.out.println(taxAmount);

	        // Calculate the total order price with tax
	        double totalOrderPrice = subtotal + taxAmount;

	        return totalOrderPrice;
	    }

	    public static void main(String[] args) {
	        double product1, product2, product3, taxRate;
	        product1 = 19.99;
	        product2 = 22.00;
	        product3 = 4.55;
	        taxRate = .07;
	        System.out.println("Your order total is: $" + String.format("%,.2f", orderTotal(product1, product2, product3, taxRate)));
	    }
	}