package zoosimulator;

import java.util.Scanner;

public class Worker {
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
	
	public void examine() {
		
	}
	
	public void clean() {
		
	}
	
	public void feed() {
		
	}
	
	public void transfert() {
		
	}
}
