package inputtest;

import java.util.Scanner;

public class InputTest1 {
	public static void main(String[] args) {
//		두 정수를 입력한 뒤 덧샘 결과 출력
//		단 next()만 사용할 것
		Scanner sc = new Scanner(System.in);
		String message1 = "첫 번째 값을 입력해주세요. : ", message2 = "두 번째 값을 입력해주세요. : ",
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
