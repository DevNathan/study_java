package operatortest;

import java.util.Scanner;

public class OP4 {
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
		
		result = menu1 == 1 ? print1
				: menu1 == 2? print2
						: menu1 == 3? print3
								:menu1 ==4? print4
										: print5;

		System.out.println(result);
	}
}
