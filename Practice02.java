import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("몇 층인지 입력하세요>> ");

		int a = s.nextInt();
		System.out.println((a * 5) + "m 입니다.");

		s.close();
	}

}
