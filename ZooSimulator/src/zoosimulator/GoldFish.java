package zoosimulator;

public class GoldFish extends Animals implements AquaticAnimals,Oviparous {
    public String Species = "GoldFish";
    public String name;
    public String sexe;
    public double weight;
    public double size;
    public double age;
    public boolean hungerIndicator;
    public boolean sleepIndicator;
    public boolean healthIndicator;

    public GoldFish(String name, double weight, double size, double age, String sexe) {
        super(name,weight,age,size,sexe, "GoldFish");
    }

    /*public GoldFish(String sexe) {
        this.name = "NewGoldFish";
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