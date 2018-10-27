package zoosimulator;

import java.util.ArrayList;

public class Wolf extends Animals implements EarthlyAnimals,Viviparous {
	private boolean wandering;
	private enum ageCategory {Old, Adult, Young};
	private ageCategory category;
	private double power;
	private double dominationValue;
	private String dominationRank;
	private double level;
	private boolean isImpetuous;
	private ArrayList<Wolf> pack;
	private double lifetime = 10.0;
	
	
    public Wolf(String name) {
    	super(name, Math.floor((20.00+Math.random()*10)*100)/100, Math.floor((0.50+Math.random()*0.2)*100)/100, "Wolf");
		this.wandering=false;
		double multGender;
		double multAge = 0;
		double multImpet;
		
		if (this.getGender()=="Male") {
			this.power = Math.random()*125;
		} else {
			this.power = Math.random()*100;
		}
		
		if (Math.random()<0.5) {
			this.isImpetuous = true;
		}else {
			this.isImpetuous = false;
		}
		
		if (this.getGender()=="Male") {
			multGender = 1.5;
		} else {
			multGender = 1;
		}
		this.category = ageCategory.Young;
		
		switch (this.getCategory()) {
			case "Old" : multAge = 0.75;
			case "Adult" : multAge = 1.25;
			case "Young" : multAge = 0.25;
		}
		
		if (this.isImpetuous) {
			multImpet = 1.25;
		}else {
			multImpet = 1;
		}
		
		this.level = (this.power+this.dominationValue)*multGender*multAge*multImpet;
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



	public double getPower() {
		return power;
	}



	public void setPower(double power) {
		this.power = power;
	}



	public double getDominationValue() {
		return dominationValue;
	}



	public void setDominationValue(double dominationValue) {
		this.dominationValue = dominationValue;
	}



	public String getDominationRank() {
		return dominationRank;
	}



	public void setDominationRank(String dominationRank) {
		this.dominationRank = dominationRank;
	}



	public double getLevel() {
		return level;
	}



	public void setLevel(double level) {
		this.level = level;
	}



	public boolean isImpetuous() {
		return isImpetuous;
	}



	public void setImpetuous(boolean isImpetuous) {
		this.isImpetuous = isImpetuous;
	}



	public ArrayList<Wolf> getPack() {
		return pack;
	}



	public void setPack(ArrayList<Wolf> pack) {
		this.pack = pack;
	}



	public double getLifetime() {
		return lifetime;
	}



	public void setLifetime(double lifetime) {
		this.lifetime = lifetime;
	}



	public String getCategory() {
		switch(this.category){
			case Old : return "Old";
				
				
			case Adult : return "Adult";
				
				
			case Young : return "Young";
				
			
		}
		return null;
	}



	public void setCategory(ageCategory category) {
		this.category = category;
	}
	
	public String toString() {
		String s = ""+this.getName()
					+" ("+this.getGender()
					+" "+this.getSpecies()+") \n"
					+"Age : "+this.getAge()
					+" ans | Weight : "+this.getWeight()
					+"kg | Size : "+this.getSize()+"m \n"
					+"Health : "+this.getHealthIndicator()
					+" | Hunger : "+this.getHungerIndicator()
					+" | Sleep : "+this.getSleepIndicator()
					+"\n ---------- \n"
					+"Durée de vie : "+this.getLifetime()+"ans \n"
					+"Niveau : "+this.getLevel()+"\n"
					+"Force : "+this.getPower()+"\n"
					+"Catégorie d'âge : "+this.getCategory()+"\n"
					+"Valeur de domination : "+this.getDominationValue()+"\n"
					+"Rang de domination : "+this.getDominationRank()+"\n"
					+"Est impétueux : "+this.isImpetuous()+"\n"
				
					+"\n ----------";	
		
		
		
		s = s+"\n"+"Action : "+this.getAction();
		s = s+"\n\n";
		return s;
	}
}
