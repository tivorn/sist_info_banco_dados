package tp3;

public class Circle implements Measuraments {
	public double radius;
	
	public Circle() {
		this.radius = 1;
	}
	
	public Circle(double Radius) {
		this.radius = Radius;
	}

	@Override
	public double computeArea() {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}

	@Override
	public double computePerimeter() {
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}

}
