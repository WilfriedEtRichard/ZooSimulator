package zoosimulator;

public class Whale extends Animals implements AquaticAnimals,Viviparous{
    public String Species = "Whale";
    public String name;
    public String sexe;
    public double weight;
    public double size;
    public double age;
    public boolean hungerIndicator;
    public boolean sleepIndicator;
    public boolean healthIndicator;

    public Whale(String name, double weight, double size, double age, String sexe) {
        super(name,weight,age,size,sexe, "Whale");
    }

    /*public Whale(String sexe) {
        this.name = "NewWhale";
        this.sexe = sexe;
    }*/

    @Override
    public void swim() {
        System.out.println("l'animal :"+getName()+" nage");
    }


    public void move() {

        swim();
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
            //new Whale("Female");
            System.out.println("Is a Female");
        }else{
            //new Whale("Male");
            System.out.println("Male");
        }
    }
}

