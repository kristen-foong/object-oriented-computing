import java.text.NumberFormat;
import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<Item> cart = new ArrayList<Item>();
	private double totalPrice;
	
	public ShoppingCart() {
		cart = new ArrayList<Item>();
		totalPrice = 0;
	}

	public int getSize() {
		return cart.size();
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void add(Item a) {
		cart.add(a);
		totalPrice += a.getPrice() * a.getQuantity();
	}

	public void remove(Item a) {
		cart.remove(a);
		totalPrice -= a.getPrice() * a.getQuantity();
	}

	public boolean isEmpty() {
		return cart.isEmpty();
	}

	public String toString() {
		String str = "Shopping Cart\n\n";
		str += "Items\t\t\tUnit Price\tQuantity\tTotal\n\n";
		for(Item curr: cart) {
			str += curr.toString();
		}
		str += "\nTotal Price: $" + this.totalPrice;
		return str;
	}

}
