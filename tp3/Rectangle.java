package tp3;

public class Rectangle extends Quadrilateral {
	
	public double length;
	public double width; 

	public Rectangle(double firstSide, double secondSide, double thirdSide, double fourthSide) {
		super(firstSide, secondSide, thirdSide, fourthSide);
		
		this.length = firstSide;
		this.width = secondSide;
	}

	@Override
	public double computeArea() {
		double area = length * width;
		return area;
	}

}
