package classTest;

import java.util.Scanner;

class SuperCar {
	String brand;
	String color;
	long price;
	boolean engine;
	String password;
	int password_counter;

//	초기화 블록
	{
		this.password = "0000";
	}
//	static 블록
	static {
		System.out.println("출고 축하드립니다.");
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
			System.out.println("1. 시동 켜기\t2.시동 끄기\t3.시스템 종료");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if (!Lambo.engine) {
					System.out.print("패스워드 입력 : ");
					password = sc.next();
					if (Lambo.checkPassword(password)) {
						Lambo.engineON();
						System.out.println("시동이 켜졌습니다.");
						Lambo.password_counter = 0;
					} else {
						Lambo.password_counter++;
						System.out.println(Lambo.password_counter + "회 틀렸습니다. 3회 실패시 경찰에 연락됩니다.");
						if (Lambo.password_counter == 3) {
							System.out.println("\n" + "경찰 출동" + "\n");
							return;
						}
					}
				} else {
					System.out.println("이미 켜져 있습니다.");
				}
				break;

			case 2:
				if (Lambo.engine) {
					Lambo.engineOff();
					System.out.println("시동이 꺼졌습니다.");
				} else {
					System.out.println("이미 시동이 꺼져있습니다.");
				}
				break;

			case 3:
				break;
			default :
				System.out.println("다시 입력하세요.");
			}
		}
	}
}
