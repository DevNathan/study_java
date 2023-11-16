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
//		operCheck�� �͸�޼ҵ�� ���� �� ���ٽ����� �ۼ�. �Է¹��� ���Ŀ��� +�� -�� �����Ͽ� opercheck�� ���ڿ��迭�� ��ȯ
		OperCheck operCheck = (ex) -> {
			String temp = "";

			for (int i = 0; i < ex.length(); i++) {
				char op = ex.charAt(i);
				if (op == '+' || op == '-') {
					temp += op;

				}
			}
//			���ڿ� �迭�� �����ؼ� ����� �����ϰ� �� �ε����� ���� ���� �ִ� �� ���� split�� ����Ͽ� ���ڿ��� �迭�� ����� ���� �� �ո���
			return temp.split("");
		};

		Scanner sc = new Scanner(System.in);
		String expression = "";
		String mess1 = "������ �Է����ּ���.";
		String mess1_ex = "ex) 75+4-6";
		String[] numbers = null, opers = null;
		int number1 = 0, number2 = 0;

		System.out.print(mess1 + " " + mess1_ex + " ");
		expression = sc.nextLine();
		expression = expression.replaceAll(" ", "");

		numbers = expression.split("\\+|\\-");
		opers = operCheck.getOpers(expression);

//		���
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
