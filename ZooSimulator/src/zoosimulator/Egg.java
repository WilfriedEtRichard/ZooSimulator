package zoosimulator;

public class Egg<T extends Oviparous> extends Animal{
	private T mother;
	private double hatchingTimer;
	private Paddock<Egg<Oviparous>> paddock;
	
	
	public Egg(String name, T mother, Paddock<Egg<Oviparous>> paddock) {
		super(name, Math.floor((0.20+Math.random()*5)*100)/100, Math.floor((0.50+Math.random()*0.2)*100)/100, "Wolf");
		this.paddock = paddock;
		this.mother = mother;
		this.hatchingTimer = mother.getGestateDuration()/2;
		System.out.println(((Animal) this.mother).getName()+" à pondu. L'oeuf éclora dans "+this.getHatchingTimer()+" ans");
		paddock.add(this);
	}
	
	public String toString() {
		String s = ""+this.getName()+" ("+((Animal) this.mother).getSpecies()+") \n"
					+"Eclos dans : "+this.getHatchingTimer()+" ans | Weight : "+this.getWeight()+"kg | Size : "+this.getSize();
		s = s+"\n"+"Action : "+this.getAction();
		s = s+"\n\n";
		return s;
	}
	
	public void growing() {
		this.hatchingTimer -= 0.1;
		if(this.hatchingTimer <= 0) {
			switch (((Animal) this.mother).getSpecies()){
				case "Goldfish" :
					this.paddock.remove((Egg<Oviparous>) this);
					this.mother.getPaddock().add(new GoldFish(this.getName(), this.mother.getPaddock()));
					break;
				case "Eagle" :
					this.paddock.remove((Egg<Oviparous>) this);
					this.mother.getPaddock().add(new Eagle(this.getName(), this.mother.getPaddock2()));
					break;
				case "Penguin" :
					this.paddock.remove((Egg<Oviparous>) this);
					this.mother.getPaddock().add(new Penguin(this.getName(), this.mother.getPaddock()));
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
