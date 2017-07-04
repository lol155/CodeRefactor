package composingmethod.extractmethod;

import java.util.Enumeration;
/**
 * 
 * @author lenovo
 * 1. for print banner, [Extract Method]
 * 2. for calculate outstanding,  move statement of "Enumeration e and double outstanding", [Extract Method]
 * 3. for print details, [Extract Method]
 */
public class Printer {
	private Orders _orders;
	private String _name;

	void printOwing() {
		Enumeration e = _orders.elements();
		double outstanding = 0.0;
		
		printBanner();
		
		// calculate outstanding
		while (e.hasMoreElements()) {
			Order each = (Order) e.nextElement();
			outstanding += each.getAmount();
		}
		printDetails(outstanding);


	}

	private void printDetails(double outstanding) {
		System.out.println("name:" + _name);
		System.out.println("amount" + outstanding);
	}

	private void printBanner() {
		System.out.println("**************************");
		System.out.println("***** Customer Owes ******");
		System.out.println("**************************");
	}
}

class Order {

	public double getAmount() {
		return 0;
	}
	
}

class Orders {

	public Enumeration elements() {
		return null;
	}
	
}