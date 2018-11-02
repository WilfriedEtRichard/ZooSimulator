package zoosimulator;

import java.util.ArrayList;
import java.util.Scanner;

import zoosimulator.Paddock.State;

public class Zoo<T extends Paddock<T>> {
	private String name;
	private Worker worker;
	private static final int MAX_PADDOCK = 10;
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
		if(Math.random() < 0.5) {
			if(aleat3()<1) {
				switch(p.getState()) {
					case GOOD: p.setState(State.CORRECT);
					break;
					case CORRECT: p.setState(State.BAD);
					break;
					case BAD: break; 
				}
			}
		}else {
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
			a.sexualActivity(this.paddocks.get(i).getAnimal((int) Math.random()*this.paddocks.get(i).getResident().size()));
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
		int choice=0;
		while(this.getWorker().getPtsAction()>0) {
			System.out.println(this.getWorker().actions());
			Scanner sc = new Scanner(System.in);
			System.out.println("Veuillez saisir une action avec son chiffre :");
			choice = sc.nextInt();
			switch(choice) {
				case 1 :
					System.out.println("Quel enclos doit-il examiner :");
					System.out.println("1.EaglePaddock \n "
							+ "2.PenguinPaddock \n "
							+ "3.GoldfishPaddock \n "
							+ "4.SharkPaddock \n "
							+ "5.WhalePaddock \n "
							+ "6.BearPaddock \n"
							+ "7.TigerPaddock");
					choice = sc.nextInt();
					switch(choice) {
						case 1: this.getWorker().examine(this.paddocks.get(0));
							break;
						case 2: this.getWorker().examine(this.paddocks.get(1));
							break;
						case 3: this.getWorker().examine(this.paddocks.get(2));
							break;
						case 4: this.getWorker().examine(this.paddocks.get(3));
							break;
						case 5: this.getWorker().examine(this.paddocks.get(4));
							break;
						case 6: this.getWorker().examine(this.paddocks.get(5));
							break;
						case 7: this.getWorker().examine(this.paddocks.get(6));
							break;
						default : System.out.println("Veuillez choisir une option existante !");
					}
					break;
					
				case 2 :
				System.out.println("Quel enclos doit-il nettoyer :");
				System.out.println("1.EaglePaddock \n "
						+ "2.PenguinPaddock \n "
						+ "3.GoldfishPaddock \n "
						+ "4.SharkPaddock \n "
						+ "5.WhalePaddock \n "
						+ "6.BearPaddock \n"
						+ "7.BearPaddock \n "
						+ "8.TigerPaddock");
				choice = sc.nextInt();
				switch(choice) {
					case 1: this.getWorker().clean(this.paddocks.get(0));
						break;
					case 2: this.getWorker().clean(this.paddocks.get(1));
						break;
					case 3: this.getWorker().clean(this.paddocks.get(2));
						break;
					case 4: this.getWorker().clean(this.paddocks.get(3));
						break;
					case 5: this.getWorker().clean(this.paddocks.get(4));
						break;
					case 6: this.getWorker().clean(this.paddocks.get(5));
						break;
					case 7: this.getWorker().clean(this.paddocks.get(6));
						break;
					case 8: this.getWorker().clean(this.paddocks.get(7));
						break;
					default : System.out.println("Veuillez choisir une option existante !");
				}
					break;
					
				case 3 :
					System.out.println("Quel enclos doit-il réparer :");
					System.out.println("1.EaglePaddock \n "
							+ "2.PenguinPaddock \n "
							+ "3.GoldfishPaddock \n "
							+ "4.SharkPaddock \n "
							+ "5.WhalePaddock \n "
							+ "6.BearPaddock \n"
							+ "7.BearPaddock \n "
							+ "8.TigerPaddock");
					choice = sc.nextInt();
					switch(choice) {
						case 1: this.getWorker().fix(this.paddocks.get(0));
							break;
						case 2: this.getWorker().fix(this.paddocks.get(1));
							break;
						case 3: this.getWorker().fix(this.paddocks.get(2));
							break;
						case 4: this.getWorker().fix(this.paddocks.get(3));
							break;
						case 5: this.getWorker().fix(this.paddocks.get(4));
							break;
						case 6: this.getWorker().fix(this.paddocks.get(5));
							break;
						case 7: this.getWorker().fix(this.paddocks.get(6));
							break;
						case 8: this.getWorker().fix(this.paddocks.get(7));
							break;
						default : System.out.println("Veuillez choisir une option existante !");
					}
					break;
					
				case 4 :System.out.println(choice);
					break;
				case 5 :System.out.println(choice);
					break;
				case 6 : System.out.println("Le jeu va se fermer ...");	
				System.exit(0);
				default : System.out.println("Veuillez choisir une option existante !");
			}
			this.timelapse();
		}
		
			
		
	}
	
	public void buildZoo() {
		
	}
	
	public static void main(String[] args) {
	
	}
}