package inputtest;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = null, firstName = null, lastName = null;
		
		System.out.print("�̸� : ");
		name = sc.next();	
		/*
		 * lastName = sc.next(); firstName = sc.next();
		 */
		
//		name = lastName + firstName;
		System.out.println(name + "�� ȯ���մϴ�");	
	}
}
