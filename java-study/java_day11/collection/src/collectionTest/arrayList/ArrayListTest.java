package collectionTest.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
//	    <?>: ���׸�(�̸��� ����)
//	    ��üȭ �� Ÿ���� �����ϴ� ���
//      ������ ������ Ÿ���� ������ �� ���� ������ �ӽ÷� Ÿ���� ������ �� ����Ѵ�.
//      ���� �ٿ� ĳ������ �� �ʿ䰡 ������, ������ Ÿ�Կ� ������ �� �� �ִ�.

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
			System.out.println("�ε��� �ȹٷ�!");
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
