package zoosimulator;

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
    	
    	EggPaddock<Egg<Oviparous>> Paddock1 = new EggPaddock<Egg<Oviparous>>("Paddock1",(double)40,(double)40);
    	AquaticPaddock<AquaticAnimal> Paddock3 = new AquaticPaddock<AquaticAnimal>("Paddock3",(double)40,(double)40,(double)40, Paddock1);
        GoldFish Goldy = new GoldFish(gf, Paddock3);
        Paddock3.add(Goldy);
        
        Goldy.growing();
        Goldy.setPregnant(true);
        
        for(int i=0;i<5;i++) {
        	System.out.println("Je grandie");
            Goldy.growing();
        }
        
        System.out.println("----------------------------------------------------------------------");
        
        System.out.println("EggPaddock");
        System.out.println(Paddock1.getResident().get(0).toString());
        for(int i=0;i<3;i++) {
        	System.out.println("Je grandie");
        	Paddock1.getResident().get(0).hatching();
        }
        
        System.out.println("----------------------------------------------------------------------");
        
        System.out.println("AquaticPaddock");
        for(int i=0;i<Paddock3.getResident().size();i++) {
        	System.out.println(Paddock3.getResident().get(i));
        }
        
        System.out.println("----------------------------------------------------------------------");
        
 /* 
        ArrayList<Paddock> ListP = new ArrayList<Paddock>();
        ListP.add(Paddock1);
        
        Zoo Zoo1 = new Zoo("Zoo1","Richard",true,22);
        Zoo1.setPaddocks(ListP);
        
        */
        /*for(int i=0;i<=Zoo1.getPaddocks().size();++i) {
			for(int j=0;j<((Paddock<AquaticAnimals>) Zoo1.getPaddocks().get(i)).getResident().size();++j) {
				System.out.println(i+":"+j+":"+((Paddock<AquaticAnimals>) Zoo1.getPaddocks().get(i)).getResident().get(j).getClass());
				
			}
		}*/
        //System.out.println(((Animals) ((Paddock) Zoo1.getPaddocks().get(0)).getAnimal(0)).getClass());
        //System.out.println(((Paddock) Zoo1.getPaddocks().get(0)).getAnimal(0).toString());
        //Zoo1.timelapse();
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
