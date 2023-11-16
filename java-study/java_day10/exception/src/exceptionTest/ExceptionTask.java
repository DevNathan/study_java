package exceptionTest;

import java.util.Iterator;
import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
//	5���� ������ �Է� �ޱ�
//		- ���� �Է� ���·� ����
//		- q�Է� �� ������
//		- �� ������ �迭�� ���
//		- if���� �� �� �� ����ϱ�
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int count = 0;

		while (true) {
			System.out.print(count + 1 + "��° ���� �Է� : ");
			String temp = sc.next();
			if (temp.equals("q")) {
				break;
			}

			try {
				num[count] = Integer.parseInt(temp);
			} catch (NumberFormatException e) {
				System.out.println("������ �Է����ּ���.");
				count--;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("5���� ������ �Էµ˴ϴ�.");
				break;
			} catch (Exception e) {
				System.out.println("�� �� ���� ����");
				count--;
			}
			count++;
		}

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

//		try {
//			System.out.println("5���� ���� �Է��ϱ� / q �Է½� ����");
//			for (int i = 0;; i++) {
//				String input = sc.next();
//				if (input.equals("q")) {
//					break;
//				} else {
//					num[i] = Integer.parseInt(input);
//					count++;
//				}
//			}
//			for (int i = 0; i < count; i++) {
//				System.out.println(num[i]);
//			}
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("5���� �Է����ּ���.");
//		}
	}
}
