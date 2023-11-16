package arrayTest;

import java.util.Iterator;

public class ArTest1 {
	public static void main(String[] args) {
		int[] arData = { 1,3,2,6,8 };
		
//		System.out.println(arData);
//		System.out.println(arData.length);
		
		for (int i=0;i<arData.length;i++) {
			System.out.print(arData[i] + " ");
		}
		System.out.println("\n");
		
		for (int i=0;i<arData.length;i++) {
			arData[i] = 5-i;
		}
		
		for (int i = 0; i < arData.length; i++) {
			System.out.print(arData[i] + " ");
		}
	}
}
