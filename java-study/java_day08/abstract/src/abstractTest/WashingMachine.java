package abstractTest;

public class WashingMachine extends Electronics {

	@Override
	public void on() {
		System.out.println("�о");
	}

	@Override
	public void off() {
		System.out.println("��ܼ�");
	}

	public static void main(String[] args) {
		WashingMachine washingMachine = new WashingMachine();
		
		washingMachine.safe();
		washingMachine.on();
		washingMachine.off();
	}
}
