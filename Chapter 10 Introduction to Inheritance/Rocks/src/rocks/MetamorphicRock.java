package rocks;

public class MetamorphicRock extends Rock{

	public MetamorphicRock(int numSamples, int weight) {
		super(numSamples, weight);
		description = "Metamorphic rocks arise from the "
				+ "transformation of existing rock types, in a process called metamorphism";
	}
}
