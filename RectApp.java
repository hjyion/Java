import java.util.Scanner;

class Rectangle {
	int width;
	int height;

	public int getArea() {
		return width * height;
	}
}

public class RectApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle();
		Scanner s = new Scanner(System.in);
		System.out.println("너비, 높이를 입력하세요");
		rect.width = s.nextInt();
		rect.height = s.nextInt();
		System.out.println("사각형의 면적은 " + rect.getArea());
		s.close();

	}

}
