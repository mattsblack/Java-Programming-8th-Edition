package geometric;

public class UseGeometric {
	public static void main(String[] args) {
		GeometricFigure[] figures = new GeometricFigure[2];
		figures[0] = new Square(5,5,"square");
		figures[1] = new Triangle(3,4,"triangle");
		
		System.out.println("Area of square: " + figures[0].findArea());
		System.out.println("Area of triangle: " + figures[1].findArea());
	}

}
