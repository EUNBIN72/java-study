package homework;

public class homework8 {
	public static void main(String[] args) {
		// 8. 오늘의 메뉴판 만들기
		
		String[] menu = {"Burger", "Pizza", "Pasta"};
		
		String[] add = {"Salad", "Soup"};
		String[] menuCopy = new String[5];
		
		
		
		System.arraycopy(menu, 0, menuCopy, 0, menu.length);

		for (int i = 0; i < add.length; i++) {
			menuCopy[menu.length + i ] = add[i];
		}
		
		for (int i = 0; i < menuCopy.length; i++) {
			System.out.print(menuCopy[i]);
			if(i != menuCopy.length - 1) {
				
				System.out.print(", ");
			}
		}
	}

}
