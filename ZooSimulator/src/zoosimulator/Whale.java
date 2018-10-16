package com.company;

public class Whale extends Animals implements AquaticAnimals,Viviparous{

    public Whale(String name, double weight, double size, double age, String sexe) {
        super(name,weight,age,size,sexe, "Whale");
    }

    @Override
    public void swim() {
        System.out.println("l'animal :"+this.getName()+" nager");
    }


    public void move() {

        this.swim();
    }

    public void birth() {
        if (getSexe()=="Male"){
            System.out.println("l'animal :"+this.getName()+" est un mâle il ne peux pas enfanter");
        }else{
            this.giveBirth();
        }
    }

    public void calcGestationPeriod() {

    }

    @Override
    public void giveBirth() {
        if((Math.random()<0.5)){
            //new Whale("Female");
            System.out.println("Is a Female");
        }else{
            //new Whale("Male");
            System.out.println("Male");
        }
    }
}

