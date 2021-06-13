package tp3;

public class Square extends Quadrilateral {

	public Square(double firstSide, double secondSide, double thirdSide, double fourthSide) {
		super(firstSide, secondSide, thirdSide, fourthSide);
	}

	@Override
	public double computeArea() {
		double area = Math.pow(sides[1], 2);
		
		return area;
	}
	
	
}
