import java.util.Scanner;

public class Practice09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("1~99 ������ ������ �Է��ϼ���>> ");

		int num = s.nextInt();
		int a = num / 10;
		int b = num % 10;

		System.out.print("�ڼ�");
		if ((a == 3 || a == 6 || a == 9) || (b == 3 || b == 6 || b == 9)) {
			System.out.print("¦");
			if ((a == 3 || a == 6 || a == 9) && (b == 3 || b == 6 || b == 9)) {
				System.out.print("¦");
			}
		} else {
			System.out.print("����");
		}
		s.close();
	}

}
