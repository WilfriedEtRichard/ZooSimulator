package zoosimulator;

public abstract class Animals {
    public String Species;
    public String name;
    public String sexe;
    public double weight;
    public double size;
    public double age;
    public boolean hungerIndicator;
    public boolean sleepIndicator;
    public boolean healthIndicator;

    public Animals(String name, double weight, double size, double age, String sexe, String Species) {
        this.name = name;
        this.weight = weight;
        this.size = size;
        this.age = age;
        this.sexe = sexe;
        this.Species = Species;
    }

    public void sound() {
        System.out.println("l'animal :"+name+" emet un son");
    }


    public void eat() {
        System.out.println("l'animal :"+name+" mange");
        setHungerIndicator(false);
    }


    public void beHeal() {
        System.out.println("l'animal :"+name+" est soigné");
        setHealthIndicator(false);
    }

    public void wakeUp() {
        System.out.println("l'animal :"+name+" ce reveille");
        setSleepIndicator(false);
    }


    public void fallAsleep() {
        System.out.println("l'animal :"+name+" s'endort");
        setSleepIndicator(true);
    }

    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String Species) {
        this.Species = Species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

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

    public boolean getHungerIndicator() {
        return hungerIndicator;
    }

    public void setHungerIndicator(boolean hungerIndicator) {
        this.hungerIndicator = hungerIndicator;
    }

    public boolean getSleepIndicator() {
        return sleepIndicator;
    }

    public void setSleepIndicator(boolean sleepIndicator) {
        this.sleepIndicator = sleepIndicator;
    }

    public boolean getHealthIndicator() {
        return healthIndicator;
    }

    public void setHealthIndicator(boolean healthIndicator) {
        this.healthIndicator = healthIndicator;
    }

    public String toString(){
        return (getName()+" est un "+getSpecies()+" "+getSexe()+" de "+getAge()+" ans. Il mesure : "+getSize()+"m et pèse : "+getWeight()+"Kg");
    }

}
