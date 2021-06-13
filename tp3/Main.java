package tp3;

public class Main {
	
	public static void main(String[] args) {
		Square square = new Square(2, 2, 2, 2);
		Rectangle rectangle = new Rectangle(4, 2, 4, 2);
		Circle circle = new Circle();
		
		System.out.println("QUADRADO:\n" + "\t lados: " + square.sides[0] + ", " + square.sides[1] + ", " + square.sides[2] + ", " + square.sides[3]);
		System.out.println("\t perímetro: " + square.computePerimeter());
		System.out.println("\t área:" + square.computeArea());
		
		System.out.println("RETÂNGULO:\n" + "\t lados: " + rectangle.sides[0] + ", " + rectangle.sides[1] + ", " + rectangle.sides[2] + ", " + rectangle.sides[3]);
		System.out.println("\t perímetro: " + rectangle.computePerimeter());
		System.out.println("\t área:" + rectangle.computeArea());
		
		System.out.println("CÍRCULO:\n" + "\t raio: " + circle.radius);
		System.out.println("\t perímetro: " + circle.computePerimeter());
		System.out.println("\t área:" + circle.computeArea());

	}
}
