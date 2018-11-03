package zoosimulator;

public class Worker {
	private String name;
	private boolean gender;
	private int age;
	private static Worker instance;
	private int ptsAction;
	
	private Worker(String name, boolean gender, int age) {
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.ptsAction = 100;
	}

	public static synchronized Worker getInstance(String name, boolean gender, int age){
		if (instance == null)
			instance = new Worker(name, gender, age);
			return instance;	
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean isGender() {
		return gender;
	}
	
	public String getGender() {
		if(this.isGender()) {
			return "Homme";
		}else {
			return "Femme";
		}
		
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPtsAction() {
		return this.ptsAction;
	}
	
	public void setPtsAction(int i) {
		this.ptsAction-=i;
	}
	
	public void refillPtsAction() {
		this.ptsAction=10;
	}
	
	public <T> void examine(Paddock<T> paddock) {
		System.out.println(paddock.toString());
		this.setPtsAction(1);
	}
	
	public <T> void clean(Paddock<T> p) {
		p.clean();
		this.setPtsAction(1);
	}
	
	public <T> void fix(Paddock<T> p) {
		p.maintenance();
		this.setPtsAction(2);
	}
	
	public <T> void feed(Paddock<T> p) {
		for(int i=0;i<p.getResident().size();++i) {
			if(p.getResident().get(i) instanceof Animal) {
				p.getAnimal(i).eat();
			}	
		}
		this.setPtsAction(2);
	}
	
	public <T> void transfert(Paddock<T> paddock, Animal a, Paddock<T> paddock2) throws Exception {
		if(paddock2.getClass() == paddock.getClass()) {
			paddock2.getResident().add((T) a);
			paddock.getResident().remove(a);
			this.setPtsAction(5);
		}else{
			System.out.println("!!!\nCet animal ne peut pas être mis dans cet enclos.\n!!!");
			return;
		}
	}
	
	public String actions() {
		String s = "\nQue dois faire "+this.getName()+" :\n";
		String options = " 1.Examiner un enclos \n 2.Nettoyer un enclos (1 action)\n 3.Réparer un enclos (2 actions)\n 4.Nourrir les animaux d'un enclos (2 actions)\n 5.Transférer un animal dans un autre enclos (5 actions)\n 6.Terminer la journée\n 7.Quitter le jeu";		
		return ""+s+options;
	}
	
}
