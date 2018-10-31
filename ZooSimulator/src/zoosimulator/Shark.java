package zoosimulator;

public class Shark extends Animal implements AquaticAnimal,Viviparous{
	private boolean swimming;
	private double gestateDuration;
	private AquaticPaddock<AquaticAnimal> paddock;
	

    public Shark(String name, AquaticPaddock<AquaticAnimal> paddock) {
    	super(name, Math.floor((50.00+Math.random()*10)*100)/100, Math.floor((0.50+Math.random()*0.5)*100)/100, "Shark");
    	this.paddock = paddock;
		this.swimming = ! this.swimming;
    }

	@Override
	public void swim() {
		this.swimming = !this.swimming;
	}

	@Override
	public boolean isSwimming() {
		return this.swimming;
	}
	
	@Override
	public String getAction() {
		if(this.isSwimming()) {
			return "Swimming";
		}else {
			return "Immobile";
		}
		
	}

    public void birth() {
    	if(this.getGestateTimer() >= this.gestateDuration) {
	        if (this.isGender()){
	            System.out.println("l'animal :"+this.getName()+" est un male il ne peux pas enfanter");
	        }else{
	            giveBirth();
	        }
	    }
	}

    public void calcGestationPeriod() {

    }

    @Override
    public void giveBirth() {
        if((Math.random()<0.5)){
            //new Shark("Female");
            System.out.println("Is a Female");
        }else{
            //new Shark("Male");
            System.out.println("Male");
        }
    }
    
    public AquaticPaddock<AquaticAnimal> getPaddock() {
		return this.paddock;
	}

	public void setPaddock(AquaticPaddock<AquaticAnimal> paddock) {
		if(paddock.getResident().size()<paddock.getMaxAnimals()) {
			this.paddock.remove(this);
			paddock.add(this);
			this.paddock = paddock;
			System.out.println("Le gf "+this.getName()+" est maintenant dans l'aquarium : "+ paddock.getName());
		} else {
			System.out.println("Le paddock "+paddock.getName()+" est plein");
		}
	}
}

