package controllTest;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu1=0;
		String print1 = "빨간색 : 불같고 열정적이고 적극적이다.";
		String print2 = "노란색 : 활발하고 밝고 귀엽고 개성있고 착하다.";
		String print3 = "검은색 : 묵묵하고 든든하고 냉철하고 멋지다.";
		String print4 = "흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
		String print5 = "다시 입력해라 아쎄이";
		String result = null;
		System.out.println("당신이 좋아하는 색을 선택하세요.\n1. 빨간색\n2. 노란색\n3. 검은색\n4. 흰색\n");
		menu1 = sc.nextInt();
		
		switch (menu1) {
		case 1 : result = print1; break;
		case 2 : result = print2; break;
		case 3 : result = print3; break;
		case 4 : result = print4; break;
		default : result = print5;
		}
		
		System.out.println(result);
	}
}
