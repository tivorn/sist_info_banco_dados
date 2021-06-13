package tp3;

public abstract class Quadrilateral implements Measuraments {
	public double[] sides;
	
	public Quadrilateral(double firstSide, double secondSide, double thirdSide, double fourthSide) {
		this.sides = new double[]{firstSide, secondSide, thirdSide, fourthSide};
	}

	@Override
	public abstract double computeArea();

	@Override
	public double computePerimeter() {
		double perimeter = 0;
		
		for (int i = 0; i < sides.length; i++ ) {
			perimeter += sides[i];
		}
		
		return perimeter;
	}

}
