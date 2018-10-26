package zoosimulator;

public class Eagle extends Animals implements FlyingAnimals,EarthlyAnimals,Oviparous {
	private boolean wandering;
	private boolean flying;
	
    public Eagle(String name) {
    	super(name, Math.floor((20.00+Math.random()*5)*100)/100, Math.floor((0.30+Math.random()*0.2)*100)/100, "Eagle");
		this.flying = false;
    }

	@Override
	public void wander() {
		this.flying = false;
		this.wandering = true;
	}

	@Override
	public boolean isWandering() {
		return this.wandering;
	}
	
	@Override
	public void fly() {
		this.wandering = false;
		this.flying = true;
	}

	@Override
	public boolean isFlying() {
		return this.flying;
	}
	
	public void stop() {
		this.wandering = false;
		this.flying = false;
	}
	
	@Override
	public String getAction() {
		if(this.isWandering()) {
			return "Wandering";
		}else {
			if(this.isFlying()) {
				return "Flying";
			}else {
				return "Immobile";
			}
		}	
	}

    public void birth() {
        if (this.isGender()){
            System.out.println("l'animal :"+this.getName()+" est un male il ne peux pas enfanter");
        }else{
            this.layEggs();
        }
    }

    @Override
    public void layEggs() {
        if((Math.random()<0.5)){
            //new Eagle("Female");
            System.out.println("Is a Female");
        }else{
            //new Eagle("Male");
            System.out.println("Male");
        }
    }

}
