package zoosimulator;

public class Egg<T extends Oviparous> {
	private T mother;
	private double hatchingTimer;
	private String gender;
	
	public Egg(String string,T mother,String gender) {
		this.mother = mother;
		this.hatchingTimer = mother.getGestateDuration()/2;
		this.gender = gender;
		System.out.println(((Animal) this.mother).getName()+" à pondu. L'oeuf éclora dans "+this.getHatchingTimer()+" ans");
	}
	
	public void hatching() {
		this.hatchingTimer -= 0.1;
		if(this.hatchingTimer <= 0) {
			switch ( ((Animal) this.mother).getSpecies()){
				case "GoldFish" :
					new GoldFish(this.gender);
				case "Eagle" :
					new Eagle(this.gender);
				case "Penguin" :
					new Penguin(this.gender);
			}
		}
	}

	public T getMother() {
		return mother;
	}

	public void setMother(T mother) {
		this.mother = mother;
	}

	public double getHatchingTimer() {
		return hatchingTimer;
	}

	public void setHatchingTimer(double hatchingTimer) {
		this.hatchingTimer = hatchingTimer;
	}
	
}
