package anonymous;

public class Starbucks {
//	�������͸� ���� �Ŵ��� �ް� FormAdapter Ÿ������ ���� ������ ���ᳪ�� ���,
//	Form Ÿ������ ���� ������ �޴��� �ް� �ش� ǰ�� �ֹ�.
	
	
	
	public void register(Form form) {
		String[] menu = form.getMenu();
		for (int i = 0; i < menu.length; i++) {
			System.out.println(i + 1 + ". " + menu[i]);
		}
		if (form instanceof FormAdapter) {
			System.out.println("���ᳪ����� ����");
		} else
			form.sell("��ī����");
	}
}
