package geometric;

public class Triangle extends GeometricFigure {

	public Triangle(int h, int w, String figure) {
		super(h, w, figure);
	}

	@Override
	public double findArea() {
		return 0.5*(height * width);
	}
}
