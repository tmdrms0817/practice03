package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String Operator = new String();
		int val1;
		int val2;
		String[] Data = new String[3];
		int result;
		String toData = new String();
		while (true) {
			/* 코드를 완성 합니다 */
			toData = scanner.nextLine();
			if (toData.equals("quit")) {
				System.out.println("계산 결과 종료 ");
				break;
			} else {
				Data = toData.split("\\s");
				val1 = Integer.parseInt(Data[0]);
				Operator = Data[1];
				val2 = Integer.parseInt(Data[2]);
				if (Operator.equals("+")) {
					Add add = new Add();
					add.setValue(val1, val2);
					result = add.calculate();
					System.out.println(result);
				} else if (Operator.equals("-")) {
					Sub sub = new Sub();
					sub.setValue(val1, val2);
					result = sub.calculate();
					System.out.println(result);
				} else if (Operator.equals("*")) {
					Mul mul = new Mul();
					mul.setValue(val1, val2);
					result = mul.calculate();
					System.out.println(result);
				} else if (Operator.equals("/")) {
					Div div = new Div();
					div.setValue(val1, val2);
					result = div.calculate();
					System.out.println(result);
				} else {
					System.out.println("문제 발생");
				}
			}

		}

		scanner.close();

	}

}
