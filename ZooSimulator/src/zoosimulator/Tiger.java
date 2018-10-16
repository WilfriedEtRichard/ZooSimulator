<<<<<<< HEAD
package com.company;

public class Tiger extends Animals implements EarthlyAnimals,Viviparous {

    public Tiger(String name, double weight, double size, double age, String sexe) {
        super(name,weight,age,size,sexe, "Tiger");
    }

    @Override
    public void walk() {
        System.out.println("l'animal :"+this.getName()+" marche");
    }

    public void move() {

        this.walk();
    }

    public void birth() {
        if (getSexe()=="Male"){
            System.out.println("l'animal :"+this.getName()+" est un mâle il ne peux pas enfanter");
        }else{
            this.giveBirth();
        }
    }
=======
package zoosimulator;

public class Tiger extends Animals implements EarthlyAnimals,Viviparous {
	private boolean wandering;
	
    public Tiger() {
    	super(Math.floor((30.00+Math.random()*10)*100)/100, Math.floor((0.30+Math.random()*0.2)*100)/100, "Tiger");
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
        if (this.isGender()){
            System.out.println("l'animal :"+this.getName()+" est un male il ne peux pas enfanter");
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
>>>>>>> refs/remotes/origin/master

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
<<<<<<< HEAD
=======

>>>>>>> refs/remotes/origin/master
}
