import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("���� �׼��� �Է��ϼ���>> ");

		int money = s.nextInt();
		int change = money;

		money /= 50000;
		System.out.print("������" + money + "��, ");
		money = change % 50000;

		money /= 10000;
		System.out.print("����" + money + "��, ");
		money = change % 10000;

		money /= 1000;
		System.out.print("õ��" + money + "��, ");
		money = change % 1000;

		money /= 500;
		System.out.print("500��" + money + "��, ");
		money = change % 500;

		money /= 100;
		System.out.print("100��" + money + "��, ");
		money = change % 100;

		money /= 10;
		System.out.print("10��" + money + "��, ");
		money = change % 10;

		System.out.print("1��" + money + "�� ");

		s.close();

	}

}
