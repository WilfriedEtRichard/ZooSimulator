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
