<<<<<<< HEAD
package com.company;

public class FlyingPaddock<T extends FlyingAnimals> extends Paddock {
    private double volume;
    private double height;
=======
package zoosimulator;

import java.util.ArrayList;

public class FlyingPaddock<T extends FlyingAnimals> extends Paddock {
    public ArrayList<T> resident = new ArrayList<>();
    public double volume;
    public double height;
>>>>>>> refs/remotes/origin/master

    public FlyingPaddock(String name, double length, double width, double height) {
        super(name, length, width);
        this.height = height;
<<<<<<< HEAD
        this.volume = this.getArea()*height;
    }

    public double getVolume() {

        return this.volume;
    }

    public void setVolume(double volume) {

=======
        this.volume = this.area*height;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
>>>>>>> refs/remotes/origin/master
        this.volume = volume;
    }

    public double getHeight() {
<<<<<<< HEAD

        return this.height;
    }

    public void setHeight(double height) {

=======
        return height;
    }

    public void setHeight(double height) {
>>>>>>> refs/remotes/origin/master
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
