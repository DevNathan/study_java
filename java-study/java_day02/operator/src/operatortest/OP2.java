package operatortest;

import java.util.Scanner;

public class OP2 {
	public static void main(String[] args) {
//		��� ���ϱ�
		Scanner sc = new Scanner(System.in);
		int num1 =0, num2=0;
		String result=null;
		String aa = "�� �־�.";
		
		System.out.println(aa);
		num1 =sc.nextInt();
		System.out.println(aa);
		num2 =sc.nextInt();
	
		result = num1 > num2 ? "�� ū �� : " + num1 : num1 == num2 ? "�� ���� �����ϴ�." : "�� ū �� : " + num2;
		System.out.println(result);
	}
}
