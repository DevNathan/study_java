package arrayTest;

import java.util.Iterator;
import java.util.Scanner;

public class ArTask1 {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
//      브론즈
//      1~10까지 배열에 담고 출력
//      10~1까지 중 짝수만 배열에 담고 출력
//      1~100까지 배열에 담은 후 홀수만 출력
      
//      실버
//      1~100까지 배열에 담은 후 짝수의 합 출력
//      A~F까지 배열에 담고 출력
//      A~F까지 중 C제외하고 배열에 담은 후 출력
      
//      골드
//      5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
      
//      다이아
//      사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
		
		
//		1번 문제
//		int[] num = {1,2,3,4,5,6,7,8,9,10};
//		for (i=0; i<10; i++) {
//			System.out.print(num[i] + " ");
//		}
		
//		2번 문제
//		int[] num = {2,4,6,8,10};
//		for (i = 0; i < num.length; i++) {
//			System.out.print(num[i] + " ");
//		}
		
//		3번 문제
//		int[] num = new int[100];
//		
//		for(i=0; i<100; i++) {
//			num[i] = i+1;
//		}
//		for (int j = 0; j < num.length; j++) {
//			if (j % 2 != 0) {continue;}
//			System.out.print(num[j] + " ");
//		}
		
//		4번 문제
//		int[] num = new int[100];
//		
//		for(i=0; i<100; i++) {
//			num[i] = i+1;
//		}
//		for(i=1; i<=100; i+=2) {
//			sum += num[i];
//		}
//		System.out.println(sum);
		
//		5번 문제
//		char[] ch = {'A','B','C','D','E','F'};
//		for (int j = 0; j < ch.length; j++) {
//			System.out.print(ch[j] + " ");
//		}
		
//		6번 문제
//		char[] ch = {'A','B','C','D','E','F'};
//		for (int j = 0; j < ch.length; j++) {
//			if (j != 2) {
//				System.out.print(ch[j] + " ");
//			}
//		}
		
//		7번 문제
//		int[] num = new int[5];
//		int max = 0, min = 0;
//		String mess1 = "5개의 값을 입력해주세요 : ";
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
		
//		8번 문제
		int sub = 0;
		int sum1 = 0;
		double avg = 0;
		int[] num = null;
		String mess1 = "몇 개의 정수를 입력하시겠습니까? : ";
		String mess2 = "각 정수를 입력해주세요. ex) 1 2 3 ... : ";
		
		System.out.print(mess1);
		sub = sc.nextInt();
		
		num = new int[sub];
		System.out.print(mess2);
		for (int j = 0; j < sub; j++) {
			num[j] = sc.nextInt();
			sum1 += num[j];
		}
		avg = sum1 / (double)sub;
		
		System.out.printf("입력하신 값의 평균은 : %.2f", avg);
	}
}
