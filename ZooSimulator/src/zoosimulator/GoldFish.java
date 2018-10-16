<<<<<<< HEAD
package com.company;

public class GoldFish extends Animals implements AquaticAnimals,Oviparous {

    public GoldFish(String name, double weight, double size, double age, String sexe) {
        super(name,weight,age,size,sexe, "GoldFish");
    }

    /*public GoldFish(String sexe) {
        this.name = "NewGoldFish";
        this.sexe = sexe;
    }*/

    @Override
    public void swim() {

        System.out.println("l'animal :"+this.getName()+" nage");
    }

    public void move() {

        this.swim();
    }

    public void birth() {
        if (getSexe()=="Male"){
            System.out.println("l'animal :"+this.getName()+" est un mâle il ne peux pas enfanter");
=======
package zoosimulator;

public class GoldFish extends Animals implements AquaticAnimals,Oviparous {
	private boolean swimming;
	
    public GoldFish() {
    	super(Math.floor((0.001+Math.random()*0.004)*1000)/1000, Math.floor((0.005+Math.random()*0.005)*1000)/1000, "Goldfish");
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

    public void birth() {
        if (this.isGender()){
            System.out.println("l'animal :"+this.getName()+" est un male il ne peux pas enfanter");
>>>>>>> refs/remotes/origin/master
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