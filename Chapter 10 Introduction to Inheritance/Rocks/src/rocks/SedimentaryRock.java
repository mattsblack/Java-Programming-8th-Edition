package rocks;

public class SedimentaryRock extends Rock{

	public SedimentaryRock(int numSamples, int weight) {
		super(numSamples, weight);
		description = "Sedimentary rocks are types of rock that are formed by the accumulation or"
				+ " deposition of mineral or organic particles at the Earth's surface, "
				+ "followed by cementation.";
	}
}
