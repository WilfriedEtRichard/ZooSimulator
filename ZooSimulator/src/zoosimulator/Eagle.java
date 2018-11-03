package zoosimulator;

public class Eagle extends Animal implements FlyingAnimal,EarthlyAnimal,Oviparous {
	private boolean wandering;
	private boolean flying;
	private double gestateDuration = 0.4;
	private FlyingPaddock<FlyingAnimal> paddock;
	
    public Eagle(String name, FlyingPaddock<FlyingAnimal> paddock) {
    	super(name, Math.floor((20.00+Math.random()*5)*100)/100, Math.floor((0.30+Math.random()*0.2)*100)/100, "Eagle");
    	this.paddock = paddock;
    	paddock.add(this);
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
    			this.setGestateTimer((double) 0);
        		this.setPregnant(false);
        		this.paddock.getEggPaddock().add(new Egg<Eagle>("babyEagle",this,this.paddock.getEggPaddock()));
            
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
			System.out.println("L'aigle "+this.getName()+" est maintenant dans la volliaire : "+ paddock.getName());
		} else {
			System.out.println("La volliaire "+paddock.getName()+" est plein");
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
