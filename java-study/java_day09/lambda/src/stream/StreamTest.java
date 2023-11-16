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

//		10~1까지 출력	+ 인덱스 0부터 4까지 삭제
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.range(0, 10).forEach(number -> {
//			datas.add(10 - number);
//		});
//		System.out.println(datas);
//
//		IntStream.range(0, 5).forEach(number -> datas.remove(0));
//		System.out.println(datas);

//		chars(): 문자열을 IntStream으로 변환
//		String data = "ABC";
//		data.chars().forEach(System.out::println);
//		data.chars().forEach(c -> {System.out.println((char)c);});

//		map(): 기존 값을 다른 값으로 변경
//		String data = "ABC";
//		data.chars().map(c-> c + 4).forEach(c -> {System.out.println((char)c);});

//		아래의 URL을 List에 담은 후 모든 경로 앞에 /app을 붙여준다.
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
		
//		filter(): 리턴이 true일 때에만 다음으로 전달
		ArrayList<Integer> datas = new ArrayList<Integer>();
		IntStream.range(0, 10).filter(data -> data %2==0).forEach(System.out::print);
		IntStream.range(0, 10).filter(data -> data %2!=0).forEach(datas::add);
		System.out.println(datas);
		
		

	}
}
