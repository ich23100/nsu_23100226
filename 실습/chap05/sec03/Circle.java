package sec03; //p.192

public class Circle {
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	double findArea() {
		return 3.14 * radius * radius;
	}
}