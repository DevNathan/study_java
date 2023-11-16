package operatortest;

import java.util.Scanner;

public class OP2 {
	public static void main(String[] args) {
//		대소 비교하기
		Scanner sc = new Scanner(System.in);
		int num1 =0, num2=0;
		String result=null;
		String aa = "값 넣어.";
		
		System.out.println(aa);
		num1 =sc.nextInt();
		System.out.println(aa);
		num2 =sc.nextInt();
	
		result = num1 > num2 ? "더 큰 값 : " + num1 : num1 == num2 ? "두 수는 같습니다." : "더 큰 값 : " + num2;
		System.out.println(result);
	}
}
