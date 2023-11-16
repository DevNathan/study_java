package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
		Thread2 target1 = new Thread2();
		Thread2 target2 = new Thread2();

		Thread thread1 = new Thread(target1, "��");
		Thread thread2 = new Thread(target2, "��");

		thread1.start();
		thread2.start();

//   	���⿡ �ۼ��ϸ� main������� join���� ���� start()�ȴ�.  
		System.out.println("���� ������ ����");

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
//      ���� join() ���� ���� start()�� �ϸ�, join�� ���õ�
		System.out.println("���� ������ ����");

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
