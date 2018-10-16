<<<<<<< HEAD
package com.company;

public class Wolf extends Animals implements EarthlyAnimals,Viviparous {
    public Wolf(String name, double weight, double size, double age, String sexe) {
        super(name,weight,age,size,sexe, "Wolf");
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
=======
package zoosimulator;

public class Wolf extends Animals implements EarthlyAnimals,Viviparous {
	private boolean wandering;
	
    public Wolf() {
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
>>>>>>> refs/remotes/origin/master
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
<<<<<<< HEAD
=======
	
>>>>>>> refs/remotes/origin/master
}
