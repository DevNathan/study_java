package controllTest;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 =0, num2=0;
		String aa = "�� �־�.";
		String result = null;
		
		System.out.println(aa);
		num1 =sc.nextInt();
		System.out.println(aa);
		num2 =sc.nextInt();
	
		if(num1 > num2) {
			result = "�� ū ���� : "+num1;
		}
		else if(num1 < num2) {
			result = "�� ū ���� : "+num2;
		}
		else result = "�� ���� ����";
		
		System.out.println(result);
	}
}
