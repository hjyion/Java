import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("x ���� �Է��ϼ���>> ");

		int x = s.nextInt();
		System.out.println("x=" + x + ", y=" + (x * x - 3 * x + 7));

		s.close();

	}

}
