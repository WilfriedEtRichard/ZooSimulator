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
    }


    public void eat() {
        System.out.println("l'animal :"+this.name+" mange");
        this.setHungerIndicator(false);
    }


    public void beHeal() {
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

        this.weight = weight;
    }

    public double getSize() {

        return this.size;
    }

    public void setSize(double size) {

        this.size = size;
    }

    public double getAge() {

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

}
