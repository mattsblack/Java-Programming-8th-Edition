package geometric2;

public abstract class GeometricFigure2 implements SidedObject {
	protected int height;
	protected int width;
	private String figureType;
	private double area;
	protected int sides;
	
	public GeometricFigure2(int h, int w, String figure, int s) {
		height = h;
		width = w;
		figureType = figure;
		sides = s;
	}
	public abstract double findArea();
	public int displaySides() {
		return sides;
	}
}
