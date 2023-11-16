package exceptionTest;

import java.util.Iterator;
import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
//	5개의 정수만 입력 받기
//		- 무한 입력 상태로 구현
//		- q입력 시 나가기
//		- 각 정수는 배열에 담기
//		- if문은 딱 한 번 사용하기
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int count = 0;

		while (true) {
			System.out.print(count + 1 + "번째 정수 입력 : ");
			String temp = sc.next();
			if (temp.equals("q")) {
				break;
			}

			try {
				num[count] = Integer.parseInt(temp);
			} catch (NumberFormatException e) {
				System.out.println("정수를 입력해주세요.");
				count--;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("5개의 정수만 입력됩니다.");
				break;
			} catch (Exception e) {
				System.out.println("알 수 없는 오류");
				count--;
			}
			count++;
		}

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

//		try {
//			System.out.println("5개의 정수 입력하기 / q 입력시 종료");
//			for (int i = 0;; i++) {
//				String input = sc.next();
//				if (input.equals("q")) {
//					break;
//				} else {
//					num[i] = Integer.parseInt(input);
//					count++;
//				}
//			}
//			for (int i = 0; i < count; i++) {
//				System.out.println(num[i]);
//			}
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("5개만 입력해주세요.");
//		}
	}
}
