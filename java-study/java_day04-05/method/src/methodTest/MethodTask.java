package methodTest;

import java.util.Iterator;
import java.util.Scanner;

public class MethodTask {

//	1��
//	void printNum() {
//		for (int i = 0; i < 10; i++) {
//			System.out.print(i + 1 + " ");
//		}
//	}

//	2��, 3��
//	void printName(String name, int time) {
//		for (int i = 0; i < time; i++) {
//			System.out.println(name);
//		}
//	}

//	4��
//	void minus(int[] num) {
//		int result = num[0] - num[1] - num[2];
//		System.out.println(result);
//	}

//	5��
//	void divide(int[] num) {
//		int result1 = num[0] / num[1];
//		int result2 = num[0] % num[1];
//		System.out.println(result1 + "/" + result2);
//	}

//	6��
//	void totalAdd(int num) {
//		int sum = 0;
//		for (int i = 0; i < num; i++) {
//			sum += i + 1;
//		}
//		System.out.println(sum);
//	}

//	7��
//	boolean changeToOddOrEven(int num) {
//		if ((num + 1) % 2 == 0) {
//			return true;
//		} else
//			return false;
//	}

//	8��
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

//	9��
//	int howManyLetters(String str, char search) {
//		int count = 0;
//		for (int i = 0; i < str.length(); i++) {
//			if (search == str.charAt(i))
//				count++;
//		}
//		return count;
//	}

//	10��
//	String hangeulToNum(String str) {
//		String hangeul = "�����̻�����ĥ�ȱ�";
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

//	11��
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

//	12��
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

//	13��
	void findLetterInString(String str, char search) {
		System.out.println(str.indexOf(search) + 1 + "��° �迭���� �߰�");
	}

	
	
	public static void main(String[] args) {
		MethodTask mt = new MethodTask();
		Scanner sc = new Scanner(System.in);
//		1��
//		mt.printNum();

//		2��, 3��
//		String name = null;
//		int time = 0;
//		
//		System.out.print("�̸��� �Է��Ͻÿ�. : ");
//		name = sc.next();
//		System.out.print("�ݺ�Ƚ�� : ");
//		time = sc.nextInt();
//		
//		mt.printName(name, time);

//		4��
//		int[] num = new int[3];
//		for (int i = 0; i < num.length; i++) {
//			System.out.print(i + 1 + "��° ���ڸ� �Է��ϼ���. : ");
//			num[i] = sc.nextInt();
//		}
//		mt.minus(num);

//		5��
//		int[] num = new int[2];
//		for (int i = 0; i < num.length; i++) {
//			System.out.print(i + 1 + "��° ���ڸ� �Է� : ");
//			num[i] = sc.nextInt();
//		}
//		mt.divide(num);

//		6��
//		System.out.print("���ڸ� �Է� : ");
//		int num = sc.nextInt();
//		mt.totalAdd(num);

//		7��
//		System.out.println("���ڸ� �Է�");
//		int num = sc.nextInt();
//		if (mt.changeToOddOrEven(num)) {
//			System.out.println("¦���� ����Ǿ����ϴ�.");
//		} else
//			System.out.println("Ȧ���� ����Ǿ����ϴ�.");

//		8��
//		String str;
//		System.out.print("���ڿ��� �Է��ϼ���. : ");
//		str = sc.next();
//		System.out.println(mt.changeUpperAndLowerCase(str));

//		9��
//		String str;
//		char search;
//		System.out.print("���ڿ��� �Է��Ͻÿ� : ");
//		str = sc.next();
//		System.out.print("ã�� ���ڸ� �Է��Ͻÿ� : ");
//		search = sc.next().charAt(0);
//		System.out.println(mt.howManyLetters(str, search));

//		10��
//		String str;
//		
//		System.out.print("���ڸ� �Է��Ͻÿ� ��) �����̻� : ");
//		str = sc.next();
//		
//		System.out.println(mt.hangeulToNum(str));

//		11��
//		int[] num = null;
//		int count;
//
//		System.out.print("��� ���ڸ� �Է��Ͻðڽ��ϱ�? : ");
//		count = sc.nextInt();
//
//		num = new int[count];
//		for (int i = 0; i < count; i++) {
//			System.out.print(i + 1 + "��° ���ڸ� �Է��ϼ���, : ");
//			num[i] = sc.nextInt();
//		}
//		System.out.println(mt.findMaxAndMin(num)[0]);
//		System.out.println(mt.findMaxAndMin(num)[1]);

//		12��
//		int[] num = null;
//		int[] maxAndMin = new int[2];
//		int count;
//
//		System.out.print("��� ���ڸ� �Է��Ͻðڽ��ϱ�? : ");
//		count = sc.nextInt();
//
//		num = new int[count];
//		for (int i = 0; i < count; i++) {
//			System.out.print(i + 1 + "��° ���ڸ� �Է��ϼ���, : ");
//			num[i] = sc.nextInt();
//		}
//		mt.findMaxAndMin(num, maxAndMin);
//		System.out.println("�ִ� : " + maxAndMin[0]);
//		System.out.println("�ּҰ� : " + maxAndMin[1]);

//		13��
		String str;
		char search;

		System.out.print("���ڿ� �Է� : ");
		str = sc.next();
		System.out.print("���ڿ����� ã�� ���� �Է� : ");
		search = sc.next().charAt(0);

		mt.findLetterInString(str, search);
	}
}
