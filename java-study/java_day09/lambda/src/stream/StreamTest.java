package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {

//		intstream
//		IntStream.range(0, 10).forEach(num -> {System.out.println(num + 1);});

//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
//		datas.forEach(System.out::println);

//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(0, 10).forEach(datas::add);
//		System.out.println(datas);

//		10~1���� ���	+ �ε��� 0���� 4���� ����
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(0, 10).forEach(number -> {
//			datas.add(10 - number);
//		});
//		System.out.println(datas);
//
//		IntStream.range(0, 5).forEach(number -> datas.remove(0));
//		System.out.println(datas);

//		chars(): ���ڿ��� IntStream���� ��ȯ
//		String data = "ABC";
//		data.chars().forEach(System.out::println);
//		data.chars().forEach(c -> {System.out.println((char)c);});

//		map(): ���� ���� �ٸ� ������ ����
//		String data = "ABC";
//		data.chars().map(c-> c + 4).forEach(c -> {System.out.println((char)c);});

//		�Ʒ��� URL�� List�� ���� �� ��� ��� �տ� /app�� �ٿ��ش�.
//		/news, /game, /brand, /ranking
//		List<String> urls = new ArrayList<String>();
//		urls.add("/news");
//		urls.add("/game");
//		urls.add("/brand");
//		urls.add("/ranking");
//
//		urls.stream().map(url -> "/app" + url).forEach(url -> System.out.println(url));
		
//		sorted
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1,6,3,2,7));
//		datas.stream().sorted().forEach(System.out::print);
//		System.out.println();
//		datas.stream().sorted(Collections.reverseOrder()).forEach(System.out::print);
		
//		collect
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1,6,3,2,7));
//		List<Integer> sortedDatas= datas.stream().sorted().collect(Collectors.toList());
//		System.out.println(sortedDatas);
		
//		String data = datas.stream().sorted().map(String::ValueOf).collect(Collectors.toList());
		
//		filter(): ������ true�� ������ �������� ����
		ArrayList<Integer> datas = new ArrayList<Integer>();
		IntStream.range(0, 10).filter(data -> data %2==0).forEach(System.out::print);
		IntStream.range(0, 10).filter(data -> data %2!=0).forEach(datas::add);
		System.out.println(datas);
		
		

	}
}
