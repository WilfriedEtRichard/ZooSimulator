package zoosimulator;

public class Whale extends Animal implements AquaticAnimal,Viviparous{
	private boolean swimming;
	private double gestateDuration = 1;
	private AquaticPaddock<AquaticAnimal> paddock;
	
    public Whale(String name, AquaticPaddock<AquaticAnimal> paddock) {
		super(name, Math.floor((100.00+Math.random()*30)*100)/100, Math.floor((0.50+Math.random()*0.5)*100)/100, "Whale");
		this.paddock = paddock;
		this.swimming=false;
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
    	if(this.getGestateTimer() >= this.gestateDuration) {
	        if (this.isGender()){
	            System.out.println("l'animal :"+this.getName()+" est un mâle il ne peux pas enfanter");
	        }else{
	            this.giveBirth();
	        }
    	}
    }

    public void calcGestationPeriod() {

    }

    @Override
    public void giveBirth() {
            this.paddock.add(new Whale("BabyWhale", paddock));
    }
    
    public void setPaddock(AquaticPaddock<AquaticAnimal> paddock) {
		if(paddock.getResident().size()<paddock.getMaxAnimals()) {
			this.paddock.remove(this);
			paddock.add(this);
			this.paddock = paddock;
			System.out.println("La balaine "+this.getName()+" est maintenant dans l'aquarium : "+ paddock.getName());
		} else {
			System.out.println("L'aquarium "+paddock.getName()+" est plein");
		}
	}
}

