package tp3;

public class Main {
	
	public static void main(String[] args) {
		Square square = new Square(2, 2, 2, 2);
		Rectangle rectangle = new Rectangle(4, 2, 4, 2);
		Circle circle = new Circle();
		
		System.out.println("QUADRADO:\n" + "\t lados: " + square.sides[0] + ", " + square.sides[1] + ", " + square.sides[2] + ", " + square.sides[3]);
		System.out.println("\t per�metro: " + square.computePerimeter());
		System.out.println("\t �rea:" + square.computeArea());
		
		System.out.println("RET�NGULO:\n" + "\t lados: " + rectangle.sides[0] + ", " + rectangle.sides[1] + ", " + rectangle.sides[2] + ", " + rectangle.sides[3]);
		System.out.println("\t per�metro: " + rectangle.computePerimeter());
		System.out.println("\t �rea:" + rectangle.computeArea());
		
		System.out.println("C�RCULO:\n" + "\t raio: " + circle.radius);
		System.out.println("\t per�metro: " + circle.computePerimeter());
		System.out.println("\t �rea:" + circle.computeArea());

	}
}
