package classTest;

class Data {
	int data = 10;
	static int data_s = 10;

	void increase() {
		System.out.println(++data);
	}

	static void increase_s() {
		System.out.println(++data_s);
	}
}

public class StaticTest {
	public static void main(String[] args) {
		Data data1 = new Data();
		
		Data.increase_s();
		Data.increase_s();
		Data.increase_s();
		Data.increase_s();
		Data.increase_s();
		data1 = new Data();
		Data.increase_s();
		Data.increase_s();
		Data.increase_s();
		Data.increase_s();
		Data.increase_s();
		
		

		data1.increase();
		data1.increase();
		data1.increase();
		data1.increase();
		data1.increase();
		data1 = new Data();
		data1.increase();
		data1.increase();
		data1.increase();
		data1.increase();
		data1.increase();
	}
	
}
