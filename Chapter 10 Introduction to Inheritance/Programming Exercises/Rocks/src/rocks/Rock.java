package rocks;

public class Rock {
	private int numSamples;
	protected String description;
	private int weight;
	
	public Rock(int numSamples, int weight) {
		description = "Unclassified";
		this.numSamples = numSamples;
		this.weight = weight;
	}
	public int getSampleNumber() {
		return numSamples;
	}
	public String getDescription() {
		return description;
	}
	public int getWeight() {
		return weight;
	}
}
