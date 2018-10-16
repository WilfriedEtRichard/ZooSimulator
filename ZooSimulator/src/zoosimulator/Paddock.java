package zoosimulator;


import java.util.ArrayList;

public abstract class Paddock<T> {
    public ArrayList<T> resident = new ArrayList<>();
    public String name;
    public double area;
    public double length;
    public double width;

    public Paddock(String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.area = (length*width);
    }

    public void add(T animals){

        resident.add(animals);
    }

    public void remove(T animals){

        resident.remove(animals);
    }

    public ArrayList<T> getResident() {
        return resident;
    }

    public void setResident(ArrayList<T> resident) {
        resident = resident;
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
