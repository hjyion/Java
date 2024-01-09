import java.util.Scanner;

public class Practice09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하세요>> ");

		int num = s.nextInt();
		int a = num / 10;
		int b = num % 10;

		System.out.print("박수");
		if ((a == 3 || a == 6 || a == 9) || (b == 3 || b == 6 || b == 9)) {
			System.out.print("짝");
			if ((a == 3 || a == 6 || a == 9) && (b == 3 || b == 6 || b == 9)) {
				System.out.print("짝");
			}
		} else {
			System.out.print("없음");
		}
		s.close();
	}

}
