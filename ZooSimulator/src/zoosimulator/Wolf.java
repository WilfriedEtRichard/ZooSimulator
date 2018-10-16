package zoosimulator;

public class Wolf extends Animals implements EarthlyAnimals,Viviparous {
	private boolean wandering;
	
    public Wolf(double weight, double size) {
        super(weight, size, "Wolf");
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
        if (getGender()=="Male"){
            System.out.println("l'animal :"+getName()+" est un mâle il ne peux pas enfanter");
        }else{
            giveBirth();
        }


    }
    
	@Override
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
            //new Wolf("Female");
            System.out.println("Is a Female");
        }else{
            //new Wolf("Male");
            System.out.println("Male");
        }
    }
	
}
