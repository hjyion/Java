import java.util.Scanner;
public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print(">> �ܾ �Է��ϼ���: ");
		while(true) {
			System.out.print(">>");
			String str = s.nextLine();
			if (str.equals("exit")) 
				break;
		}
		s.close();
	}
// ���� ���� �ݺ������� (ch03 - 19��)
}
