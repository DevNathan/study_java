package exceptionTest;

public class ExceptionTest {
	public static void main(String[] args) {
		int[] arData = new int[11];

		try {
			System.out.println(arData[10]);
			System.out.println("성공!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실패..");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
