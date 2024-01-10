import java.util.Scanner;
public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print(">> 단어를 입력하세요: ");
		while(true) {
			System.out.print(">>");
			String str = s.nextLine();
			if (str.equals("exit")) 
				break;
		}
		s.close();
	}
// 시험 범위 반복문까지 (ch03 - 19쪽)
}
