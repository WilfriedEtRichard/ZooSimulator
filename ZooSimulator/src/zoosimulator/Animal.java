package zoosimulator;

public abstract class Animal {
    private String species;
    private String name;
    private boolean gender;
    private double weight;
    private double size;
    private double age;
    private int hungerIndicator;
    private int sleepIndicator;
    private boolean asleep;
    private boolean sickness;
    private int healthIndicator;
    private boolean isPregnant;
    private double gestateTimer;

    public Animal(String name, double weight, double size, String Species) {
        this.species = Species;
        this.weight = weight;
        this.size = size;
        this.age = 0;
        this.sickness=false;
        this.hungerIndicator=10;
        this.sleepIndicator=10;
        this.healthIndicator=10;
        boolean gender;
		if(Math.random() < 0.5) {
			gender=false;
		}else {
			gender=false; //remettre a true pour faire des male (mais pour l'instant je veux des femelles pour faire des test de naissance
		}
		this.gender = gender;
		this.name = name;
    }
    public void growing() {
    	this.age += 0.1;
    	if(this.isPregnant == true) {
    		this.gestateTimer += 0.1;
    		this.birth();
    	}
    }
    
    public abstract void birth();
    
	public void giveName() {
    	
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
        this.setSickness(false);
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
    
    public boolean getSickness() {
    	return this.sickness;
    }
    
	public void beSick() {
		if(Math.floor(Math.random()*10.9) <= 1){
			this.setSickness(true);
		};
	}
    
    public void setSickness(boolean b) {
    	this.sickness=b;
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
		return this.asleep;
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
		String s = ""+this.getName()+" ("+this.getGender()+" "+this.getSpecies()+") \n"
					+"Age : "+this.getAge()+" ans | Weight : "+this.getWeight()+"kg | Size : "+this.getSize()
					+"m \n"+"Health : "+this.getHealthIndicator()+" | Hunger : "+this.getHungerIndicator()+" | Sleep : "+this.getSleepIndicator()
					+"m \n"+"Est enceinte ? : "+this.isPregnant()+" | De : "+this.getGestateTimer()+"an | son temps de gestation est de : ";		
		s = s+"\n"+"Action : "+this.getAction();
		s = s+"\n\n";
		return s;
	}
	public boolean isPregnant() {
		return isPregnant;
	}
	public void setPregnant(boolean isPregnant) {
		this.isPregnant = isPregnant;
	}
	
	public double getGestateTimer() {
		return gestateTimer;
	}

	public void setGestateTimer(double gestateTimer) {
		this.gestateTimer = gestateTimer;
	}

}

