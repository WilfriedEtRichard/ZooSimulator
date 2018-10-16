package zoosimulator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        AquaticPaddock<AquaticAnimals> Paddock1 = new AquaticPaddock<>("Paddock1",(double)20,(double)20,(double)20);
        Shark Sharky = new Shark();
        Shark Sharky2 = new Shark();
        Shark Sharky3 = new Shark();

        FlyingPaddock<FlyingAnimals> Paddock2 = new FlyingPaddock<>("Paddock2",(double)30,(double)30,(double)30);
        Eagle Eagly = new Eagle();
        Eagle Eagly2 = new Eagle();
        Eagle Eagly3 = new Eagle();

        EarthlyPaddock<EarthlyAnimals> Paddock3 = new EarthlyPaddock<>("Paddock3",(double)40,(double)40);
        Bear Beary = new Bear();
        Bear Beary2 = new Bear();
        Bear Beary3 = new Bear();

        Penguin Penguy = new Penguin();
        /*Wolf Wolfy = new Wolf((double)80,(double)1.5);
        Tiger Tigy = new Tiger((double)120,(double)1.8);
        Whale Whaly = new Whale((double)700,(double)5);
        GoldFish Goldy = new GoldFish((double)2,(double)0.3);*/

        System.out.println(" ");

        Paddock1.toString();
        System.out.println(" ");

        Paddock1.add(Sharky);
        Paddock1.add(Sharky2);
        Paddock1.add(Sharky3);

        Paddock1.toString();
        System.out.println(" ");

        Paddock1.remove(Sharky);
        Paddock1.toString();

        System.out.println("----------------------------------------------------------------------");
        System.out.println(" ");

        Paddock2.toString();
        System.out.println(" ");

        Paddock2.add(Eagly);
        Paddock2.add(Eagly2);
        Paddock2.add(Eagly3);

        Paddock2.toString();
        System.out.println(" ");

        Paddock2.remove(Eagly);
        Paddock2.toString();

        System.out.println("----------------------------------------------------------------------");
        System.out.println(" ");

        Paddock3.toString();
        System.out.println(" ");

        Paddock3.add(Beary);
        Paddock3.add(Beary2);
        Paddock3.add(Beary3);

        Paddock3.toString();
        System.out.println(" ");

        Paddock3.remove(Beary);
        Paddock3.toString();

        System.out.println("----------------------------------------------------------------------");


        /*Sharky.move();
        Penguy.move();
        Eagly.move();
        Beary.move();
        Wolfy.move();
        Tigy.move();
        Whaly.move();
        Goldy.move();

        Sharky.birth();
        Penguy.birth();
        Eagly.birth();
        Beary.birth();
        Wolfy.birth();
        Tigy.birth();
        Whaly.birth();
        Goldy.birth();

        ArrayList<Animals> Tableau = new ArrayList<>();

        Tableau.add(Sharky);
        Tableau.add(Penguy);
        Tableau.add(Eagly);
        Tableau.add(Beary);
        Tableau.add(Wolfy);
        Tableau.add(Tigy);
        Tableau.add(Whaly);
        Tableau.add(Goldy);

        for (Animals Elem:Tableau) {
            System.out.println(Elem.toString());
        }

        for (Animals Elem:Tableau) {
            System.out.println(Elem.getSleepIndicator());
            Elem.wakeUp();
            System.out.println(Elem.getSleepIndicator());
            System.out.println(Elem.getHungerIndicator());
            Elem.eat();
            System.out.println(Elem.getHungerIndicator());
            //Elem.move();
            Elem.sound();
            System.out.println(Elem.getHealthIndicator());
            Elem.beHeal();
            System.out.println(Elem.getHealthIndicator());
            //Elem.birth();
            System.out.println(Elem.getSleepIndicator());
            Elem.fallAsleep();
            System.out.println(Elem.getSleepIndicator());
            System.out.println(" ");
        }*/

    }
}
