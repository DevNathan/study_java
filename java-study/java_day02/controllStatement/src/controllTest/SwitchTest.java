package controllTest;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu1=0;
		String print1 = "������ : �Ұ��� �������̰� �������̴�.";
		String print2 = "����� : Ȱ���ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.";
		String print3 = "������ : �����ϰ� ����ϰ� ��ö�ϰ� ������.";
		String print4 = "��� : õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.";
		String print5 = "�ٽ� �Է��ض� �ƽ���";
		String result = null;
		System.out.println("����� �����ϴ� ���� �����ϼ���.\n1. ������\n2. �����\n3. ������\n4. ���\n");
		menu1 = sc.nextInt();
		
		switch (menu1) {
		case 1 : result = print1; break;
		case 2 : result = print2; break;
		case 3 : result = print3; break;
		case 4 : result = print4; break;
		default : result = print5;
		}
		
		System.out.println(result);
	}
}
