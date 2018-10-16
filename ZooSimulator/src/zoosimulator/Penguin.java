package zoosimulator;

public class Penguin extends Animals implements AquaticAnimals,FlyingAnimals,EarthlyAnimals,Oviparous {
    public String Species = "Penguin";
    public String name;
    public String sexe;
    public double weight;
    public double size;
    public double age;
    public boolean hungerIndicator;
    public boolean sleepIndicator;
    public boolean healthIndicator;

    public Penguin(String name, double weight, double size, double age, String sexe) {
        super(name,weight,age,size,sexe, "Penguin");
    }

    /*public Penguin(String sexe) {
        this.name = "NewPenguin";
        this.sexe = sexe;
    }*/

    @Override
    public void walk() {
        System.out.println("l'animal :"+getName()+" marche");
    }

    @Override
    public void fly() {
        System.out.println("l'animal :"+getName()+" vole");
    }

    @Override
    public void swim() {
        System.out.println("l'animal :"+getName()+" nage");
    }

    public void move() {
        walk();
    }

    public void move(int choix) {
        switch (choix){
            case 1:
                walk();
            case 2:
                swim();
            case 3:
                fly();
        }

    }

    public void birth() {
        if (getSexe()=="Male"){
            System.out.println("l'animal :"+getName()+" est un mâle il ne peux pas enfanter");
        }else{
            layEggs();
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
