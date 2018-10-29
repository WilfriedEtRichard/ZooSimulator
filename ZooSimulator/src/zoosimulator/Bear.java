package zoosimulator;

public class Bear extends Animal implements EarthlyAnimal,Viviparous {
	private boolean wandering;
	private double gestateDuration;
	
    public Bear(String name) {
    	super(name, Math.floor((50.00+Math.random()*10)*100)/100, Math.floor((0.50+Math.random()*0.5)*100)/100, "Bear");
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
            //new Bear("Female");
            System.out.println("Is a Female");
        }else{
            //new Bear("Male");
            System.out.println("Male");
        }
    }
}
