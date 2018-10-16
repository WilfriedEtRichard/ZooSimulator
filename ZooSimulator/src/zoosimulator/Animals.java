<<<<<<< HEAD
package com.company;

public abstract class Animals {
    private String Species;
    private String name;
    private String sexe;
    private double weight;
    private double size;
    private double age;
    private boolean hungerIndicator;
    private boolean sleepIndicator;
    private boolean healthIndicator;

    public Animals(String name, double weight, double size, double age, String sexe, String Species) {
        this.name = name;
        this.weight = weight;
        this.size = size;
        this.age = age;
        this.sexe = sexe;
        this.Species = Species;
    }

    public void sound() {

        System.out.println("l'animal :"+this.name+" emet un son");
=======
package zoosimulator;

import java.util.Scanner;

public abstract class Animals {
    public String species;
    public String name;
    public boolean gender;
    public double weight;
    public double size;
    public double age;
    public int hungerIndicator;
    public int sleepIndicator;
    public boolean asleep;
    public int healthIndicator;

    public Animals(double weight, double size, String Species) {
        this.species = Species;
        this.weight = weight;
        this.size = size;
        this.age = 0;
        boolean gender;
		if(Math.random() < 0.5) {
			gender=false;
		}else {
			gender =true;
		}
		this.gender = gender;
		Scanner sc = new Scanner(System.in);
		System.out.println("Give a name to your "+this.getGender()+" "+this.getSpecies()+" :");
		String name = sc.nextLine();
		this.name = name;
        
    }

    public void sound() {
        System.out.println("l'animal :"+name+" emet un son");
>>>>>>> refs/remotes/origin/master
    }


    public void eat() {
<<<<<<< HEAD
        System.out.println("l'animal :"+this.name+" mange");
        this.setHungerIndicator(false);
=======
        System.out.println("l'animal :"+name+" mange");
        this.setHungerIndicator(10);
>>>>>>> refs/remotes/origin/master
    }


    public void beHeal() {
<<<<<<< HEAD
        System.out.println("l'animal :"+this.name+" est soigné");
        this.setHealthIndicator(false);
    }

    public void wakeUp() {
        System.out.println("l'animal :"+this.name+" ce reveille");
        this.setSleepIndicator(false);
    }


    public void fallAsleep() {
        System.out.println("l'animal :"+this.name+" s'endort");
        this.setSleepIndicator(true);
    }

    public String getSpecies() {

        return this.Species;
    }

    public void setSpecies(String Species) {

        this.Species = Species;
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSexe() {

        return this.sexe;
    }

    public void setSexe(String sexe) {

        this.sexe = sexe;
    }

    public double getWeight() {

        return this.weight;
    }

    public void setWeight(double weight) {

=======
        System.out.println("l'animal :"+name+" est soigne");
        this.setHealthIndicator(10);
    }

    public void toggleSleep() {
    	this.setAsleep(!this.isAsleep());
    	if(this.isAsleep()) {
            System.out.println("L'animal :"+name+" s'endort");
    	}else {
            System.out.println("L'animal :"+name+" se reveille");
            this.setSleepIndicator(10);
    	}

    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String Species) {
        this.species = Species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public boolean isAsleep() {
		return asleep;
	}
    
    public String getAsleep() {
    	if(this.isAsleep()) {
    		return "Zzzz";
    	}else {
    		return " ";
    	}
		
	}

	public void setAsleep(boolean asleep) {
		this.asleep = asleep;
	}

	public boolean isGender() {
        return this.gender;
    }
    
	public String getGender() {
		if(this.isGender()) {
			return "Male";
		}else {
			return "Female";
		}
		
	}

	public abstract String getAction();
	
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
>>>>>>> refs/remotes/origin/master
        this.weight = weight;
    }

    public double getSize() {
<<<<<<< HEAD

        return this.size;
    }

    public void setSize(double size) {

=======
        return size;
    }

    public void setSize(double size) {
>>>>>>> refs/remotes/origin/master
        this.size = size;
    }

    public double getAge() {
<<<<<<< HEAD

        return this.age;
    }

    public void setAge(double age) {

        this.age = age;
    }

    public boolean getHungerIndicator() {

        return this.hungerIndicator;
    }

    public void setHungerIndicator(boolean hungerIndicator) {

        this.hungerIndicator = hungerIndicator;
    }

    public boolean getSleepIndicator() {

        return this.sleepIndicator;
    }

    public void setSleepIndicator(boolean sleepIndicator) {

        this.sleepIndicator = sleepIndicator;
    }

    public boolean getHealthIndicator() {

        return this.healthIndicator;
    }

    public void setHealthIndicator(boolean healthIndicator) {

        this.healthIndicator = healthIndicator;
    }

    public String toString(){
        return (this.getName()
                +" est un "
                +this.getSpecies()
                +" "
                +this.getSexe()
                +" de "
                +this.getAge()
                +" ans. Il mesure : "
                +this.getSize()
                +"m et pèse : "
                +this.getWeight()
                +"Kg");
    }
=======
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public int getHungerIndicator() {
        return hungerIndicator;
    }

    public void setHungerIndicator(int hungerIndicator) {
        this.hungerIndicator = hungerIndicator;
    }

    public int getSleepIndicator() {
        return sleepIndicator;
    }

    public void setSleepIndicator(int sleepIndicator) {
        this.sleepIndicator = sleepIndicator;
    }

    public int getHealthIndicator() {
        return healthIndicator;
    }

    public void setHealthIndicator(int healthIndicator) {
        this.healthIndicator = healthIndicator;
    }

	public String toString() {
		String s = ""+this.getName()+" ("+this.getGender()+" "+this.getSpecies()+") \n"+"Age : "+this.getAge()+" ans | Weight : "+this.getWeight()+"kg | Size : "+this.getSize()+"m \n"+"Health : "+this.getHealthIndicator()+" | Hunger : "+this.getHungerIndicator()+" | Sleep : "+this.getSleepIndicator();		
		s = s+"\n"+"Action : "+this.getAction();
		s = s+"\n";
		return s;
	}
>>>>>>> refs/remotes/origin/master

}
