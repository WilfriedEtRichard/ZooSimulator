<<<<<<< HEAD
package com.company;
=======
package zoosimulator;
>>>>>>> refs/remotes/origin/master


import java.util.ArrayList;

public abstract class Paddock<T> {
<<<<<<< HEAD

    private final int MAX_ANIMALS = 10;
    private ArrayList<T> resident = new ArrayList<>(MAX_ANIMALS);
    private String name;
    private double area;
    private double length;
    private double width;
=======
    public ArrayList<T> resident = new ArrayList<>();
    public String name;
    public double area;
    public double length;
    public double width;
>>>>>>> refs/remotes/origin/master

    public Paddock(String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.area = (length*width);
    }

    public void add(T animals){
<<<<<<< HEAD
        if(resident.size()<MAX_ANIMALS){
            resident.add(animals);
        }else{
            System.out.println("Il y a trop d'animaux dans cette enclos");
        }

=======

        resident.add(animals);
>>>>>>> refs/remotes/origin/master
    }

    public void remove(T animals){

        resident.remove(animals);
    }

    public ArrayList<T> getResident() {
<<<<<<< HEAD

=======
>>>>>>> refs/remotes/origin/master
        return resident;
    }

    public void setResident(ArrayList<T> resident) {
<<<<<<< HEAD

        this.resident = resident;
    }

    public String getName() {

=======
        resident = resident;
    }

    public String getName() {
>>>>>>> refs/remotes/origin/master
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
<<<<<<< HEAD

=======
>>>>>>> refs/remotes/origin/master
        return area;
    }

    public void setArea(double area) {
<<<<<<< HEAD

=======
>>>>>>> refs/remotes/origin/master
        this.area = area;
    }

    public double getLength() {
<<<<<<< HEAD

=======
>>>>>>> refs/remotes/origin/master
        return length;
    }

    public void setLength(double length) {
<<<<<<< HEAD

=======
>>>>>>> refs/remotes/origin/master
        this.length = length;
    }

    public double getWidth() {
<<<<<<< HEAD

=======
>>>>>>> refs/remotes/origin/master
        return width;
    }

    public void setWidth(double width) {
<<<<<<< HEAD

        this.width = width;
    }

    public int getMAX_ANIMALS() {

        return MAX_ANIMALS;
    }

=======
        this.width = width;
    }

>>>>>>> refs/remotes/origin/master
    public String toString(){
        if (resident.size() == 0){
            System.out.println("Nom de l'enclos : "+getName());
            System.out.println("Longueur : "+getLength()+"m");
            System.out.println("Largeur : "+getWidth()+"m");
            System.out.println("Aire : "+getArea()+"m²");
            System.out.println("Liste des animaux :" +
                    "Il n'y a aucun animal dans cette aquarium");
        }else{
            System.out.println("Nom de l'enclos : "+getName());
            System.out.println("Longueur : "+getLength()+"m");
            System.out.println("Largeur : "+getWidth()+"m");
            System.out.println("Aire : "+getArea()+"m²");
            System.out.println("Liste des animaux :");
            for (T Elem:resident) {
                System.out.println(Elem.toString());
            }
        }

        return ("");
    }

}
