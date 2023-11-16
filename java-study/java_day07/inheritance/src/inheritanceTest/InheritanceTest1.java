package inheritanceTest;

class A {
	String name;
	int data;

	public A() {
		this.name = "A";
		this.data = 10;
	}

	void printName() {
		System.out.println(name);
	}
}

class B extends A{
	void printData() {
		System.out.println(data);
	}
}

public class InheritanceTest1 {
	public static void main(String[] args) {
		B b = new B();
		b.printName();
		
	}
}
