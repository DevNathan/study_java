package castingTest;

class Car {
	void engineStart() {
		System.out.println("����� �õ� Ŵ");
	}
}

class SuperCar extends Car {
	void engineStart() {
		System.out.println("�������� �õ� Ŵ");
	}

	void openRoof() {
		System.out.println("���� ����");
	}
}

public abstract class CastingTest {
	public static void main(String[] args) {
		// ��ĳ����
		Car noOptionFerrari = new SuperCar();

		noOptionFerrari.engineStart();

		// �ٿ�ĳ����
		SuperCar fullOptionFerrari = (SuperCar) noOptionFerrari;
		fullOptionFerrari.engineStart();
		fullOptionFerrari.openRoof();
		
//		instanceof : ���ǽ�
//		��ü instanceof Ÿ�� : �� �Ǵ� ����
	}
}
