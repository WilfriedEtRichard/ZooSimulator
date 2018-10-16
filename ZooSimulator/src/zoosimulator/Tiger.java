package zoosimulator;

public class Tiger extends Animals implements EarthlyAnimals,Viviparous {
    public String Species = "Tiger";
    public String name;
    public String sexe;
    public double weight;
    public double size;
    public double age;
    public boolean hungerIndicator;
    public boolean sleepIndicator;
    public boolean healthIndicator;

    public Tiger(String name, double weight, double size, double age, String sexe) {
        super(name,weight,age,size,sexe, "Tiger");
    }

    /*public Tiger(String sexe) {
        this.name = "NewTiger";
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
            //new Tiger("Female");
            System.out.println("Is a Female");
        }else{
            //new Tiger("Male");
            System.out.println("Male");
        }
    }
}
