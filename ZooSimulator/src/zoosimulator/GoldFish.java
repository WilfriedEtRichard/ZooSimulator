package com.company;

public class GoldFish extends Animals implements AquaticAnimals,Oviparous {

    public GoldFish(String name, double weight, double size, double age, String sexe) {
        super(name,weight,age,size,sexe, "GoldFish");
    }

    /*public GoldFish(String sexe) {
        this.name = "NewGoldFish";
        this.sexe = sexe;
    }*/

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
            layEggs();
        }
    }

    @Override
    public void layEggs() {
        if((Math.random()<0.5)){
            //new GoldFish("Female");
            System.out.println("Is a Female");
        }else{
            //new GoldFish("Male");
            System.out.println("Male");
        }
    }
}