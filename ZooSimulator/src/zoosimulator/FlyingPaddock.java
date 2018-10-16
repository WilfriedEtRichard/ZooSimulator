package zoosimulator;

import java.util.ArrayList;

public class FlyingPaddock<T extends FlyingAnimals> extends Paddock {
    public ArrayList<T> resident = new ArrayList<>();
    public double volume;
    public double height;

    public FlyingPaddock(String name, double length, double width, double height) {
        super(name, length, width);
        this.height = height;
        this.volume = this.getArea()*height;
    }

    public double getVolume() {

        return this.volume;
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

    public String toString(){
        if (this.getResident().size() == 0){
            System.out.println("Hauteur : "+this.getHeight()+"m");
            System.out.println("Volume : "+this.getVolume()+"m^3");
            super.toString();
        }else{
            System.out.println("Hauteur : "+this.getHeight()+"m");
            System.out.println("Volume : "+this.getVolume()+"m^3");
            super.toString();
        }

        return ("");
    }
}
