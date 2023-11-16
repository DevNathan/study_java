package anonymous;

public class Building {
	private static final Form FormAdapter = null;

	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
		Starbucks jamsil = new Starbucks();

		gangnam.register(new Form() {
//			1회용 익명 클래스를 Form 인터페이스에서 가져와, 재 정의 후 사용.
			@Override
			public void sell(String menu) {
				String[] menus = getMenu();

				for (int i = 0; i < menus.length; i++) {
					if (menus[i].equals(menu)) {
						System.out.println(menus[i] + " 판매 완료");
						break;
					}
					if (i == menus.length - 1) {
						System.out.println("메뉴에 없는 품목입니다.");
					}
				}
			}

			@Override
			public String[] getMenu() {
				return new String[] { "아메리카노", "카페라떼", "에이드", "디카페인" };
			}
		});
		
		System.out.println();
		
		jamsil.register(new FormAdapter() {
			@Override
			public String[] getMenu() {
				return new String[] { "아메리카노", "카페라떼", "에이드", "디카페인" };
			}
		});
	}
}
