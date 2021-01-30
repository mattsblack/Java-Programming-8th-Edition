package candle;

public class ScentedCandle extends Candle {
	private String scent;
	
	public void setScent(String scent) {
		this.scent = scent;
	}
	public String getScent() {
		return scent;
	}
	@Override
	public void setHeight(int height) {
		this.height = height;
		this.price = 3 * height * 0.393701;
	}
}
