package zoosimulator;

import java.util.ArrayList;

public class FlyingPaddock<T extends FlyingAnimals> extends Paddock {
    public ArrayList<T> resident = new ArrayList<>();
    public double volume;
    public double height;

    public FlyingPaddock(String name, double length, double width, double height) {
        super(name, length, width);
        this.height = height;
        this.volume = this.area*height;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String toString(){
        if (resident.size() == 0){
            System.out.println("Hauteur : "+getHeight()+"m");
            System.out.println("Volume : "+getVolume()+"m^3");
            super.toString();
        }else{
            System.out.println("Hauteur : "+getHeight()+"m");
            System.out.println("Volume : "+getVolume()+"m^3");
            super.toString();
        }

        return ("");
    }
}
