package inputtest;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
		// 3개의 정수를 한번에 입력 받고 곱셈 next만 출력
		String mess1 = "세 개의 정수 입력(0 0 0) : ", resmess1 = "%d x %d x %d = %d";
		int num1=0, num2=0, num3=0, result=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(mess1);
		num1 = Integer.parseInt(sc.next());
		num2 = Integer.parseInt(sc.next());
		num3 = Integer.parseInt(sc.next());
		
		result = num1 * num2 * num3;
		
		System.out.printf(resmess1, num1, num2, num3, result);
		
	}
}
