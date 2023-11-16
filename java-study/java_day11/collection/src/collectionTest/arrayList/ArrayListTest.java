package collectionTest.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
//	    <?>: 제네릭(이름이 없는)
//	    객체화 시 타입을 지정하는 기법
//      설계할 때에는 타입을 지정할 수 없기 때문에 임시로 타입을 선언할 때 사용한다.
//      따로 다운 캐스팅을 할 필요가 없으며, 지정할 타입에 제한을 줄 수 있다.

		ArrayList<Integer> datas = new ArrayList<Integer>();
		System.out.println(datas.size());
		datas.add(10);
		datas.add(30);
		datas.add(50);
		datas.add(60);
		datas.add(20);
		datas.add(70);
		datas.add(80);
		datas.add(90);
		System.out.println(datas.size());
		try {
			System.out.println(datas.get(7));
		} catch (Exception e) {
			System.out.println("인덱스 똑바로!");
		}
		if (datas.contains(50)) {
			datas.add(datas.indexOf(50) + 1, 500);
		}
		System.out.println(datas.get(3));

		datas.set(7, 9);
		System.out.println(datas.size());
		System.out.println(datas.get(7));

//		datas.remove(6);
		System.out.println(datas.size());
		System.out.println(datas.get(6));

		for (int i = 0; i < datas.size(); i++) {
			if (datas.get(i) == 60) {
				datas.remove(i);
			}

		}
		System.out.println(datas.size());
		System.out.println(datas.get(6));

	}
}
