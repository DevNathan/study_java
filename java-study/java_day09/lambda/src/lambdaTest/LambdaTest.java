package lambdaTest;

public class LambdaTest {
	public static void main(String[] args) {
//		�Լ��� �������̽��� ��� �������̵� ��ų �� ������ �̴� ���ٽ����� ��ü ����
//		LambdaInter lambdaInter = new LambdaInter() {
//			
//			@Override
//			public boolean checkMultipleOf10(int number) {
//				return number % 10 == 0;
//			}
//		};
		
		LambdaInter lambdaInter = (num) -> {return num % 10 == 0;};
		
		System.out.println(lambdaInter.checkMultipleOf10(21));
	}
}
