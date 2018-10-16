package zoosimulator;

public class Whale extends Animals implements AquaticAnimals,Viviparous{
	private boolean swimming;	
	
    public Whale(double weight, double size) {
        super(weight, size, "Whale");
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

    public void birth() {
        if (this.isGender()){
            System.out.println("l'animal :"+getName()+" est un mâle il ne peux pas enfanter");
        }else{
            giveBirth();
        }
    }

    public void calcGestationPeriod() {

    }

    @Override
    public void giveBirth() {
        if((Math.random()<0.5)){
            //new Whale("Female");
            System.out.println("Is a Female");
        }else{
            //new Whale("Male");
            System.out.println("Male");
        }
    }
}

