
public class Circle {

	int radius;
	String name;

	public double getArea() {
		return 3.14 * radius * radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c1 = new Circle(); // ������
		c1.radius = 10;
		c1.name = "pizza";
		System.out.println(c1.name + "�� ������ " + c1.getArea());
		
		Circle c2 = new Circle();
		c2.radius = 2;
		c2.name = "donut";
		System.out.println(c2.getArea());

	}

}
