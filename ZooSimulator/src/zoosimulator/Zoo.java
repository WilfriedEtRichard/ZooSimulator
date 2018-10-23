package zoosimulator;

import java.util.ArrayList;

import zoosimulator.Paddock.State;

public class Zoo<T extends Paddock<T>> {
	private String name;
	private Worker worker;
	private static final int MAX_PADDOCK = 10;
    private ArrayList<T> paddocks = new ArrayList<>(MAX_PADDOCK);
    
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

	public ArrayList<T> getPaddocks() {
		return this.paddocks;
	}

	public void setPaddocks(ArrayList<T> paddocks) {
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
		//Donne la main au joueur
	}
	
	public static void main(String[] args) {
		
	}
}