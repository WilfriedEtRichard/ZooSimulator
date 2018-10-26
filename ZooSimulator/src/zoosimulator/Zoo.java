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

	public ArrayList<Paddock<T>> getPaddocks() {
		return this.paddocks;
	}

	public void addPaddocks(Paddock<T> paddocks) {
		this.paddocks.add(paddocks);
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
		for(int i=0;i<getMaxPaddock();++i) {
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
				case GOOD: p.setCleanliness(State.CORRECT);
				break;
				case CORRECT: p.setCleanliness(State.BAD);
				break;
				case BAD: break; 
			}
		}
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
	
	public void changeAnimal(Animals a) {
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
		for(int i=0;i<=getMaxPaddock();++i) {
			this.changePaddock(this.getPaddocks().get(i));
			for(int j=0;j<=this.getPaddocks().get(i).getMaxAnimals();++j) {
				//this.changeAnimal(this.getPaddocks().get(i).getResident().get(j));
			}
		}
		this.play();
	}
	
	public void play() {
		while(this.getWorker().getPtsAction()>0) {
			System.out.println(this.getWorker().actions());
			
		}
	}
	
	public static void main(String[] args) {
		
	}
}