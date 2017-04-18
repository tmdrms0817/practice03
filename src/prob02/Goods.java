package prob02;

public class Goods {
	
	public static String name;
	public static int price;
	public static int countStock;
	
	public static String toData() {
		
		return name + "(가격:" + price + "원)이 "+ countStock + "개 입고 되었습니다. \n";
	}
}
