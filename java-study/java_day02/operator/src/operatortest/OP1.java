package operatortest;

public class OP1 {
	public static void main(String[] args) {
		
		boolean isTrue = 10 != 11;
		
		
		System.out.println(10 == 11);
		System.out.println(isTrue && 10 == 10);
		System.out.println(isTrue && 10 != 10);
		System.out.println(isTrue || 10 == 10);
		
		System.out.println(isTrue && !(10 != 10));
	}
}
