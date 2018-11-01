package zoosimulator;

public class FlyingPaddock<T extends FlyingAnimal> extends Paddock<T> {
    private State roofState; 
    private double volume;
    private double height;
    private Paddock<Egg<Oviparous>> eggPaddock;

    public FlyingPaddock(String name, double length, double width, double height, Paddock<Egg<Oviparous>> eggPaddock) {
        super(name, length, width);
        this.height = height;
        this.volume = this.getArea()*height;
        this.roofState =State.GOOD;
        this.eggPaddock = eggPaddock;
    }

    public String getVolume() {
        return ""+this.volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public State getSpecialState() {
    	return this.roofState;
    }
    
    public String getSpecialStateString() {
    	String s = " | Etat du toit : ";
    	switch(this.roofState) {
    		case BAD : return s+"Mauvais";
    		case CORRECT : return s+"Correct";
    		case GOOD : return s+"Bon";
    		default : return s+"Error";	
    	}
    }

    public void setSpecialState(State s) {
        this.roofState = s;
    }
    
    public String getSpecialDimension() {
    	return "Hauteur : "+this.getHeight();
    }

	public Paddock<Egg<Oviparous>> getEggPaddock() {
		return this.eggPaddock;
	}
}
