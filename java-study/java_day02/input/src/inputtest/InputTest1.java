package inputtest;

import java.util.Scanner;

public class InputTest1 {
	public static void main(String[] args) {
//		�� ������ �Է��� �� ���� ��� ���
//		�� next()�� ����� ��
		Scanner sc = new Scanner(System.in);
		String message1 = "ù ��° ���� �Է����ּ���. : ", message2 = "�� ��° ���� �Է����ּ���. : ",
				resultMess = "%d + %s = %d";
		int num1 = 0;
		String num2 = null;
		int result = 0;
		
		System.out.print(message1);
		num1 = Integer.parseInt(sc.next());
		
		System.out.print(message2);
		num2 = sc.next();
		
		 result = num1 + (Integer.parseInt(num2));
		System.out.printf(resultMess, num1 , num2, result);
	}
}
