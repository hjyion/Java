import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("논리 연산을 입력하세요>> ");

		boolean a = s.nextBoolean();
		String op = s.next();
		boolean b = s.nextBoolean();

		switch (op) {
		case "AND": {
			System.out.println(a && b);
			break;
		}
		case "OR": {
			System.out.println(a || b);
			break;
		}
		}
		s.close();

	}

}
