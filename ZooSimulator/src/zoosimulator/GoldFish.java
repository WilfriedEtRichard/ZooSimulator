package zoosimulator;

public class GoldFish extends Animal implements AquaticAnimal,Oviparous {
	private boolean swimming;
	private double gestateDuration = 0.5;
	
	
	
    public GoldFish(String name) {
    	super(name, Math.floor((0.001+Math.random()*0.004)*1000)/1000, Math.floor((0.005+Math.random()*0.005)*1000)/1000, "Goldfish");
		this.swimming = false;
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
    		if((Math.random()<0.5)){
                new Egg<GoldFish>("Female",this);
                System.out.println("Is a Female");
            }else{
                new Egg<GoldFish>("Male",this);
                System.out.println("Is a Male");
            }
    		this.setGestateTimer((double) 0);
    		this.setPregnant(false);
    	}
        
    }


	public double getGestateDuration() {
		return gestateDuration;
	}

	public void setGestateDuration(double gestateDuration) {
		this.gestateDuration = gestateDuration;
	}
}