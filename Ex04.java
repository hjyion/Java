import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int cnt = 0;

		System.out.print("������ �Է��ϼ���: ");
		int n = s.nextInt();

		while (n != -1) {
			sum += n;
			cnt++;
			n = s.nextInt();
			System.out.println("n :" + n + ", sum: " + sum + ", cnt: " + cnt);
		}

		System.out.println(sum / cnt);

	}
// 1���� 10���� 3�� ����� ���ϱ� ��
}
