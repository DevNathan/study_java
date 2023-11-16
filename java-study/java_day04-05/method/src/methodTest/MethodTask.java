package methodTest;

import java.util.Iterator;
import java.util.Scanner;

public class MethodTask {

//	1번
//	void printNum() {
//		for (int i = 0; i < 10; i++) {
//			System.out.print(i + 1 + " ");
//		}
//	}

//	2번, 3번
//	void printName(String name, int time) {
//		for (int i = 0; i < time; i++) {
//			System.out.println(name);
//		}
//	}

//	4번
//	void minus(int[] num) {
//		int result = num[0] - num[1] - num[2];
//		System.out.println(result);
//	}

//	5번
//	void divide(int[] num) {
//		int result1 = num[0] / num[1];
//		int result2 = num[0] % num[1];
//		System.out.println(result1 + "/" + result2);
//	}

//	6번
//	void totalAdd(int num) {
//		int sum = 0;
//		for (int i = 0; i < num; i++) {
//			sum += i + 1;
//		}
//		System.out.println(sum);
//	}

//	7번
//	boolean changeToOddOrEven(int num) {
//		if ((num + 1) % 2 == 0) {
//			return true;
//		} else
//			return false;
//	}

//	8번
//	String changeUpperAndLowerCase(String str) {
//		char temp = ' ';
//		String output = "";
//		for (int i = 0; i < str.length(); i++) {
//			temp = str.charAt(i);
//			if (temp >= 65 && temp <= 90) {
//				output += (char)(temp + 32);
//			} else if (temp >= 97 && temp <= 122) {
//				output += (char)(temp - 32);
//			} else
//				output += temp;
//		}
//		return output;
//	}

//	9번
//	int howManyLetters(String str, char search) {
//		int count = 0;
//		for (int i = 0; i < str.length(); i++) {
//			if (search == str.charAt(i))
//				count++;
//		}
//		return count;
//	}

//	10번
//	String hangeulToNum(String str) {
//		String hangeul = "공일이삼사오육칠팔구";
//		char temp;
//		String output = "";
//		for (int i = 0; i < str.length(); i++) {
//			for (int j = 0; j < hangeul.length(); j++) {
//				if (str.charAt(i)==hangeul.charAt(j)) {
//					output += j;
//				}
//			}
//		}
//		return output;
//	}

//	11번
//	int[] findMaxAndMin(int[] num) {
//		int[] maxAndMin = new int[2];
//		maxAndMin[0] = num[0];
//		maxAndMin[1] = num[0];
//		for (int i = 1; i < num.length; i++) {
//			if (num[i] > maxAndMin[0]) {
//				maxAndMin[0] = num[i];
//			}
//			if (num[i] < maxAndMin[1]) {
//				maxAndMin[1] = num[i];
//			}
//		}
//		return maxAndMin;
//	}

//	12번
//	void findMaxAndMin(int[] num, int[] maxAndMin) {
//		maxAndMin[0] = num[0];
//		maxAndMin[1] = num[0];
//		for (int i = 1; i < num.length; i++) {
//			if (num[i] > maxAndMin[0]) {
//				maxAndMin[0] = num[i];
//			}
//			if (num[i] < maxAndMin[1]) {
//				maxAndMin[1] = num[i];
//			}
//		}
//	}

//	13번
	void findLetterInString(String str, char search) {
		System.out.println(str.indexOf(search) + 1 + "번째 배열에서 발견");
	}

	
	
	public static void main(String[] args) {
		MethodTask mt = new MethodTask();
		Scanner sc = new Scanner(System.in);
//		1번
//		mt.printNum();

//		2번, 3번
//		String name = null;
//		int time = 0;
//		
//		System.out.print("이름을 입력하시오. : ");
//		name = sc.next();
//		System.out.print("반복횟수 : ");
//		time = sc.nextInt();
//		
//		mt.printName(name, time);

//		4번
//		int[] num = new int[3];
//		for (int i = 0; i < num.length; i++) {
//			System.out.print(i + 1 + "번째 숫자를 입력하세요. : ");
//			num[i] = sc.nextInt();
//		}
//		mt.minus(num);

//		5번
//		int[] num = new int[2];
//		for (int i = 0; i < num.length; i++) {
//			System.out.print(i + 1 + "번째 숫자를 입력 : ");
//			num[i] = sc.nextInt();
//		}
//		mt.divide(num);

//		6번
//		System.out.print("숫자를 입력 : ");
//		int num = sc.nextInt();
//		mt.totalAdd(num);

//		7번
//		System.out.println("숫자를 입력");
//		int num = sc.nextInt();
//		if (mt.changeToOddOrEven(num)) {
//			System.out.println("짝수로 변경되었습니다.");
//		} else
//			System.out.println("홀수로 변경되었습니다.");

//		8번
//		String str;
//		System.out.print("문자열을 입력하세요. : ");
//		str = sc.next();
//		System.out.println(mt.changeUpperAndLowerCase(str));

//		9번
//		String str;
//		char search;
//		System.out.print("문자열을 입력하시오 : ");
//		str = sc.next();
//		System.out.print("찾을 문자를 입력하시오 : ");
//		search = sc.next().charAt(0);
//		System.out.println(mt.howManyLetters(str, search));

//		10번
//		String str;
//		
//		System.out.print("숫자를 입력하시오 예) 공팔이사 : ");
//		str = sc.next();
//		
//		System.out.println(mt.hangeulToNum(str));

//		11번
//		int[] num = null;
//		int count;
//
//		System.out.print("몇개의 숫자를 입력하시겠습니까? : ");
//		count = sc.nextInt();
//
//		num = new int[count];
//		for (int i = 0; i < count; i++) {
//			System.out.print(i + 1 + "번째 숫자를 입력하세요, : ");
//			num[i] = sc.nextInt();
//		}
//		System.out.println(mt.findMaxAndMin(num)[0]);
//		System.out.println(mt.findMaxAndMin(num)[1]);

//		12번
//		int[] num = null;
//		int[] maxAndMin = new int[2];
//		int count;
//
//		System.out.print("몇개의 숫자를 입력하시겠습니까? : ");
//		count = sc.nextInt();
//
//		num = new int[count];
//		for (int i = 0; i < count; i++) {
//			System.out.print(i + 1 + "번째 숫자를 입력하세요, : ");
//			num[i] = sc.nextInt();
//		}
//		mt.findMaxAndMin(num, maxAndMin);
//		System.out.println("최댓값 : " + maxAndMin[0]);
//		System.out.println("최소값 : " + maxAndMin[1]);

//		13번
		String str;
		char search;

		System.out.print("문자열 입력 : ");
		str = sc.next();
		System.out.print("문자열에서 찾을 문자 입력 : ");
		search = sc.next().charAt(0);

		mt.findLetterInString(str, search);
	}
}
