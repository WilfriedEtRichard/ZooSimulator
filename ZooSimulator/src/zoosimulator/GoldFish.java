package zoosimulator;

public class GoldFish extends Animal implements AquaticAnimal,Oviparous {
	private boolean swimming;
	private double gestateDuration = 0.4;
	private AquaticPaddock<AquaticAnimal> paddock;

	
	
	
    public GoldFish(String name, AquaticPaddock<AquaticAnimal> paddock) {
    	super(name, Math.floor((0.001+Math.random()*0.004)*1000)/1000, Math.floor((0.005+Math.random()*0.005)*1000)/1000, "Goldfish");
    	paddock.add(this);
    	this.swimming = false;
		this.paddock = paddock;
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

	@Override
    public void birth() {
        if (this.isGender()){
            System.out.println("l'animal :"+this.getName()+" est un male il ne peux pas enfanter");
        }else{
            layEggs();
        }
    }

    @Override
    public void layEggs() {
    	if(this.getGestateTimer() >= this.gestateDuration) {
    			this.setGestateTimer((double) 0);
        		this.setPregnant(false);
                new Egg<GoldFish>("BabyGF",this,this.paddock.getEggPaddock());
            
    	}
        
    }


	public double getGestateDuration() {
		return gestateDuration;
	}

	public void setGestateDuration(double gestateDuration) {
		this.gestateDuration = gestateDuration;
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