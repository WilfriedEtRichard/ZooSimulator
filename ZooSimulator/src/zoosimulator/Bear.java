package zoosimulator;

public class Bear extends Animals implements EarthlyAnimals,Viviparous {
    public String Species = "Bear";
    public String name;
    public String sexe;
    public double weight;
    public double size;
    public double age;
    public boolean hungerIndicator;
    public boolean sleepIndicator;
    public boolean healthIndicator;

    public Bear(String name, double weight, double size, double age,String sexe) {
        super(name,weight,age,size,sexe,"bear");

    }

    /*public Bear(String sexe,) {
        this.name = "NewBear";
        this.sexe = sexe;
    }*/

    public void move() {

        walk();
    }

    public void walk() {
        System.out.println("l'animal :"+getName()+" marche");
    }

    public void birth() {
        if (getSexe()=="Male"){
            System.out.println("l'animal :"+this.getName()+" est un mâle il ne peux pas enfanter");
        }else{
            giveBirth();
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
