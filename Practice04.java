import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("�� (x,y)�� ��ǥ�� �Է��ϼ���>> ");

		int x = s.nextInt();
		int y = s.nextInt();

		if ((x >= 50 && x <= 100) && (y >= 50 && y <= 100)) {
			System.out.println("�� (" + x + "," + y + ")" + "�� (50, 50)�� (100, 100)�� �簢�� ���� �ֽ��ϴ�.");
		} else {
			System.out.println("�� (" + x + "," + y + ")" + "�� (50, 50)�� (100, 100)�� �簢�� ���� �����ϴ�.");
		}

		s.close();
	}

}
