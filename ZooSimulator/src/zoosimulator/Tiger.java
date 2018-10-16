package zoosimulator;

public class Tiger extends Animals implements EarthlyAnimals,Viviparous {
	private boolean wandering;
	
    public Tiger(String name, double weight, double size) {
        super(weight, size, "Tiger");
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
        if (this.getGender()=="Male"){
            System.out.println("l'animal :"+this.getName()+" est un mâle il ne peux pas enfanter");
        }else{
            giveBirth();
        }
    }
    
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
            //new Tiger("Female");
            System.out.println("Is a Female");
        }else{
            //new Tiger("Male");
            System.out.println("Male");
        }
    }

}
