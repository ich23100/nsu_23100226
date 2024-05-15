package sec07; //p.155

public class Circle {
	double radius;
	static int num0fCircles = 0;
	int numCircles = 0;

	public Circle(double radius) {
		this.radius = radius;
		num0fCircles++;
		numCircles++;
	}
}