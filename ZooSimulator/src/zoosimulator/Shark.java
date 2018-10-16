package com.company;

public class Shark extends Animals implements AquaticAnimals,Viviparous{

    public Shark(String name, double weight, double size, double age, String sexe) {
        super(name,weight,age,size,sexe, "Shark");
    }

    @Override
    public void swim() {

        System.out.println("l'animal :"+this.getName()+" nage");
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
            //new Shark("Female");
            System.out.println("Is a Female");
        }else{
            //new Shark("Male");
            System.out.println("Male");
        }
    }
}

