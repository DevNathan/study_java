package anonymous;

public class Starbucks {
//	레지스터를 통해 매뉴를 받고 FormAdapter 타입으로 받은 분점은 무료나눔 행사,
//	Form 타입으로 받은 분점은 메뉴를 받고 해당 품목 주문.
	
	
	
	public void register(Form form) {
		String[] menu = form.getMenu();
		for (int i = 0; i < menu.length; i++) {
			System.out.println(i + 1 + ". " + menu[i]);
		}
		if (form instanceof FormAdapter) {
			System.out.println("무료나눔행사 승인");
		} else
			form.sell("디카페인");
	}
}
