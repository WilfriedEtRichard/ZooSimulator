<<<<<<< HEAD
package com.company;

public class Penguin extends Animals implements AquaticAnimals,FlyingAnimals,EarthlyAnimals,Oviparous {

    public Penguin(String name, double weight, double size, double age, String sexe) {
        super(name,weight,age,size,sexe, "Penguin");
    }

    @Override
    public void walk() {

        System.out.println("l'animal :"+this.getName()+" marche");
    }

    @Override
    public void fly() {

        System.out.println("l'animal :"+this.getName()+" vole");
    }

    @Override
    public void swim() {

        System.out.println("l'animal :"+this.getName()+" nage");
    }

    public void move() {

        this.walk();
    }

    public void move(int choix) {
        switch (choix){
            case 1:
                this.walk();
            case 2:
                this.swim();
            case 3:
                this.fly();
        }

    }

    public void birth() {
        if (getSexe()=="Male"){
            System.out.println("l'animal :"+this.getName()+" est un mâle il ne peux pas enfanter");
        }else{
            this.layEggs();
=======
package zoosimulator;

public class Penguin extends Animals implements AquaticAnimals,FlyingAnimals,EarthlyAnimals,Oviparous {
	private boolean wandering;
	private boolean swimming;
	private boolean flying;
	
    public Penguin() {
    	super(Math.floor((20.00+Math.random()*5)*100)/100, Math.floor((0.20+Math.random()*0.2)*100)/100, "Penguin");
		this.swimming = false;
		this.wandering = false;
		this.flying = false;
    }

	@Override
	public void wander() {
		this.wandering = true;
		this.swimming = false;
		this.flying = false;
	}

	@Override
	public boolean isWandering() {
		return this.wandering;
	}
	
	@Override
	public void swim() {
		this.swimming = true;
		this.wandering = false;
		this.flying = false;
	}

	@Override
	public boolean isSwimming() {
		return this.swimming;
	}
	
	@Override
	public void fly() {
		this.flying = true;
		this.swimming = false;
		this.wandering = false;
	}

	@Override
	public boolean isFlying() {
		return this.flying;
	}

	@Override
	public String getAction() {
		if(this.isWandering()) {
			return "Wandering";
		}else {
			if(this.isSwimming()) {
				return "Swimming";
			}else {
				if(this.isFlying()) {
					return "Flying";
				}else {
					return "Immobile";
				}
			}
		}	
	}

    public void birth() {
        if (this.isGender()){
            System.out.println("l'animal :"+this.getName()+" est un male il ne peux pas enfanter");
        }else{
            layEggs();
>>>>>>> refs/remotes/origin/master
        }
    }

    @Override
    public void layEggs() {
        if((Math.random()<0.5)){
            //new Penguin("Female");
            System.out.println("Is a Female");
        }else{
            //new Penguin("Male");
            System.out.println("Male");
        }
    }
}
