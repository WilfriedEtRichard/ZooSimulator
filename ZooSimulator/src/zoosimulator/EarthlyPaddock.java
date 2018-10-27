package zoosimulator;

import java.util.ArrayList;

import zoosimulator.Paddock.State;

public class EarthlyPaddock<T extends EarthlyAnimals> extends Paddock<T> {

    public EarthlyPaddock(String name, double length, double width) {
        super(name, length, width);
    }
    
    public String getSpecialDimension() {
    	return "";
    }
    
    public String getVolume() {
    	return "";
    }
    
    public void specialMaintenance(State s) {}
    
    public String getSpecialStateString() {
    	return "";
    }

    public void setSpecialState(State s) {}
    
    public State getSpecialState() {
    	return State.GOOD;
    }
}