package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask {
	public static void main(String[] args) {
//		1~10까지 arraylist에 담고 출력
//		10~1까지 arraylist에 담고 출력
//		abcdef를 각 문자별로 출력
//		1~100까지 중 홀수만 arraylist에 담고 출력
//		a~f까지 중 d제외하고 arraylist에 담고 출력
//		5개의 문자열을 모두 소문자로 변경(Black, WHITE, reD, yeLLow, PINk), toLowerCase()
//		Apple, banana, Melon 중 첫번째 문자가 대문자인 문자열 출력
//		한글을 정수로 변경
//		정수를 한글로 변경

		// 1번
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(0, 10).forEach(num -> datas.add(num + 1));
//		System.out.print(datas);

		// 2-1번
//		ArrayList<String> datas = new ArrayList<String>();
//		IntStream.range(0, 6).forEach(num -> datas.add(String.valueOf((char)(65 + num))));
//		System.out.println(datas);

		// 2-2번
//		String str = "ABCDEF";
//		str.chars().forEach(c -> System.out.print((char) c + " "));

		// 3번
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(0, 100).filter(data -> data % 2 != 0).forEach(datas::add);
//		System.out.println(datas);
//
//		IntStream.range(0, 50).map(data -> data * 2 + 1).forEach(datas::add);
//		System.out.println(datas);

		// 4번
//		ArrayList<String> datas = new ArrayList<String>();
//		IntStream.range(0, 6).filter(num -> num + 65 != 'D').forEach(num -> datas.add(String.valueOf((char) (num + 65))));
//		System.out.println(datas);

		// 5번
//		List<String> color = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
//		List<String> color2 = color.stream().map(String::toLowerCase).collect(Collectors.toList());
//		System.out.println(color2);

		// 6번
//		List<String> fruit = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
//		fruit.stream().filter(fru -> Character.isUpperCase(fru.charAt(0))).forEach(System.out::println);

		// 7번
//        String[] hangeul = { "공", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
//        String temp = null;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("원하는 숫자 한글로 입력 Ex -> 육공칠팔 : ");
//        temp = sc.next();
//
//        List<Integer> numbers = new ArrayList<>();
//        temp.chars().mapToObj(c -> Character.toString((char) c)).filter(Arrays.asList(hangeul)::contains)
//        .mapToInt(Arrays.asList(hangeul)::indexOf).forEach(numbers::add);
//
//        System.out.println(numbers);

		// 8번
		String[] hangeul = { "공", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
		String input = "";
		Scanner sc = new Scanner(System.in);
		List<String> output = new ArrayList<String>();
		int flag = 0;

		while (flag != 1) {
			System.out.print("원하는 숫자 입력 Ex -> 1234 : ");
			try {
				input = sc.next();

				input.chars().mapToObj(c -> hangeul[Character.getNumericValue(c)]).forEach(output::add);
				flag = 1; //위의 코드가 정상적으로 실행되면 while문을 탈출할 flag 작동 / 아닐시 catch실행 후 while 반복
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("다시 입력하세요.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
//		오류 없을시 정상 출력
		System.out.println(output);
	}
}