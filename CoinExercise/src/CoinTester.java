
public class CoinTester {

	public static void main(String[] args) {
		MonetaryCoin m1 = new MonetaryCoin(2);
		System.out.println(m1);
		for(int i = 0; i < 10; i++) {
			m1.flip();
			System.out.println(m1);
		}
	}

}
