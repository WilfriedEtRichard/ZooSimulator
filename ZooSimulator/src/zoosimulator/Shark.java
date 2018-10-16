<<<<<<< HEAD
package com.company;

public class Shark extends Animals implements AquaticAnimals,Viviparous{

    public Shark(String name, double weight, double size, double age, String sexe) {
        super(name,weight,age,size,sexe, "Shark");
    }

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
        }else{
            this.giveBirth();
=======
package zoosimulator;

public class Shark extends Animals implements AquaticAnimals,Viviparous{
	private boolean swimming;

    public Shark() {
    	super(Math.floor((50.00+Math.random()*10)*100)/100, Math.floor((0.50+Math.random()*0.5)*100)/100, "Shark");
		this.swimming = ! this.swimming;
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
        }else{
            giveBirth();
>>>>>>> refs/remotes/origin/master
        }
    }

    public void calcGestationPeriod() {

    }

    @Override
    public void giveBirth() {
        if((Math.random()<0.5)){
            //new Shark("Female");
            System.out.println("Is a Female");
        }else{
            //new Shark("Male");
            System.out.println("Male");
        }
    }
}

