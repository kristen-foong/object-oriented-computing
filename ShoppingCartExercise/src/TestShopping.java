
public class TestShopping {

	public static void main(String[] args) {
		Item apples = new Item("Granny Smith", 0.21, 12);
		Item potatoes = new Item("Yukon Gold", 0.10, 5);
		ShoppingCart cart1 = new ShoppingCart();
		cart1.add(apples);
		cart1.add(potatoes);
		System.out.println(cart1);
	}

}
