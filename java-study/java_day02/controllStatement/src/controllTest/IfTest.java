package controllTest;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 =0, num2=0;
		String aa = "값 넣어.";
		String result = null;
		
		System.out.println(aa);
		num1 =sc.nextInt();
		System.out.println(aa);
		num2 =sc.nextInt();
	
		if(num1 > num2) {
			result = "더 큰 값은 : "+num1;
		}
		else if(num1 < num2) {
			result = "더 큰 값은 : "+num2;
		}
		else result = "두 값은 같음";
		
		System.out.println(result);
	}
}
