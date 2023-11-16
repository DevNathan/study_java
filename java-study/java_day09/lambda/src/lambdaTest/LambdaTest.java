package lambdaTest;

public class LambdaTest {
	public static void main(String[] args) {
//		함수형 인터페이스를 열어서 오버라이드 시킬 수 있으나 이는 람다식으로 대체 가능
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
