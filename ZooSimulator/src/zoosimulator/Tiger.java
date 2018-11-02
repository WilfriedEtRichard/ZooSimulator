package zoosimulator;

public class Tiger extends Animal implements EarthlyAnimal,Viviparous {
	private boolean wandering;
	private double gestateDuration=0.7;
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
            this.paddock.add(new Tiger("BabyTiger", paddock));
    }
    
    public void setPaddock(EarthlyPaddock<EarthlyAnimal> paddock) {
		if(paddock.getResident().size()<paddock.getMaxAnimals()) {
			this.paddock.remove(this);
			paddock.add(this);
			this.paddock = paddock;
			System.out.println("Le tigre "+this.getName()+" est maintenant dans l'enclos : "+ paddock.getName());
		} else {
			System.out.println("L'enclos "+paddock.getName()+" est plein");
		}
	}
}
