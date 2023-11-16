package operatortest;

import java.util.Scanner;

public class OP3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = 0;
		double result = 0;
		boolean n1;
		String mess1 = "값 입력하면 값 보여줌 : ", format = null;
		
		System.out.print(mess1);
		num1 = sc.nextDouble();
		
		n1 = num1 - (int)num1 == 0;
		
		format = n1 ? "%.0f" : "%.2f";
		format += "\n";
		
		System.out.printf(format, num1);
		
	}
}