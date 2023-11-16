package anonymous;

public class Building {
	private static final Form FormAdapter = null;

	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
		Starbucks jamsil = new Starbucks();

		gangnam.register(new Form() {
//			1ȸ�� �͸� Ŭ������ Form �������̽����� ������, �� ���� �� ���.
			@Override
			public void sell(String menu) {
				String[] menus = getMenu();

				for (int i = 0; i < menus.length; i++) {
					if (menus[i].equals(menu)) {
						System.out.println(menus[i] + " �Ǹ� �Ϸ�");
						break;
					}
					if (i == menus.length - 1) {
						System.out.println("�޴��� ���� ǰ���Դϴ�.");
					}
				}
			}

			@Override
			public String[] getMenu() {
				return new String[] { "�Ƹ޸�ī��", "ī���", "���̵�", "��ī����" };
			}
		});
		
		System.out.println();
		
		jamsil.register(new FormAdapter() {
			@Override
			public String[] getMenu() {
				return new String[] { "�Ƹ޸�ī��", "ī���", "���̵�", "��ī����" };
			}
		});
	}
}
