package castingTest;

class Car {
	void engineStart() {
		System.out.println("열쇠로 시동 킴");
	}
}

class SuperCar extends Car {
	void engineStart() {
		System.out.println("음성으로 시동 킴");
	}

	void openRoof() {
		System.out.println("지붕 열기");
	}
}

public abstract class CastingTest {
	public static void main(String[] args) {
		// 업캐스팅
		Car noOptionFerrari = new SuperCar();

		noOptionFerrari.engineStart();

		// 다운캐스팅
		SuperCar fullOptionFerrari = (SuperCar) noOptionFerrari;
		fullOptionFerrari.engineStart();
		fullOptionFerrari.openRoof();
		
//		instanceof : 조건식
//		객체 instanceof 타입 : 참 또는 거짓
	}
}
