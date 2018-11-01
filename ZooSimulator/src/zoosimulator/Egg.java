package zoosimulator;

public class Egg<T extends Oviparous> extends Animal{
	private T mother;
	private double hatchingTimer;
	
	
	public Egg(String name, T mother, Paddock<Egg<Oviparous>> paddock) {
		super(name, Math.floor((0.20+Math.random()*5)*100)/100, Math.floor((0.50+Math.random()*0.2)*100)/100, "Wolf");
		this.mother = mother;
		this.hatchingTimer = mother.getGestateDuration()/2;
		System.out.println(((Animal) this.mother).getName()+" à pondu. L'oeuf éclora dans "+this.getHatchingTimer()+" ans");
		paddock.add(this);
	}
	
	public String toString() {
		String s = ""+this.getName()+" ("+((Animal) this.mother).getSpecies()+") \n"
					+"Age : "+this.getAge()+" ans | Weight : "+this.getWeight()+"kg | Size : "+this.getSize()
					+"m \n"+"Health : "+this.getHealthIndicator()+" | Hunger : "+this.getHungerIndicator()+" | Sleep : "+this.getSleepIndicator()
					+" \n"+"Est enceinte ? : "+this.isPregnant()+" | De : "+this.getGestateTimer()+"an | son temps de gestation est de : ";		
		s = s+"\n"+"Action : "+this.getAction();
		s = s+"\n\n";
		return s;
	}
	
	public void hatching() {
		this.hatchingTimer -= 0.1;
		if(this.hatchingTimer <= 0) {
			System.out.println(((Animal) this.mother).getSpecies());
			switch (((Animal) this.mother).getSpecies()){
				case "Goldfish" :
					this.getMother().getPaddock().add(new GoldFish(this.getName(), this.getMother().getPaddock()));
					break;
				case "Eagle" :
					this.getMother().getPaddock().add(new Eagle(this.getName(), this.getMother().getPaddock2()));
					break;
				case "Penguin" :
					this.getMother().getPaddock().add(new Penguin(this.getName(), this.getMother().getPaddock()));
					break;
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
