package geometric2;

public class Triangle2 extends GeometricFigure2 {
	public Triangle2(int h, int w, String figure, int s) {
		super(h, w, figure, s);
	}

	@Override
	public int displaySides() {
		return sides;
	}

	@Override
	public double findArea() {
		return 0.5*(height * width);
	}

}
