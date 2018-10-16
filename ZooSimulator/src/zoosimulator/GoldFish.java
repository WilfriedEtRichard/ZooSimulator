package zoosimulator;

public class GoldFish extends Animals implements AquaticAnimals,Oviparous {
	private boolean swimming;
	
    public GoldFish(double weight, double size) {
        super(weight, size, "GoldFish");
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
            System.out.println("l'animal :"+this.getName()+" est un mâle il ne peux pas enfanter");
        }else{
            layEggs();
        }
    }

    @Override
    public void layEggs() {
        if((Math.random()<0.5)){
            //new GoldFish("Female");
            System.out.println("Is a Female");
        }else{
            //new GoldFish("Male");
            System.out.println("Male");
        }
    }
}