import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String coffee = s.next();
		int num = s.nextInt();

		if (coffee.equals("����������")) {
			if (num > 10) {
				System.out.print((int) (num * 2000 * 0.95));
			} else {
				System.out.print(num * 2000);
			}
		} else if (coffee.equals("�Ƹ޸�ī��")) {
			System.out.print(num * 2500);
		} else if (coffee.equals("īǪġ��")) {
			System.out.print(num * 3000);
		} else if (coffee.equals("ī���")) {
			System.out.print(num * 3500);
		}
		System.out.print("���Դϴ�.");

		s.close();
	}
}
