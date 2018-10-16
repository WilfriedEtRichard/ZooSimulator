package zoosimulator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        AquaticPaddock<AquaticAnimals> Paddock1 = new AquaticPaddock<>("Paddock1",(double)20,(double)20,(double)20);
        Shark Sharky = new Shark("Sharky",(double)300,(double)3,(double)3,"Male");
        Shark Sharky2 = new Shark("Sharky2",(double)200,(double)3,(double)3,"Male");
        Shark Sharky3 = new Shark("Sharky3",(double)100,(double)3,(double)3,"Male");

        FlyingPaddock<FlyingAnimals> Paddock2 = new FlyingPaddock<>("Paddock2",(double)30,(double)30,(double)30);
        Eagle Eagly = new Eagle("Eagly",(double)60,(double)0.5,(double)3,"Male");
        Eagle Eagly2 = new Eagle("Eagly2",(double)50,(double)0.5,(double)3,"Male");
        Eagle Eagly3 = new Eagle("Eagly3",(double)40,(double)0.5,(double)3,"Male");

        EarthlyPaddock<EarthlyAnimals> Paddock3 = new EarthlyPaddock<>("Paddock3",(double)40,(double)40);
        Bear Beary = new Bear("Beary",(double)250,(double)2.5,(double)3,"Male");
        Bear Beary2 = new Bear("Beary2",(double)200,(double)2.5,(double)3,"Male");
        Bear Beary3 = new Bear("Beary3",(double)150,(double)2.5,(double)3,"Male");

        Penguin Penguy = new Penguin("Penguy",(double)40,(double)1,(double)3,"Male");
        /*Wolf Wolfy = new Wolf("Wolfy",(double)80,(double)1.5,(double)3,"Male");
        Tiger Tigy = new Tiger("Tigy",(double)120,(double)1.8,(double)3,"Male");
        Whale Whaly = new Whale("Whaly",(double)700,(double)5,(double)3,"Male");
        GoldFish Goldy = new GoldFish("Goldy",(double)2,(double)0.3,(double)3,"Male");*/

        System.out.println(" ");

        Paddock1.toString();
        System.out.println(" ");

        Paddock1.add(Sharky);
        Paddock1.add(Penguy);
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
