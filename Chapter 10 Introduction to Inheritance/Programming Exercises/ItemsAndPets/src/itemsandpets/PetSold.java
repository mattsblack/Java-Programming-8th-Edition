package itemsandpets;

public class PetSold extends ItemSold {
	private boolean beenVaccinated;
	private boolean beenNeutered;
	private boolean beenHousebroken;
	
	public void setVaccine(boolean beenVaccinated) {
		this.beenVaccinated = beenVaccinated;
	}
	public void setNeutered(boolean beenNeutered) {
		this.beenNeutered = beenNeutered;
	}
	public void setHousebroken(boolean beenHousebroken) {
		this.beenHousebroken = beenHousebroken;
	}
	public boolean getVaccine() {
		return beenVaccinated;
	}
	public boolean getNeutered() {
		return beenNeutered;
	}
	public boolean getHousebroken() {
		return beenHousebroken;
	}
}
