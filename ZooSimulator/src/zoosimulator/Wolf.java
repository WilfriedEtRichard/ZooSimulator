package zoosimulator;

public class Wolf extends Animals implements EarthlyAnimals,Viviparous {
	private boolean wandering;
	
    public Wolf(double weight, double size) {
    	super(Math.floor((20.00+Math.random()*10)*100)/100, Math.floor((0.50+Math.random()*0.2)*100)/100, "Wolf");
		this.wandering=false;
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
            System.out.println("l'animal :"+this.getName()+" est un mâle il ne peux pas enfanter");
        }else{
            giveBirth();
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
