package classTest;

class Merchant {
	String product_name;
	long price;
	int stock;

	public Merchant(String product_name, long price, int stock) {
		super();
		this.product_name = product_name;
		this.price = price;
		this.stock = stock;
	}

	void sell(Customer customer) {
		int saled_price;
		saled_price = (int) (price -  price * (customer.discount/100.0));
		if (customer.value_in_account >= saled_price) {
			customer.value_in_account -= saled_price;
			System.out.println("결제되었습니다.");
			stock--;
		} else {
			System.out.println("결제가 취소되었습니다.");
		}
	}}

class Customer {
	String name;
	String phone_number;
	long value_in_account;
	int discount;

	public Customer(String name, String phone_number, long value_in_account, int d) {
		super();
		this.name = name;
		this.phone_number = phone_number;
		this.value_in_account = value_in_account;
		discount = d;
	}
}

public class ClassTask3 {
	public static void main(String[] args) {
		Merchant 과일가게 = new Merchant("사과박스", 9000, 10);
		Customer 조남호 = new Customer("조남호", "010-3631-6448", 9000, 5);

		과일가게.sell(조남호);
		System.out.println("남은 돈 : " + 조남호.value_in_account);
		System.out.println("남은 재고 : " + 과일가게.stock);
	}
}