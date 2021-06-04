package geometric2;

public class Square2 extends GeometricFigure2 {
	
	public Square2(int h, int w, String figure, int s) {
		super(h, w, figure, s);
	}
	
	@Override
	public int displaySides() {
		return sides;
	}
	@Override
	public double findArea() {
		return height * width;
	}

}
