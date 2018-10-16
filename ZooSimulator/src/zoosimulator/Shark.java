package zoosimulator;

public class Shark extends Animals implements AquaticAnimals,Viviparous{
    public String Species = "Shark";
    public String name;
    public String sexe;
    public double weight;
    public double size;
    public double age;
    public boolean hungerIndicator = false;
    public boolean sleepIndicator = false;
    public boolean healthIndicator = false;

    public Shark(String name, double weight, double size, double age, String sexe) {
        super(name,weight,age,size,sexe, "Shark");
    }

    /*public Shark(String sexe) {
        this.name = "NewShark";
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
            //new Shark("Female");
            System.out.println("Is a Female");
        }else{
            //new Shark("Male");
            System.out.println("Male");
        }
    }
}

