package zoosimulator;

public class Bear extends Animal implements EarthlyAnimal,Viviparous {
	private boolean wandering;
	private double gestateDuration = 0.5;
	private EarthlyPaddock<EarthlyAnimal> paddock;
	
    public Bear(String name, EarthlyPaddock<EarthlyAnimal> paddock) {
    	super(name, Math.floor((50.00+Math.random()*10)*100)/100, Math.floor((0.50+Math.random()*0.5)*100)/100, "Bear");
    	this.paddock = paddock;
		this.wandering = false;
    }

	@Override
	public void wander() {
		this.wandering = !this.wandering;
	}

	@Override
	public boolean isWandering() {
		return this.wandering;
	}
	
	@Override
	public String getAction() {
		if(this.isWandering()) {
			return "Wandering";
		}else {
			return "Immobile";
		}
		
	}

    public void birth() {
    	if(this.getGestateTimer() >= this.gestateDuration) {
	        if (this.isGender()){
	            System.out.println("l'animal :"+this.getName()+" est un male il ne peux pas enfanter");
	        }else{
	            this.giveBirth();
	        }
	        this.setGestateTimer((double) 0);
    		this.setPregnant(false);
    	}
    }

    public void calcGestationPeriod() {

    }

    @Override
    public void giveBirth() {
        if((Math.random()<0.5)){
            this.paddock.add(new Bear("BearFemale",this.paddock));
            System.out.println("Is a Female");
        }else{
        	this.paddock.add(new Bear("BearMale",this.paddock));
            System.out.println("Male");
        }
    }
    
    public EarthlyPaddock<EarthlyAnimal> getPaddock() {
		return paddock;
	}

	public void setPaddock(EarthlyPaddock<EarthlyAnimal> paddock) {
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
