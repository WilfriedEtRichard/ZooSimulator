<<<<<<< HEAD
package com.company;

public class Bear extends Animals implements EarthlyAnimals,Viviparous {

    public Bear(String name, double weight, double size, double age,String sexe) {
        super(name,weight,age,size,sexe,"bear");

    }

    public void move() {

        this.walk();
    }

    public void walk() {
        System.out.println("l'animal :"+this.getName()+" marche");
    }

    public void birth() {
        if (getSexe()=="Male"){
            System.out.println("l'animal :"+this.getName()+" est un mâle il ne peux pas enfanter");
        }else{
            this.giveBirth();
        }


=======
package zoosimulator;

public class Bear extends Animals implements EarthlyAnimals,Viviparous {
	private boolean wandering;
	
    public Bear() {
    	super(Math.floor((50.00+Math.random()*10)*100)/100, Math.floor((0.50+Math.random()*0.5)*100)/100, "Bear");
		this.wandering = false;
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
            System.out.println("l'animal :"+this.getName()+" est un male il ne peux pas enfanter");
        }else{
            this.giveBirth();
        }
>>>>>>> refs/remotes/origin/master
    }

    public void calcGestationPeriod() {

    }

    @Override
    public void giveBirth() {
        if((Math.random()<0.5)){
            //new Bear("Female");
            System.out.println("Is a Female");
        }else{
            //new Bear("Male");
            System.out.println("Male");
        }
    }
}
