package zoosimulator;

public class Penguin extends Animal implements AquaticAnimal,FlyingAnimal,EarthlyAnimal,Oviparous {
	private boolean wandering;
	private boolean swimming;
	private boolean flying;
	private double gestateDuration;
	private AquaticPaddock<AquaticAnimal> paddock;
	
    public Penguin(String name, AquaticPaddock<AquaticAnimal> paddock) {
    	super(name, Math.floor((20.00+Math.random()*5)*100)/100, Math.floor((0.20+Math.random()*0.2)*100)/100, "Penguin");
    	this.paddock = paddock;
		this.swimming = false;
		this.wandering = false;
		this.flying = false;
    }

	@Override
	public void wander() {
		this.wandering = true;
		this.swimming = false;
		this.flying = false;
	}

	@Override
	public boolean isWandering() {
		return this.wandering;
	}
	
	@Override
	public void swim() {
		this.swimming = true;
		this.wandering = false;
		this.flying = false;
	}

	@Override
	public boolean isSwimming() {
		return this.swimming;
	}
	
	@Override
	public void fly() {
		this.flying = true;
		this.swimming = false;
		this.wandering = false;
	}

	@Override
	public boolean isFlying() {
		return this.flying;
	}

	@Override
	public String getAction() {
		if(this.isWandering()) {
			return "Wandering";
		}else {
			if(this.isSwimming()) {
				return "Swimming";
			}else {
				if(this.isFlying()) {
					return "Flying";
				}else {
					return "Immobile";
				}
			}
		}	
	}

    public void birth() {
    	if(this.getGestateTimer() >= this.gestateDuration) {
	        if (this.isGender()){
	            System.out.println("l'animal :"+this.getName()+" est un male il ne peux pas enfanter");
	        }else{
	            layEggs();
	        }
    	}
    }

    @Override
    public void layEggs() {
    	if(this.getGestateTimer() >= this.gestateDuration) {
    		if((Math.random()<0.5)){
                new Egg<Penguin>("PenguinFemale",this);
                System.out.println("Is a Female");
            }else{
                new Egg<Penguin>("PenguinMale",this);
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

	public AquaticPaddock<AquaticAnimal> getPaddock() {
		return paddock;
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

	@Override
	public FlyingPaddock<FlyingAnimal> getPaddock2() {
		// TODO Auto-generated method stub
		return null;
	}
}
