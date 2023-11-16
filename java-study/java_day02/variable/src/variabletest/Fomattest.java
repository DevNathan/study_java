package variabletest;

public class Fomattest {
	public static void main(String[] args) {
		String name = "조남호";
		int age = 23;
		double height = 179.2;
		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d\n", age);
		System.out.printf("신장 : %.1f", height);
	}
}
