package classTest;

class A {
	int data;
	
	public A() {
		;
	}
	
	public A(int data) {
		this.data = data;
	}
	
	void printData() {
		System.out.println(this);
		System.out.println(data);
	}
}

public class ClassTest {
	public static void main(String[] args) {
		//°´Ã¼È­
		A a = new A(10);
		A b = new A();
		
		a.printData();
		b.printData();
	}
}
