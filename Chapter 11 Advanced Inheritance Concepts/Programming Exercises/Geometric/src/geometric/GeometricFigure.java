package geometric;

public abstract class GeometricFigure {
	protected int height;
	protected int width;
	private String figureType;
	private double area;
	
	public GeometricFigure(int h, int w, String figure) {
		height = h;
		width = w;
		figureType = figure;
	}
	public abstract double findArea();
}
