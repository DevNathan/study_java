package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
		Thread2 target1 = new Thread2();
		Thread2 target2 = new Thread2();

		Thread thread1 = new Thread(target1, "♥");
		Thread thread2 = new Thread(target2, "★");

		thread1.start();
		thread2.start();

//   	여기에 작성하면 main쓰레드는 join보다 먼저 start()된다.  
		System.out.println("메인 쓰레드 시작");

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
//      만약 join() 보다 먼저 start()를 하면, join은 무시됨
		System.out.println("메인 쓰레드 종료");

//      Thread1 thread1 = new Thread1("?");
//      Thread1 thread2 = new Thread1("!");
//      
//      thread1.start();
//      thread2.start();
//      
//      thread1.run();
//      thread2.run();
	}
}
