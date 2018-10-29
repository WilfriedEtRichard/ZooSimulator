package zoosimulator;

import java.util.Scanner;

public class Egg<T extends Oviparous> {
	private T mother;
	private double hatchingTimer;
	
	public Egg(String string,T mother) {
		this.mother = mother;
		this.hatchingTimer = mother.getGestateDuration()/2;
		System.out.println(((Animal) this.mother).getName()+" à pondu. L'oeuf éclora dans "+this.getHatchingTimer()+" ans");
	}
	
	public void hatching() {
		this.hatchingTimer -= 0.1;
		if(this.hatchingTimer <= 0) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Donnez un nom à votre "+((Animal) this.mother).getSpecies()+" :");
		    String name = sc.nextLine();
			switch ( ((Animal) this.mother).getSpecies()){
				case "GoldFish" :
					new GoldFish(name);
				case "Eagle" :
					new Eagle(name);
				case "Penguin" :
					new Penguin(name);
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
