<<<<<<< HEAD
package com.company;
=======
package zoosimulator;
>>>>>>> refs/remotes/origin/master

import java.util.ArrayList;

public class AquaticPaddock<T extends AquaticAnimals> extends Paddock {

<<<<<<< HEAD
    private double volume;
    private double height;
=======
    public double volume;
    public double height;
>>>>>>> refs/remotes/origin/master

    public AquaticPaddock(String name, double length, double width,double height) {
        super(name, length, width);
        this.height = height;
<<<<<<< HEAD
        this.volume = this.getArea()*height;
=======
        this.volume = this.area*height;
>>>>>>> refs/remotes/origin/master
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
<<<<<<< HEAD
        if (this.getResident().size() == 0){
            System.out.println("Hauteur : "+this.getHeight()+"m");
            System.out.println("Volume : "+this.getVolume()+"m^3");
            super.toString();
        }else{
            System.out.println("Hauteur : "+this.getHeight()+"m");
            System.out.println("Volume : "+this.getVolume()+"m^3");
=======
        if (resident.size() == 0){
            System.out.println("Hauteur : "+getHeight()+"m");
            System.out.println("Volume : "+getVolume()+"m^3");
            super.toString();
        }else{
            System.out.println("Hauteur : "+getHeight()+"m");
            System.out.println("Volume : "+getVolume()+"m^3");
>>>>>>> refs/remotes/origin/master
            super.toString();
        }

        return ("");
    }
}
