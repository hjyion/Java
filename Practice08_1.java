import java.util.Scanner;

public class Practice08_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Ŀ�� �ֹ��ϼ���>>");
		String coffee = s.next();
		int num = s.nextInt();

		if (coffee.equals("����������")) {
			System.out.println(2000 * num + "���Դϴ�.");
		} else if (coffee.equals("�Ƹ޸�ī��")) {
			System.out.println(2500 * num + "���Դϴ�.");
		} else if (coffee.equals("īǪġ��")) {
			System.out.println(3000 * num + "���Դϴ�.");
		} else if (coffee.equals("ī���")) {
			System.out.println(3500 * num + "���Դϴ�.");
		}
		s.close();
	}

}
