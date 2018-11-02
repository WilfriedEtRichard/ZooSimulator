package zoosimulator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    	String s,e,b,p,w,t,wh,gf,s2,e2,b2,p2,w2,t2,wh2,gf2,s3,e3,b3,p3,w3,t3,wh3,gf3;
    	s ="Shark";
    	e ="Eagle";
    	b ="Bear";
    	p ="Penguin";
    	w ="Wolf";
    	t ="Tiger";
    	wh ="Whale";
    	gf ="GoldFish";
    	
    	s2 ="Shark2";
    	e2 ="Eagle2";
    	b2 ="Bear2";
    	p2 ="Penguin2";
    	w2 ="Wolf2";
    	t2 ="Tiger2";
    	wh2 ="Whale2";
    	gf2 ="GoldFish2";
    	
    	s3 ="Shark3";
    	e3 ="Eagle3";
    	b3 ="Bear3";
    	p3 ="Penguin3";
    	w3 ="Wolf3";
    	t3 ="Tiger3";
    	wh3 ="Whale3";
    	gf3 ="GoldFish3";
    	
    	String zN = "BestZoo";
    	String wN = "BestWorker";
    	
    	Zoo Zoo = new Zoo(zN, wN, false, 8);
    	
    	EggPaddock<Egg<Oviparous>> EagleEggPaddock = new EggPaddock<Egg<Oviparous>>("EagleEggPaddock",(double)40,(double)40);
    	EggPaddock<Egg<Oviparous>> PenguinEggPaddock = new EggPaddock<Egg<Oviparous>>("PenguinEggPaddock",(double)40,(double)40);
    	EggPaddock<Egg<Oviparous>> GoldfishEggPaddock = new EggPaddock<Egg<Oviparous>>("GoldfishEggPaddock",(double)40,(double)40);
    	
    	FlyingPaddock<FlyingAnimal> EaglePaddock = new FlyingPaddock<>("EaglePaddock",(double)40,(double)40,(double)40, EagleEggPaddock);
    	Eagle eagle = new Eagle(e,EaglePaddock);
    	Eagle eagle2 = new Eagle(e2,EaglePaddock);
    	Eagle eagle3 = new Eagle(e3,EaglePaddock);
    	
    	AquaticPaddock<AquaticAnimal> PenguinPaddock = new AquaticPaddock<>("PenguinPaddock",(double)20,(double)20,(double)20, PenguinEggPaddock);
    	Penguin penguin = new Penguin(p,PenguinPaddock);
    	Penguin penguin2 = new Penguin(p2,PenguinPaddock);
    	Penguin penguin3 = new Penguin(p3,PenguinPaddock);    		
    	
    	AquaticPaddock<AquaticAnimal> GoldfishPaddock = new AquaticPaddock<>("GoldfishPaddock",(double)20,(double)20,(double)20, GoldfishEggPaddock);
    	GoldFish GoldFish = new GoldFish(gf,GoldfishPaddock);
    	GoldFish GoldFish2 = new GoldFish(gf2,GoldfishPaddock);
    	GoldFish GoldFish3 = new GoldFish(gf3,GoldfishPaddock);
    	
    	AquaticPaddock<AquaticAnimal> SharkPaddock = new AquaticPaddock<>("SharkPaddock",(double)20,(double)20,(double)20);
    	Shark Shark = new Shark(s,SharkPaddock);
    	Shark Shark2 = new Shark(s2,SharkPaddock);
    	Shark Shark3 = new Shark(s3,SharkPaddock);
    	
    	AquaticPaddock<AquaticAnimal> WhalePaddock = new AquaticPaddock<>("WhalePaddock",(double)20,(double)20,(double)20);
    	Whale Whale = new Whale(wh,WhalePaddock);
    	Whale Whale2 = new Whale(wh2,WhalePaddock);
    	Whale Whale3 = new Whale(wh3,WhalePaddock);
    	
    	EarthlyPaddock<EarthlyAnimal> BearPaddock = new EarthlyPaddock<>("BearPaddock",(double)20,(double)20);
    	Bear Bear = new Bear(b,BearPaddock);
    	Bear Bear2 = new Bear(b2,BearPaddock);
    	Bear Bear3 = new Bear(b3,BearPaddock);
    	
    	EarthlyPaddock<EarthlyAnimal> TigerPaddock = new EarthlyPaddock<>("TigerPaddock",(double)20,(double)20);
    	Tiger Tiger = new Tiger(t,TigerPaddock);
    	Tiger Tiger2 = new Tiger(t2,TigerPaddock);
    	Tiger Tiger3 = new Tiger(t3,TigerPaddock);
    	
    	EaglePaddock.add(eagle);
    	PenguinPaddock.add(penguin);
    	GoldfishPaddock.add(GoldFish);
    	SharkPaddock.add(Shark);
    	WhalePaddock.add(Whale);
    	BearPaddock.add(Bear);
    	TigerPaddock.add(Tiger);
    	    	
    	EaglePaddock.add(eagle2);
    	PenguinPaddock.add(penguin2);
    	GoldfishPaddock.add(GoldFish2);
    	SharkPaddock.add(Shark2);
    	WhalePaddock.add(Whale2);
    	BearPaddock.add(Bear2);
    	TigerPaddock.add(Tiger2);
    	
    	EaglePaddock.add(eagle3);
    	PenguinPaddock.add(penguin3);
    	GoldfishPaddock.add(GoldFish3);
    	SharkPaddock.add(Shark3);
    	WhalePaddock.add(Whale3);
    	BearPaddock.add(Bear3);
    	TigerPaddock.add(Tiger3);

    	/*System.out.println("------------------------------------------------------------");
    	System.out.println(EaglePaddock.toString());
    	System.out.println("------------------------------------------------------------");
    	System.out.println(PenguinPaddock.toString());
    	System.out.println("------------------------------------------------------------");
    	System.out.println(GoldfishPaddock.toString());
    	System.out.println("------------------------------------------------------------");
    	System.out.println(SharkPaddock.toString());
    	System.out.println("------------------------------------------------------------");
    	System.out.println(WhalePaddock.toString());
    	System.out.println("------------------------------------------------------------");
    	System.out.println(BearPaddock.toString());
    	System.out.println("------------------------------------------------------------");
    	System.out.println(TigerPaddock.toString());
    	System.out.println("------------------------------------------------------------");*/
    	
    	ArrayList<Paddock> Array = new ArrayList<>();
    	
    	Array.add(EagleEggPaddock);
    	Array.add(PenguinEggPaddock);
    	Array.add(GoldfishEggPaddock);
    	Array.add(EaglePaddock);
    	Array.add(PenguinPaddock);
    	Array.add(GoldfishPaddock);
    	Array.add(SharkPaddock);
    	Array.add(WhalePaddock);
    	Array.add(BearPaddock);
    	Array.add(TigerPaddock);
    	
    	
    	Zoo.setPaddocks(Array);
    	
    	System.out.println(Zoo.toString());
    	
    	Zoo.play();
    	
    	
    }
}
