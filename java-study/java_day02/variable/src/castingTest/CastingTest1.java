package castingTest;

public class CastingTest1 {
	public static void main(String[] args) {
		double num1 = 8.43, num2 = 2.59;
		int result = 0;
		
		System.out.println(5/2);
		System.out.println(5.0/2);
		
		System.out.println(5/(double)2);
		System.out.println((int)8.43 + 2.59);
		System.out.println((int)(8.43 + 2.59));
		
		System.out.println((int)num1 + (int)num2);
		
		result = (int)num1 + (int)num2;
		System.out.printf("°ªÀº : %d",result);
	}
}
