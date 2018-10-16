package zoosimulator;

public class Whale extends Animals implements AquaticAnimals,Viviparous{
	private boolean swimming;
	
    public Whale(String name, double weight, double size, double age, String sexe) {
		super(Math.floor((100.00+Math.random()*30)*100)/100, Math.floor((0.50+Math.random()*0.5)*100)/100, "Whale");
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
        if (this.isGender()){
            System.out.println("l'animal :"+this.getName()+" est un mâle il ne peux pas enfanter");
        }else{
            this.giveBirth();
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

