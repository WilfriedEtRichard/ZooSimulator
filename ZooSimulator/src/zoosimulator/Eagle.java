package zoosimulator;

public class Eagle extends Animal implements FlyingAnimal,EarthlyAnimal,Oviparous {
	private boolean wandering;
	private boolean flying;
	private double gestateDuration;
	private FlyingPaddock<FlyingAnimal> paddock;
	
    public Eagle(String name, FlyingPaddock<FlyingAnimal> paddock) {
    	super(name, Math.floor((20.00+Math.random()*5)*100)/100, Math.floor((0.30+Math.random()*0.2)*100)/100, "Eagle");
    	this.paddock = paddock;
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
    	if(this.getGestateTimer() >= this.gestateDuration) {
	        if (this.isGender()){
	            System.out.println("l'animal :"+this.getName()+" est un male il ne peux pas enfanter");
	        }else{
	            this.layEggs();
	        }
    	}
    }

    @Override
    public void layEggs() {
    	if(this.getGestateTimer() >= this.gestateDuration) {
    		if((Math.random()<0.5)){
                new Egg<Eagle>("EagleFemale",this,this.paddock.getEggPaddock());
                System.out.println("Is a Female");
            }else{
                new Egg<Eagle>("EagleMale",this,this.paddock.getEggPaddock());
                System.out.println("Is a Male");
            }
    		this.setGestateTimer((double) 0);
    		this.setPregnant(false);
    	}
    }

	@Override
	public double getGestateDuration() {
		return gestateDuration;
	}

	
	public FlyingPaddock<FlyingAnimal> getPaddock1() {
		return paddock;
	}

	public void setPaddock(FlyingPaddock<FlyingAnimal> paddock) {
		if(paddock.getResident().size()<paddock.getMaxAnimals()) {
			this.paddock.remove(this);
			paddock.add(this);
			this.paddock = paddock;
			System.out.println("Le gf "+this.getName()+" est maintenant dans l'aquarium : "+ paddock.getName());
		} else {
			System.out.println("Le paddock "+paddock.getName()+" est plein");
		}
	}

	@Override
	public AquaticPaddock<AquaticAnimal> getPaddock() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FlyingPaddock<FlyingAnimal> getPaddock2() {
		// TODO Auto-generated method stub
		return paddock;
	}

}
