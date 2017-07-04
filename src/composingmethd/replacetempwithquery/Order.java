package composingmethd.replacetempwithquery;
/**
 * 
 * @author lenovo
 * 1. for basePrice,  [Extract Method] + [Inline] --> basePrice->basePrice()
 * 2. for discountFactor, [Extract Method] + [Inline] --> discountFactor->discountFactor()
 */
public class Order {
	private int _quantity;
	private int _itemPrice;

	double getPrice() {
		return basePrice() * discountFactor();
	}

	private double discountFactor() {
		double discountFactor;
		if (basePrice() > 1000)
			discountFactor = 0.95;
		else
			discountFactor = 0.98;
		return discountFactor;
	}

	private int basePrice() {
		return _quantity * _itemPrice;
	}
}
