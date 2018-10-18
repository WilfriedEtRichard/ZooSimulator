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
        System.out.println("l'animal :"+this.getName()+" emet un son");
    }


    public void eat() {
        System.out.println("l'animal :"+this.getName()+" mange");
        this.setHungerIndicator(10);
    }


    public void beHeal() {
        System.out.println("l'animal :"+this.getName()+" est soigne");
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
        this.weight = weight;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getAge() {
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

}
