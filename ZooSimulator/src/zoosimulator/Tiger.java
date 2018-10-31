package zoosimulator;

public class Tiger extends Animal implements EarthlyAnimal,Viviparous {
	private boolean wandering;
	private double gestateDuration;
	private EarthlyPaddock<EarthlyAnimal> paddock;
	
    public Tiger(String name, EarthlyPaddock<EarthlyAnimal> paddock) {
    	super(name, Math.floor((30.00+Math.random()*10)*100)/100, Math.floor((0.30+Math.random()*0.2)*100)/100, "Tiger");
    	this.paddock = paddock;
		this.wandering = false;
    }

    @Override
    public void wander() {
        System.out.println("l'animal :"+this.getName()+" marche");
    }
    
	@Override
	public boolean isWandering() {
		return this.wandering;
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
    
    public String getAction() {
		if(this.isWandering()) {
			return "Wandering";
		}else {
			return "Immobile";
		}
		
	}

    public void calcGestationPeriod() {

    }

    @Override
    public void giveBirth() {
        if((Math.random()<0.5)){
            //new Tiger("Female");
            System.out.println("Is a Female");
        }else{
            //new Tiger("Male");
            System.out.println("Male");
        }
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
