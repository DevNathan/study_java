package methodTest;

import java.util.Scanner;

import com.sun.jdi.Method;

public class MethodTest {
	int add(int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		int result = mt.add(10, 20);
		System.out.println(result);
	}
}