package zoosimulator;

import java.util.Scanner;

public class Worker<T> {
	private String name;
	private boolean gender;
	private int age;
	private static Worker instance;
	
	private Worker(String name, boolean gender, int age) {
		this.name=name;
		this.gender=gender;
		this.age=age;
	}

	public static synchronized Worker getInstance(String name, boolean gender, int age){
		if (instance == null)
			instance = new Worker(name, gender, age);
			return instance;	
	}

	public void customizeWorker(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Give a name to your Worker :");
		String name = sc.nextLine();
		System.out.println("Give a gender to your Worker :");
		boolean gender = sc.nextBoolean();
		System.out.println("Give an age to your Worker :");
		int age = sc.nextInt();
		getInstance(name, gender, age);
	}
	
	public void examine(Paddock<T> p) {
		System.out.println(p.toString());
	}
	
	public void clean(Paddock<T> p) {
		p.clean();
	}
	
	public void fix(Paddock<T> p) {
		p.maintenance();
	}
	
	public void feed(Paddock<T> p) {
		for(int i=0;i<p.getMaxAnimals();++i) {
			if(p.getResident().get(i) instanceof Animals) {
				p.getAnimal(i).eat();
			}	
		}
	}
	
	public void transfert(Paddock<T> p1, T a, Paddock<T> p2) throws Exception {
		try {
			p2.getResident().add(a);
		}catch(Exception e) {
			System.out.println("Cet animal ne peut pas �tre mis dans cet enclos.");
			return;
		}
		p1.getResident().remove(a);
	}
}
