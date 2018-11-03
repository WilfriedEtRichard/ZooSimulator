package zoosimulator;

import java.util.ArrayList;
import java.util.Scanner;

import zoosimulator.Paddock.State;

public class Zoo<T extends Paddock<T>> {
	private String name;
	private Worker worker;
	private static final int MAX_PADDOCK = 20;
    private ArrayList<Paddock<T>> paddocks;
    
    public Zoo(String name, String workerName, boolean workerGender, int workerAge) {
		this.name=name;
		worker = Worker.getInstance(workerName, workerGender, workerAge);
		this.paddocks = new ArrayList<>(MAX_PADDOCK);
    }
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Worker getWorker() {
		return worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	public ArrayList<Paddock<T>> getPaddocks() {
		return this.paddocks;
	}

	public void setPaddocks(ArrayList<Paddock<T>> paddocks) {
		this.paddocks = paddocks;
	}

	public static int getMaxPaddock() {
		return MAX_PADDOCK;
	}

	public int nbAnimaux() {
		int nb=0;
		for(int i=0;i<getMaxPaddock();++i) {
			nb+=this.getPaddocks().get(i).getResident().size();
		}
    	return nb;
    }
	
	public String getPaddocksString() {
		String s = "";
		for(int i=0;i<=MAX_PADDOCK;++i) {
			s+= i+". "+this.getPaddocks().get(i).getName()+"\n";
		}
		return s;
	}
	
	public String toString() {
		String s="";
		for(int i=0;i<this.paddocks.size()-1;++i) {
			s+=this.getPaddocks().get(i).getResident().toString();
		}
		return s;
	}
	
	public int aleat3() {
		return (int) Math.floor(Math.random()*3.9);
	}
	
	public void changePaddock(Paddock<T> p) {
		if(aleat3()<1) {
			switch(p.getState()) {
				case GOOD: p.setState(State.CORRECT);
				break;
				case CORRECT: p.setState(State.BAD);
				break;
				case BAD: break; 
			}
		}
		if(p.getSpecialState() != null) {
			if(aleat3()<1) {
				switch(p.getSpecialState()) {
					case GOOD: p.setSpecialState(State.CORRECT);
					break;
					case CORRECT: p.setSpecialState(State.BAD);
					break;
					case BAD: break; 
				}
			}
		}
		
	}
	
	
	public void changeAnimal(Animal a, int i) {
		
		a.growing();
		
		if(Math.random() < 0.5) {
			a.findSexualPartner(this.paddocks.get(i).getAnimal((int) Math.random()*this.paddocks.get(i).getResident().size()));
		}
		a.setHungerIndicator(a.getHungerIndicator()-this.aleat3());
		a.beSick();
		if(a.getSickness()) {
			a.setHealthIndicator(a.getHealthIndicator()-this.aleat3());
		}
		if(a.isAsleep()) {
			a.toggleSleep();
		}else if(a.getSleepIndicator()<1) {
			a.toggleSleep();
		}
	}
	
	public void timelapse() {
		for(int i=0;i<=this.getPaddocks().size()-1;++i) {
			this.changePaddock(this.getPaddocks().get(i));
			for(int j=0;j<=((Paddock<T>) this.getPaddocks().get(i)).getResident().size()-1;++j) {
				this.changeAnimal(((Paddock<T>) this.getPaddocks().get(i)).getAnimal(j),i);
			}
		}
		this.play();
	}
	
	public void play() {
		int a = 0;
		int b = 0;
		int c = 0;
		int choice=0;
		while(this.getWorker().getPtsAction()>0) {
			System.out.println(this.getWorker().actions());
			Scanner sc = new Scanner(System.in);
			System.out.println("Veuillez saisir une action avec son chiffre :");
			
			choice = sc.nextInt();
			switch(choice) {
				case 1 :
					System.out.println("Quel enclos doit-il examiner :");
					this.selectPaddock();
					a = sc.nextInt();
					this.getWorker().examine(this.paddocks.get(a));
					break;
					
				case 2 :
					System.out.println("Quel enclos doit-il nettoyer :");
					this.selectPaddock();
					a = sc.nextInt();
					this.getWorker().clean(this.paddocks.get(a));
					break;					
				
				case 3 :
					System.out.println("Quel enclos doit-il réparer :");
					this.selectPaddock();
					a = sc.nextInt();
					this.getWorker().fix(this.paddocks.get(a));
					break;
					
				case 4 :
					System.out.println("Quel enclos doit-il nourrir :");
					this.selectPaddock();
					a = sc.nextInt();
					this.getWorker().feed(this.paddocks.get(a));
					break;
				case 5 :
					System.out.println("De quel enclos doit-il prendre l'animal :");
					this.selectPaddock();
					a = sc.nextInt();
					System.out.println(a);
					
					System.out.println("Quel animal doit-il transférer :");
					this.selectAnimal(a);
					b = sc.nextInt();
					System.out.println(b);
					
					System.out.println("De quel enclos doit-il mettre l'animal :");
					this.selectPaddock();
					c = sc.nextInt();
					System.out.println(c);
					try {
						this.getWorker().transfert(this.paddocks.get(a), this.paddocks.get(a).getAnimal(b), this.paddocks.get(c));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 6 : System.out.println("Le jeu va se fermer ...");	
				System.exit(0);
				default : System.out.println("Veuillez choisir une option existante !");
			}
			this.timelapse();
		}
		
			
		
	}

	private void selectPaddock() {
		String s ="";
		for(int i=0;i<this.paddocks.size();i++) {
			s += i+". "+this.paddocks.get(i).getName()+" \n";
		}
		System.out.println(s);
	}
	
	private void selectAnimal(int a) {
		String s ="";		
		for(int i=0;i<this.paddocks.get(a).getResident().size();i++) {
			System.out.println(i+". "+this.paddocks.get(a).getAnimal(i).getName());
		}		
	}

	public static void buildZoo() {
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
    	
    	//EaglePaddock.add(eagle);
    	PenguinPaddock.add(penguin);
    	GoldfishPaddock.add(GoldFish);
    	SharkPaddock.add(Shark);
    	WhalePaddock.add(Whale);
    	BearPaddock.add(Bear);
    	TigerPaddock.add(Tiger);
    	    	
    	//EaglePaddock.add(eagle2);
    	PenguinPaddock.add(penguin2);
    	GoldfishPaddock.add(GoldFish2);
    	SharkPaddock.add(Shark2);
    	WhalePaddock.add(Whale2);
    	BearPaddock.add(Bear2);
    	TigerPaddock.add(Tiger2);
    	
    	//EaglePaddock.add(eagle3);
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
    	
    	Zoo.timelapse();
	}
	
	public static void main(String[] args) {
		Zoo.buildZoo();
	}
}