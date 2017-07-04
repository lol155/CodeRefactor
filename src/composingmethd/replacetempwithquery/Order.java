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
		return basePrice() > 1000 ? 0.95 : 0.98;
	}

	private int basePrice() {
		return _quantity * _itemPrice;
	}
}
