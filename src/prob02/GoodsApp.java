package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String LastData = new String();
		Goods[] goods = new Goods[COUNT_GOODS];

		// 상품 입력
		for (int i = 0; i < COUNT_GOODS; i++) {
			String name = scanner.next();
			int price = scanner.nextInt();
			int countStock = scanner.nextInt();
			
			goods[i] = new Goods();
			goods[i].name = name;
			goods[i].price = price;
			goods[i].countStock = countStock;
			
			LastData += goods[i].toData();
		}
		
		System.out.println(LastData);
		// 자원정리
		scanner.close();
	}
}
