package lambdaExpert;

import java.util.Iterator;
import java.util.Scanner;

public class MyMath {
	public static Calc calculator(String oper) {
		Calc calc = null;

		switch (oper) {
		case "+":
			calc = (n1, n2) -> n1 + n2;
			break;
		case "-":
			calc = (n1, n2) -> n1 - n2;
			break;
		}

		return calc;
	}

	public static void main(String[] args) {
//		operCheck를 익명메소드로 개방 후 람다식으로 작성. 입력받은 수식에서 +와 -를 구분하여 opercheck에 문자열배열로 반환
		OperCheck operCheck = (ex) -> {
			String temp = "";

			for (int i = 0; i < ex.length(); i++) {
				char op = ex.charAt(i);
				if (op == '+' || op == '-') {
					temp += op;

				}
			}
//			문자열 배열로 선언해서 사이즈를 측정하고 각 인덱스에 값을 집어 넣는 것 보단 split을 사용하여 문자열을 배열로 만드는 것이 더 합리적
			return temp.split("");
		};

		Scanner sc = new Scanner(System.in);
		String expression = "";
		String mess1 = "수식을 입력해주세요.";
		String mess1_ex = "ex) 75+4-6";
		String[] numbers = null, opers = null;
		int number1 = 0, number2 = 0;

		System.out.print(mess1 + " " + mess1_ex + " ");
		expression = sc.nextLine();
		expression = expression.replaceAll(" ", "");

		numbers = expression.split("\\+|\\-");
		opers = operCheck.getOpers(expression);

//		계산
		number1 = Integer.parseInt(numbers[0].equals("") ? opers[0] + numbers[1] : numbers[0]);
		for (int i = 0; i < opers.length; i++) {
			if (i == 0 && number1 < 0) {
				continue;
			}
			number2 = Integer.parseInt(numbers[i + 1]);
			number1 = MyMath.calculator(opers[i]).calc(number1, number2);
		}
		int result = number1;

		System.out.println(result);
	}
}
