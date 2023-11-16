package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask {
	public static void main(String[] args) {
//		1~10���� arraylist�� ��� ���
//		10~1���� arraylist�� ��� ���
//		abcdef�� �� ���ں��� ���
//		1~100���� �� Ȧ���� arraylist�� ��� ���
//		a~f���� �� d�����ϰ� arraylist�� ��� ���
//		5���� ���ڿ��� ��� �ҹ��ڷ� ����(Black, WHITE, reD, yeLLow, PINk), toLowerCase()
//		Apple, banana, Melon �� ù��° ���ڰ� �빮���� ���ڿ� ���
//		�ѱ��� ������ ����
//		������ �ѱ۷� ����

		// 1��
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(0, 10).forEach(num -> datas.add(num + 1));
//		System.out.print(datas);

		// 2-1��
//		ArrayList<String> datas = new ArrayList<String>();
//		IntStream.range(0, 6).forEach(num -> datas.add(String.valueOf((char)(65 + num))));
//		System.out.println(datas);

		// 2-2��
//		String str = "ABCDEF";
//		str.chars().forEach(c -> System.out.print((char) c + " "));

		// 3��
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(0, 100).filter(data -> data % 2 != 0).forEach(datas::add);
//		System.out.println(datas);
//
//		IntStream.range(0, 50).map(data -> data * 2 + 1).forEach(datas::add);
//		System.out.println(datas);

		// 4��
//		ArrayList<String> datas = new ArrayList<String>();
//		IntStream.range(0, 6).filter(num -> num + 65 != 'D').forEach(num -> datas.add(String.valueOf((char) (num + 65))));
//		System.out.println(datas);

		// 5��
//		List<String> color = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
//		List<String> color2 = color.stream().map(String::toLowerCase).collect(Collectors.toList());
//		System.out.println(color2);

		// 6��
//		List<String> fruit = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
//		fruit.stream().filter(fru -> Character.isUpperCase(fru.charAt(0))).forEach(System.out::println);

		// 7��
//        String[] hangeul = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" };
//        String temp = null;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("���ϴ� ���� �ѱ۷� �Է� Ex -> ����ĥ�� : ");
//        temp = sc.next();
//
//        List<Integer> numbers = new ArrayList<>();
//        temp.chars().mapToObj(c -> Character.toString((char) c)).filter(Arrays.asList(hangeul)::contains)
//        .mapToInt(Arrays.asList(hangeul)::indexOf).forEach(numbers::add);
//
//        System.out.println(numbers);

		// 8��
		String[] hangeul = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" };
		String input = "";
		Scanner sc = new Scanner(System.in);
		List<String> output = new ArrayList<String>();
		int flag = 0;

		while (flag != 1) {
			System.out.print("���ϴ� ���� �Է� Ex -> 1234 : ");
			try {
				input = sc.next();

				input.chars().mapToObj(c -> hangeul[Character.getNumericValue(c)]).forEach(output::add);
				flag = 1; //���� �ڵ尡 ���������� ����Ǹ� while���� Ż���� flag �۵� / �ƴҽ� catch���� �� while �ݺ�
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("�ٽ� �Է��ϼ���.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
//		���� ������ ���� ���
		System.out.println(output);
	}
}