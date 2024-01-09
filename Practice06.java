import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("돈의 액수를 입력하세요>> ");

		int money = s.nextInt();
		int change = money;

		money /= 50000;
		System.out.print("오만원" + money + "개, ");
		money = change % 50000;

		money /= 10000;
		System.out.print("만원" + money + "개, ");
		money = change % 10000;

		money /= 1000;
		System.out.print("천원" + money + "개, ");
		money = change % 1000;

		money /= 500;
		System.out.print("500원" + money + "개, ");
		money = change % 500;

		money /= 100;
		System.out.print("100원" + money + "개, ");
		money = change % 100;

		money /= 10;
		System.out.print("10원" + money + "개, ");
		money = change % 10;

		System.out.print("1원" + money + "개 ");

		s.close();

	}

}
