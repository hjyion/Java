import java.util.Scanner;

public class Practice08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Ŀ�� �ֹ��ϼ���>> ");
		String coffee = s.next();
		int num = s.nextInt();

		switch (coffee) {
		case "����������": {
			System.out.println(2000 * num + "���Դϴ�.");
			break;
		}
		case "�Ƹ޸�ī��": {
			System.out.println(2500 * num + "���Դϴ�.");
			break;
		}
		case "īǪġ��": {
			System.out.println(3000 * num + "���Դϴ�.");
			break;
		}
		case "ī���": {
			System.out.println(3500 * num + "���Դϴ�.");
			break;
		}
		}
		s.close();
	}

}
