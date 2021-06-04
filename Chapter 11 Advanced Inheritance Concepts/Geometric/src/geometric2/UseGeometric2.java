package geometric2;

public class UseGeometric2 {
	public static void main(String[] args) {
		GeometricFigure2[] figures2 = new GeometricFigure2[2];
		figures2[0] = new Square2(5, 5, "square", 4);
		figures2[1] = new Triangle2(3, 4, "triangle", 3);
		
		System.out.println("Area of square: " + figures2[0].findArea());
		System.out.println("Square sides: " + figures2[0].displaySides());
		System.out.println("Area of triangle: " + figures2[1].findArea());
		System.out.println("Triangle sides: " + figures2[1].displaySides());
	}
}
