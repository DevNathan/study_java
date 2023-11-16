package inheritanceTest;

class Car {
	String brand;
	String color;
	int price;

	public Car() {
		;
	}

	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	void engineStart() {
		System.out.println("���� �õ� ����");
	}

	void engineStop() {
		System.out.println("���� �õ� ����");
	}
}

class SuperCar extends Car {
	String mode;

	public SuperCar() {
		;
	}

	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}

	@Override
	void engineStart() {
		System.out.println("���� �õ� ����");
	}

	@Override
	void engineStop() {
		System.out.println("���� �õ� ����");
	}

}

public class InheritanceTask1 {
	public static void main(String[] args) {
		SuperCar lambo = new SuperCar("Lambor", "red", 70_000, "sports");

		lambo.engineStart();
		lambo.engineStop();

	}
}
