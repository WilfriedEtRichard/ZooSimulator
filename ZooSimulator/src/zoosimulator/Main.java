package zoosimulator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    	String s,e,b,p,w,t,wh,gf;
    	s="Shark";
    	e ="Eagle";
    	b ="Bear";
    	p ="Penguin";
    	w ="Wolf";
    	t ="Tiger";
    	wh ="Whale";
    	gf ="GoldFish";
    	
        AquaticPaddock<AquaticAnimals> Paddock1 = new AquaticPaddock<>("Paddock1",(double)20,(double)20,(double)20);
        Shark Sharky = new Shark(s);
        Shark Sharky2 = new Shark(s);
        Shark Sharky3 = new Shark(s);

        FlyingPaddock<FlyingAnimals> Paddock2 = new FlyingPaddock<>("Paddock2",(double)30,(double)30,(double)30);
        Eagle Eagly = new Eagle(e);
        Eagle Eagly2 = new Eagle(e);
        Eagle Eagly3 = new Eagle(e);

        EarthlyPaddock<EarthlyAnimals> Paddock3 = new EarthlyPaddock<>("Paddock3",(double)40,(double)40);
        Bear Beary = new Bear(b);
        Bear Beary2 = new Bear(b);
        Bear Beary3 = new Bear(b);

        Penguin Penguy = new Penguin(p);
        /*Wolf Wolfy = new Wolf(w);
        Tiger Tigy = new Tiger(t);
        Whale Whaly = new Whale(wh);
        GoldFish Goldy = new GoldFish(gf);*/

        System.out.println(Paddock1.toString());

        Paddock1.add(Sharky);
        Paddock1.add(Sharky2);
        Paddock1.add(Sharky3);

        
        System.out.println(Paddock1.toString());

        Paddock1.remove(Sharky);
        System.out.println(Paddock1.toString());

        System.out.println("----------------------------------------------------------------------");
        System.out.println(Paddock2.toString());

        Paddock2.add(Eagly);
        Paddock2.add(Eagly2);
        Paddock2.add(Eagly3);
        
        System.out.println(Paddock2.toString());

        Paddock2.remove(Eagly);
        System.out.println(Paddock2.toString());

        System.out.println("----------------------------------------------------------------------");       
        System.out.println(Paddock3.toString());

        Paddock3.add(Beary);
        Paddock3.add(Beary2);
        Paddock3.add(Beary3);

        
        System.out.println(Paddock3.toString());

        Paddock3.remove(Beary);
        System.out.println(Paddock3.toString());

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