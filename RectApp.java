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
		System.out.println("�ʺ�, ���̸� �Է��ϼ���");
		rect.width = s.nextInt();
		rect.height = s.nextInt();
		System.out.println("�簢���� ������ " + rect.getArea());
		s.close();

	}

}
