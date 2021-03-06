package zoosimulator;

import java.util.ArrayList;

public abstract class Paddock<T> {

    private final int MAX_ANIMALS = 10;
    private ArrayList<T> resident = new ArrayList<>(MAX_ANIMALS);
    private String name;
    private double area;
    private double length;
    private double width;
    public enum State {BAD, CORRECT, GOOD};
    private State cleanState;

    public Paddock(String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.area = (length*width);
        this.cleanState = State.GOOD;
    }

    public void add(Animal animal){
        if(getResident().size()<MAX_ANIMALS){
            getResident().add((T) animal);
        }else{
            System.out.println("Il y a trop d'animaux dans cette enclos");
        }
    }

    public void remove(T animals){
        this.resident.remove(animals);
    }

    public ArrayList<T> getResident() {
        return this.resident;
    }
    
    public Animal getAnimal(int i) {
        return (Animal)this.resident.get(i);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getMaxAnimals() {
        return MAX_ANIMALS;
    }
    
    public void setState(State c) {
        this.cleanState = c;
    }
    
    public State getState() {
    	return this.cleanState;
    }

    public String getCleanliness() {
    	String s = "Propret� : ";
    	switch(this.cleanState) {
    		case BAD : s+="Mauvaise";
    					break;
    		case CORRECT : s+="Correcte";
    					break;
    		case GOOD : s+="Bonne";
    					break;
    		default : s+="Error";	
    					break;
    	}
    	return s;
    }
    
    public void maintenance() {
    	this.setSpecialState(State.GOOD);
    }
    
    public void clean() {
    	this.setState(State.GOOD);
    }
    
    abstract void setSpecialState(State s);

    abstract State getSpecialState();
    
    abstract String getSpecialStateString();
    
    abstract String getSpecialDimension();
    
    abstract String getVolume();
    
    public String toString(){
    	String s;
    	s = "Nom de l'enclos : "+this.getName()+" ("+this.getCleanliness()+this.getSpecialStateString()+")\n"+
    	"Longueur : "+this.getLength()+"m | "+
    	"Largeur : "+this.getWidth()+"m | "+
    	this.getSpecialDimension()+"m | "+
    	"Aire : "+this.getArea()+"m� | "+
    	"Volume : "+this.getVolume()+"m^3 \n\n";
        if (resident.size() != 0){
        	s+="Liste des animaux : \n\n";
            for (T Elem:resident) {
                s+=Elem.toString();
            }
        }else {
        	s+="Enclos vide";
        }
        s+="\n";
        return s;
    }

}
