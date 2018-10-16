package zoosimulator;

public class Eagle extends Animals implements FlyingAnimals,EarthlyAnimals,Oviparous {
    public String Species = "Eagle";
    public String name;
    public String sexe;
    public double weight;
    public double size;
    public double age;
    public boolean hungerIndicator;
    public boolean sleepIndicator;
    public boolean healthIndicator;

    public Eagle(String name, double weight, double size, double age, String sexe) {
        super(name,weight,age,size,sexe, "Eagle");
    }

    /*public Eagle(String sexe) {
        this.name = "NewEagle";
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

    public void move() {
        walk();
    }

    public void move(int choix) {
        switch (choix){
            case 1:
                walk();
            case 2:
                fly();
        }

    }

    public void birth() {
        if (getSexe()=="Male"){
            System.out.println("l'animal :"+name+" est un mâle il ne peux pas enfanter");
        }else{
            layEggs();
        }
    }

    @Override
    public void layEggs() {
        if((Math.random()<0.5)){
            //new Eagle("Female");
            System.out.println("Is a Female");
        }else{
            //new Eagle("Male");
            System.out.println("Male");
        }
    }

}
