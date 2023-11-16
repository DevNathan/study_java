package arrayTest;

import java.util.Scanner;

public class ArTask2 {
	public static void main(String[] args) {
//		1번
//		Scanner sc = new Scanner(System.in);
//		char temp = 0;
//		String input = "";
//		String output = "";
//		
//		System.out.print("문자열을 입력하세요.");
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
		
		
//		2번
		String hangle = "공일이삼사오육칠팔구";
		Scanner sc = new Scanner(System.in);
		String input = null;
		String output = "";
		char temp;
		
		System.out.print("숫자를 입력하세요. : ");
		input = sc.next();
		
		for (int i = 0; i < input.length(); i++) {
			output += hangle.charAt(input.charAt(i)-48);
			
		}
		System.out.println(output);
		
	}
}
