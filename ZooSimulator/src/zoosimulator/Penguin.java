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
