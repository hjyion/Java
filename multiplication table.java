// 구구단 for문으로 세로 출력
public class study02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int j = 1; j <= 9; j++) {
			for (int i = 2; i <= 9; i++) {

				System.out.print(i + "X" + j + "=" + (i * j) + "	");
			}
			System.out.println("");
		}
		System.out.println("");
	}
}
