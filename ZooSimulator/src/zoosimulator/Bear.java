package zoosimulator;

public class Bear extends Animals implements EarthlyAnimals,Viviparous {
	private boolean wandering;
	
    public Bear(double weight, double size) {
        super(weight, size, "Bear");

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
        if (this.isGender()){
            System.out.println("l'animal :"+this.getName()+" est un male il ne peux pas enfanter");
        }else{
            this.giveBirth();
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
