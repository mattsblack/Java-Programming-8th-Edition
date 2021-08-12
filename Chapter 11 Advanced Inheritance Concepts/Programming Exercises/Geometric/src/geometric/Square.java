package geometric;

public class Square extends GeometricFigure {
	
	public Square(int h, int w, String figure) {
		super(h, w, figure);
	}
	
	@Override
	public double findArea() {
		return height * width;
	}

}
