package collectionTest.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> bloodTypeSet = new HashSet<String>();
//		�����͸� �������� ���� �� ������ �ο��ؾ� �Ѵ�.
//		iterator�� ����.
		bloodTypeSet.add("A");
		bloodTypeSet.add("B");
		bloodTypeSet.add("O");
		bloodTypeSet.add("AB");
		
		Iterator<String> iter = bloodTypeSet.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
//		�ߺ� ���Ž� ���
//		DBMS�� �⺻ ������ set�̴�.

		bloodTypeSet.add("A");
		bloodTypeSet.add("B");
		bloodTypeSet.add("O");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		
		System.out.println(bloodTypeSet.size());
		System.out.println(bloodTypeSet);
	}
}
