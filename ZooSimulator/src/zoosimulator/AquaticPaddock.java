package zoosimulator;

import java.util.ArrayList;

public class AquaticPaddock<T extends AquaticAnimals> extends Paddock<T> {
    private double volume;
    private double deepness;
    private State salinityState;

    public AquaticPaddock(String name, double length, double width,double height) {
        super(name, length, width);
        this.deepness = height;
        this.volume = this.getArea()*height;
        this.salinityState=State.GOOD;
    }

    public String getVolume() {
        return ""+this.volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getDeepness() {
        return this.deepness;
    }

    public void setHeight(double height) {
        this.deepness = height;
    }
    
    public String getSpecialState() {
    	String s = "| Salinit� : ";
    	switch(this.salinityState) {
    		case BAD : return s+"Mauvaise";
    		case CORRECT : return s+"Correcte";
    		case GOOD : return s+"Bonne";
    		default : return s+"Error";	
    	}
    }

    public void setSalinityState(State s) {
        this.salinityState = s;
    }
    
    public String getSpecialDimension() {
    	return "Profondeur : "+this.getDeepness();
    }
    
    public void specialMaintenance(State s) {
    	this.setSalinityState(State.GOOD);
    }
}
