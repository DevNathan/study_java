package arrayTest;

import java.util.Scanner;

public class ArTask2 {
	public static void main(String[] args) {
//		1��
//		Scanner sc = new Scanner(System.in);
//		char temp = 0;
//		String input = "";
//		String output = "";
//		
//		System.out.print("���ڿ��� �Է��ϼ���.");
//		input = sc.next();
//		
//		
//		for (int i = 0; i < input.length(); i++) {
//			temp = input.charAt(i);
//			if (( 65 <= temp) && (temp <= 90)) {
//				output += (char)(temp + 32);
//			}
//			else if ((97 <= temp && temp <= 122)) {
//				output += (char)(temp - 32);
//			}
//			else {
//				output += (char)(temp);
//			}
//		}
//		System.out.println(output);
		
		
//		2��
		String hangle = "�����̻�����ĥ�ȱ�";
		Scanner sc = new Scanner(System.in);
		String input = null;
		String output = "";
		char temp;
		
		System.out.print("���ڸ� �Է��ϼ���. : ");
		input = sc.next();
		
		for (int i = 0; i < input.length(); i++) {
			output += hangle.charAt(input.charAt(i)-48);
			
		}
		System.out.println(output);
		
	}
}
