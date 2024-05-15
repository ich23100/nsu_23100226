package sec06; //p.147-148

public class Circle2 {
	double radius;
	String color;

	public Circle2(double r, String c) {
		radius = r;
		color = c;
	}

	public Circle2(double r) {
		radius = r;
		color = "파랑";
	}

	public Circle2(String c) {
		radius = 10.0;
		color = c;
	}

	public Circle2() {
		radius = 10.0;
		color = "빨강";
	}
}