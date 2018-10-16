package zoosimulator;

public class Wolf extends Animals implements EarthlyAnimals,Viviparous {
    public String Species = "Wolf";
    public String name;
    public String sexe;
    public double weight;
    public double size;
    public double age;
    public boolean hungerIndicator;
    public boolean sleepIndicator;
    public boolean healthIndicator;

    public Wolf(String name, double weight, double size, double age, String sexe) {
        super(name,weight,age,size,sexe, "Wolf");
    }

    /*public Wolf(String sexe) {
        this.name = "NewWolf";
        this.sexe = sexe;
    }*/

    @Override
    public void walk() {
        System.out.println("l'animal :"+getName()+" marche");
    }


    public void move() {

        walk();
    }

    public void birth() {
        if (getSexe()=="Male"){
            System.out.println("l'animal :"+getName()+" est un mâle il ne peux pas enfanter");
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
}
