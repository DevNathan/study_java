package arrayTest;

import java.util.Iterator;
import java.util.Scanner;

public class ArTask1 {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
//      �����
//      1~10���� �迭�� ��� ���
//      10~1���� �� ¦���� �迭�� ��� ���
//      1~100���� �迭�� ���� �� Ȧ���� ���
      
//      �ǹ�
//      1~100���� �迭�� ���� �� ¦���� �� ���
//      A~F���� �迭�� ��� ���
//      A~F���� �� C�����ϰ� �迭�� ���� �� ���
      
//      ���
//      5���� ������ �Է¹ް� �迭�� ���� �� �ִ밪�� �ּҰ� ���
      
//      ���̾�
//      ����ڰ� �Է��� ������ ������ŭ �迭�� ���� �� ������ �Է¹ް� ��� ���ϱ�
		
		
//		1�� ����
//		int[] num = {1,2,3,4,5,6,7,8,9,10};
//		for (i=0; i<10; i++) {
//			System.out.print(num[i] + " ");
//		}
		
//		2�� ����
//		int[] num = {2,4,6,8,10};
//		for (i = 0; i < num.length; i++) {
//			System.out.print(num[i] + " ");
//		}
		
//		3�� ����
//		int[] num = new int[100];
//		
//		for(i=0; i<100; i++) {
//			num[i] = i+1;
//		}
//		for (int j = 0; j < num.length; j++) {
//			if (j % 2 != 0) {continue;}
//			System.out.print(num[j] + " ");
//		}
		
//		4�� ����
//		int[] num = new int[100];
//		
//		for(i=0; i<100; i++) {
//			num[i] = i+1;
//		}
//		for(i=1; i<=100; i+=2) {
//			sum += num[i];
//		}
//		System.out.println(sum);
		
//		5�� ����
//		char[] ch = {'A','B','C','D','E','F'};
//		for (int j = 0; j < ch.length; j++) {
//			System.out.print(ch[j] + " ");
//		}
		
//		6�� ����
//		char[] ch = {'A','B','C','D','E','F'};
//		for (int j = 0; j < ch.length; j++) {
//			if (j != 2) {
//				System.out.print(ch[j] + " ");
//			}
//		}
		
//		7�� ����
//		int[] num = new int[5];
//		int max = 0, min = 0;
//		String mess1 = "5���� ���� �Է����ּ��� : ";
//		System.out.print(mess1);
//		for (int j = 0; j < num.length; j++) {
//			num[j] = sc.nextInt();
//		}
//		max = num[0];
//		min = num[0];
//		
//		for (int j = 1; j < num.length; j++) {
//			if(max < num[j]) {max = num[j];}
//			if(min > num[j]) {max = num[j];}
//		}
//		System.out.println(max);
//		System.out.println(min);
		
//		8�� ����
		int sub = 0;
		int sum1 = 0;
		double avg = 0;
		int[] num = null;
		String mess1 = "�� ���� ������ �Է��Ͻðڽ��ϱ�? : ";
		String mess2 = "�� ������ �Է����ּ���. ex) 1 2 3 ... : ";
		
		System.out.print(mess1);
		sub = sc.nextInt();
		
		num = new int[sub];
		System.out.print(mess2);
		for (int j = 0; j < sub; j++) {
			num[j] = sc.nextInt();
			sum1 += num[j];
		}
		avg = sum1 / (double)sub;
		
		System.out.printf("�Է��Ͻ� ���� ����� : %.2f", avg);
	}
}
