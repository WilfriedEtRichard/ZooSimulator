package zoosimulator;

public interface Oviparous {
    String isOviparous = "isOviparous";

    void layEggs();

	double getGestateDuration();

	AquaticPaddock<AquaticAnimal> getPaddock();
	FlyingPaddock<FlyingAnimal> getPaddock2();
}
