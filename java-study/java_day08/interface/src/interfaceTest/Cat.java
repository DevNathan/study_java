package interfaceTest;

public class Cat implements Pet{
	public void sitDown() {
		System.out.println("앉지않는다.");
	}
	public void waitNow() {
		System.out.println("안기다린다");
	}
	public void poop() {
		System.out.println("말안해도 잘 한다.");
	}
}
