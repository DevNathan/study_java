package controllTest;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		int i, j, num1 = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
//		1��
//		for(i=0;i<100;i++) {
//			System.out.println(i+1);
//		}
	
//		2��
//		for(i=100;i>0;i--) {
//			System.out.print(i+" ");
//		}
		
//		3��
//		for(i=0;i<100;i+=2) {
//			System.out.print(i +" ");
//		}
		
//		4��
//		for (i=1;i<=10;i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
//		5��
//		System.out.print("�� �Է� : ");
//		num1 = sc.nextInt();
//		for (i=1;i<=num1;i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
//		6��
//		for(i=65;i<=70;i++) {
//			System.out.print((char)i+" ");
//		}
		
//		7��
//		for(i=0;i<5;i++) {
//			System.out.print((char)((i > 1 ? 66 : 65)+ i));
//		}

//		8��
//		for(i=0;i<15;i++) {
//			System.out.print(i % 5);
//		}
		
//		9��
		int lower;
		for(i=97; i<=122; i++) {
			lower = i - 32;
			System.out.print((char)i);
			System.out.print((char)lower);
		}
	}
}
