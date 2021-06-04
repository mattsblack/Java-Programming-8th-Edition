package blanket;

public class ElectricBlanket extends Blanket {
	private int heatSettings;
	private boolean hasAutoShutoff;
	
	public ElectricBlanket() {
		super();
		heatSettings = 1;
		hasAutoShutoff = false;
	}
	
	public void setHeatSettings(int hs) {
		if(hs > 5 || hs < 1) {
			hs = 1;
		}
		heatSettings = hs;
	}
	public void setAutoShutoff(boolean auto) {
		hasAutoShutoff = auto;
		if(auto == true) {
			price += 5.75;
		}
	}
	public int getHeatSettings() {
		return heatSettings;
	}
	public boolean getAutoShutoff() {
		return hasAutoShutoff;
	}
	
	//@Override
	public String toString() {
		return super.toString() + "\nHeat Settings: " + heatSettings + "\nAuto Shutoff: " + hasAutoShutoff;
	}
}
