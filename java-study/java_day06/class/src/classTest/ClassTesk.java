package classTest;

import java.util.Scanner;

class SuperCar {
	String brand;
	String color;
	long price;
	boolean engine;
	String password;
	int password_counter;

//	�ʱ�ȭ ���
	{
		this.password = "0000";
	}
//	static ���
	static {
		System.out.println("��� ���ϵ帳�ϴ�.");
	}

	public SuperCar() {
		;
	}

	public SuperCar(String brand, String color, long price, String password) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.password = password;
	}

	void engineON() {
		this.engine = true;
	}

	boolean checkPassword(String password) {
		return this.password.equals(password);
	}

	void engineOff() {
		this.engine = false;
	}
}

public class ClassTesk {
	public static void main(String[] args) {
		SuperCar Lambo = new SuperCar("Lambo", "yellow", 10_000, "13456");
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String password = "";

		while (choice != 3) {
			System.out.println("1. �õ� �ѱ�\t2.�õ� ����\t3.�ý��� ����");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if (!Lambo.engine) {
					System.out.print("�н����� �Է� : ");
					password = sc.next();
					if (Lambo.checkPassword(password)) {
						Lambo.engineON();
						System.out.println("�õ��� �������ϴ�.");
						Lambo.password_counter = 0;
					} else {
						Lambo.password_counter++;
						System.out.println(Lambo.password_counter + "ȸ Ʋ�Ƚ��ϴ�. 3ȸ ���н� ������ �����˴ϴ�.");
						if (Lambo.password_counter == 3) {
							System.out.println("\n" + "���� �⵿" + "\n");
							return;
						}
					}
				} else {
					System.out.println("�̹� ���� �ֽ��ϴ�.");
				}
				break;

			case 2:
				if (Lambo.engine) {
					Lambo.engineOff();
					System.out.println("�õ��� �������ϴ�.");
				} else {
					System.out.println("�̹� �õ��� �����ֽ��ϴ�.");
				}
				break;

			case 3:
				break;
			default :
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		}
	}
}
