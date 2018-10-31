package zoosimulator;

public class Egg<T extends Oviparous> extends Animal{
	private T mother;
	private double hatchingTimer;
	
	
	public Egg(String name,T mother) {
		super(name, Math.floor((20.00+Math.random()*10)*100)/100, Math.floor((0.50+Math.random()*0.2)*100)/100, "Wolf");
		this.mother = mother;
		this.hatchingTimer = mother.getGestateDuration()/2;
		System.out.println(((Animal) this.mother).getName()+" à pondu. L'oeuf éclora dans "+this.getHatchingTimer()+" ans");
	}
	
	public void hatching() {
		this.hatchingTimer -= 0.1;
		if(this.hatchingTimer <= 0) {
			switch ( ((Animal) this.mother).getSpecies()){
				case "GoldFish" :
					new GoldFish(this.getName(), this.getMother().getPaddock());
				case "Eagle" :
					new Eagle(this.getName(), this.getMother().getPaddock2());
				case "Penguin" :
					new Penguin(this.getName(), this.getMother().getPaddock());
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

	@Override
	public void birth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAction() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
