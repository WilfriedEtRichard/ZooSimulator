package zoosimulator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ZooSimulator_test {
	
	@Test
	void Zoo_exists() {
		Zoo z= new Zoo("Zoo", "Alice", false, 20);
		assertTrue(z instanceof Zoo);
	}
	
	@Test
	void Zoo_getName() {
		Zoo z= new Zoo("Zoo", "Alice", false, 20);
		assertEquals(z.getName(),"Zoo");
		assertTrue(z.getName() != "zoo");		
	}
	
	@Test
	void Zoo_setName() {
		Zoo z= new Zoo("Zoo", "Alice", false, 20);
		z.setName("zoo");
		assertEquals(z.getName(),"zoo");
		assertTrue(z.getName() != "Zoo");		
	}
	
	@Test
	void Worker_getName() {
		Zoo z= new Zoo("Zoo", "Alice", false, 20);
		Worker w = z.getWorker();
		assertEquals(w.getName(),"Alice");
		assertTrue(w.getName() != "Alain");
	}
	
	@Test
	void Worker_setName() {
		Zoo z= new Zoo("Zoo", "Alice", false, 20);
		Worker w = z.getWorker();
		w.setName("Alain");
		assertEquals(w.getName(),"Alain");
		assertTrue(w.getName() != "Alice");
	}
	
	@Test
	void Worker_isGenderWoman() {
		Zoo z = new Zoo("Zoo", "Alice", false, 20);
		Worker w = z.getWorker();
		assertTrue(!w.isGender());
	}
	
	/*@Test
	void Worker_isGenderMan() {
		Zoo z = new Zoo("Zoo", "Alain", true, 30);
		Worker w = z.getWorker();
		assertTrue(w.isGender());
	}*/
	
	/*@Test
	void Worker_setGender() {
		Zoo z = new Zoo("Zoo", "Alice", false, 20);
		Worker w = z.getWorker();
		w.setGender(true);
		System.out.println(z.getWorker().isGender());
		assertTrue(w.isGender());
	}*/
	
	@Test
	void Worker_getGenderWoman() {
		Worker w = Worker.getInstance("Alice", false, 20);
		assertEquals(w.getGender(),"Femme");
		assertTrue(w.getGender() != "Homme");
	}
	
	/*@Test
	void Worker_getGenderMan() {
		Worker w = Worker.getInstance("Alain", true, 30);
		assertEquals(w.getGender(),"Homme");
		assertTrue(w.getGender() != "Femme");
	}*/
	
	@Test
	void Worker_getAge() {
		Worker w = Worker.getInstance("Alice", true, 20);
		assertEquals(w.getAge(), 20);
		assertTrue(w.getAge() != 30);
	}
	
	@Test
	void Worker_setAge() {
		Worker w = Worker.getInstance("Alice", true, 20);
		w.setAge(30);
		assertEquals(w.getAge(), 30);
		assertTrue(w.getAge() != 20);
	}
	
	@Test
	void Worker_getPtsAction() {
		Worker w = Worker.getInstance("Alice", true, 20);
		assertEquals(w.getPtsAction(), 10);
	}
	
	@Test
	void Worker_setPtsAction() {
		Worker w = Worker.getInstance("Alice", true, 20);
        w.setPtsAction(4);
		assertEquals(w.getPtsAction(), 6);
	}
	
	@Test
	void Paddock_getName() {
		AquaticPaddock<AquaticAnimal> p = new AquaticPaddock<>("Paddock1",(double)20,(double)20,(double)20);
		assertEquals(p.getName(),"Paddock1");
	}
	
	@Test
	void Paddock_setName() {
		AquaticPaddock<AquaticAnimal> p = new AquaticPaddock<>("Paddock1",(double)20,(double)20,(double)20);
		p.setName("Paddock2");
		assertEquals(p.getName(),"Paddock2");
	}
	
	@Test
	void Paddock_getLength() {
		AquaticPaddock<AquaticAnimal> p = new AquaticPaddock<>("Paddock1",(double)20,(double)25,(double)30);
		assertEquals(p.getLength(), 20.00);
		assertTrue(p.getLength() != 25.00);
	}
	
	@Test
	void Paddock_setLength() {
		AquaticPaddock<AquaticAnimal> p = new AquaticPaddock<>("Paddock1",(double)20,(double)25,(double)30);
		p.setLength(25.00);
		assertEquals(p.getLength(), 25.00);
		assertTrue(p.getLength() != 20.00);
	}
	
	@Test
	void Paddock_getWidth() {
		AquaticPaddock<AquaticAnimal> p = new AquaticPaddock<>("Paddock1",(double)20,(double)25,(double)30);
		assertEquals(p.getWidth(), 25.00);
		assertTrue(p.getWidth() != 30.00);
	}
	
	@Test
	void Paddock_setWidth() {
		AquaticPaddock<AquaticAnimal> p = new AquaticPaddock<>("Paddock1",(double)20,(double)25,(double)30);
		p.setWidth(30);
		assertEquals(p.getWidth(), 30.00);
		assertTrue(p.getWidth() != 25.00);
	}
	
	@Test
	void Paddock_getArea() {
		AquaticPaddock<AquaticAnimal> p = new AquaticPaddock<>("Paddock1",(double)20,(double)25,(double)30);
		assertEquals(p.getArea(), 20.00*25.00);
		assertTrue(p.getArea() != 25.00);
	}

	@Test
	void Paddock_setArea() {
		AquaticPaddock<AquaticAnimal> p = new AquaticPaddock<>("Paddock1",(double)20,(double)25,(double)30);
		p.setArea(150);
		assertEquals(p.getArea(), 150);
		assertTrue(p.getArea() != 20.00*25.00);
	}
	
	@Test
	void Paddock_getState() {
		AquaticPaddock<AquaticAnimal> p = new AquaticPaddock<>("Paddock1",(double)20,(double)25,(double)30);
		assertEquals(p.getState(), Paddock.State.GOOD);
	}
	
	@Test
	void Paddock_getCleanliness() {
		AquaticPaddock<AquaticAnimal> p = new AquaticPaddock<>("Paddock1",(double)20,(double)25,(double)30);
		String s = "Propreté : Bonne";
		assertEquals(p.getCleanliness(), s);
	}
	
	@Test
	void Paddock_setCleanliness() {
		AquaticPaddock<AquaticAnimal> p = new AquaticPaddock<>("Paddock1",(double)20,(double)25,(double)30);
		String s = "Propreté : Mauvaise";
		p.setState(Paddock.State.BAD);
		assertEquals(p.getState(), Paddock.State.BAD);
		assertEquals(p.getCleanliness(), s);
	}
	
	@Test
	void Paddock_getSpecialDimension() {
		AquaticPaddock<AquaticAnimal> p = new AquaticPaddock<>("Paddock1",(double)20,(double)25,(double)30);
		assertEquals(p.getSpecialDimension(), "Profondeur : "+p.getDeepness());
	}
	
	@Test
	void Paddock_getVolume() {
		AquaticPaddock<AquaticAnimal> p = new AquaticPaddock<>("Paddock1",(double)20,(double)25,(double)30);
		String s = ""+(20.00*25.00*30.00);
		assertEquals(p.getVolume(), s);
	}
	
	@Test
	void Paddock_getSpecialState() {
		AquaticPaddock<AquaticAnimal> p = new AquaticPaddock<>("Paddock1",(double)20,(double)25,(double)30);
		assertEquals(p.getSpecialState(), Paddock.State.GOOD);
	}
	
	@Test
	void Paddock_setSpecialState() {
		AquaticPaddock<AquaticAnimal> p = new AquaticPaddock<>("Paddock1",(double)20,(double)25,(double)30);
		p.setSpecialState(Paddock.State.BAD);
		assertEquals(p.getSpecialState(), Paddock.State.BAD);
	}

	@Test
	void Paddock_clean() {
		AquaticPaddock<AquaticAnimal> p = new AquaticPaddock<>("Paddock1",(double)20,(double)25,(double)30);
		p.setState(Paddock.State.BAD);
		p.clean();
		assertEquals(p.getState(), Paddock.State.GOOD);
	}
	
	@Test
	void Paddock_maintenance() {
		AquaticPaddock<AquaticAnimal> p = new AquaticPaddock<>("Paddock1",(double)20,(double)25,(double)30);
		p.setSpecialState(Paddock.State.BAD);
		p.maintenance();
		assertEquals(p.getSpecialState(), Paddock.State.GOOD);
	}
	
	@Test
	void Paddock_toString() {
		AquaticPaddock<AquaticAnimal> p = new AquaticPaddock<>("Paddock1",(double)20,(double)25,(double)30);
		String s = "Nom de l'enclos : "+p.getName()+" ("+p.getCleanliness()+p.getSpecialStateString()+")\n"+
		    	"Longueur : "+p.getLength()+"m | "+
		    	"Largeur : "+p.getWidth()+"m | "+
		    	p.getSpecialDimension()+"m | "+
		    	"Aire : "+p.getArea()+"m² | "+
		    	"Volume : "+p.getVolume()+"m^3 \n\nEnclos vide\n";
		assertEquals(p.toString(), s);
	}
	
	@Test
	void Animal_getSpecies() {
		Eagle e = new Eagle("Wingy");
		assertEquals(e.getSpecies(), "Eagle");
	}
	
	@Test
	void Animal_getName() {
		Eagle e = new Eagle("Wingy");
		assertEquals(e.getName(), "Wingy");
	}
	
	@Test
	void Animal_isGender() {
		Eagle e = new Eagle("Wingy");
		if(e.isGender()) {
			assertTrue(e.isGender());
		}else {
			assertTrue(!e.isGender());
		}
	}
	
	@Test
	void Animal_getGender() {
		Eagle e = new Eagle("Wingy");
		if(e.isGender()) {
			assertEquals(e.getGender(), "Male");
		}else {
			assertEquals(e.getGender(), "Female");
		}
	}
	
	@Test
	void Animal_getWeight() {
		Eagle e = new Eagle("Wingy");
		assertTrue(e.getWeight() >= 20.00 && e.getWeight()<=25.00);
	}
	
	@Test
	void Animal_setWeight() {
		Eagle e = new Eagle("Wingy");
		e.setWeight(22.25);
		assertEquals(e.getWeight(), 22.25);
	}
	
	@Test
	void Animal_getSize() {
		Eagle e = new Eagle("Wingy");
		assertTrue(e.getSize() >= 0.3 && e.getSize() <= 0.5);
	}
	
	@Test
	void Animal_setSize() {
		Eagle e = new Eagle("Wingy");
		e.setSize(25.48);
		assertEquals(e.getSize(), 25.48);
	}
	
	@Test
	void Animal_getAge() {
		Eagle e = new Eagle("Wingy");
		assertEquals(e.getAge(), 0);
	}
	
	@Test
	void Animal_setAge() {
		Eagle e = new Eagle("Wingy");
		e.setAge(6);
		assertEquals(e.getAge(), 6);
	}
	
	@Test
	void Animal_getHungerIndicator() {
		Eagle e = new Eagle("Wingy");
		assertEquals(e.getHungerIndicator(), 10);
	}
	
	@Test
	void Animal_setHungerIndicator() {
		Eagle e = new Eagle("Wingy");
		e.setHungerIndicator(3);
		assertEquals(e.getHungerIndicator(), 3);
	}
	
	@Test
	void Animal_getSleepIndicator() {
		Eagle e = new Eagle("Wingy");
		assertEquals(e.getSleepIndicator(), 10);
	}
	
	@Test
	void Animal_setSleepIndicator() {
		Eagle e = new Eagle("Wingy");
		e.setSleepIndicator(5);
		assertEquals(e.getSleepIndicator(), 5);
	}
	
	@Test
	void Animal_isAsleep() {
		Eagle e = new Eagle("Wingy");
		assertTrue(!e.isAsleep());
	}
	
	@Test
	void Animal_setAsleep() {
		Eagle e = new Eagle("Wingy");
		e.setAsleep(true);
		assertTrue(e.isAsleep());
	}
	
	@Test
	void Animal_isSickness() {
		Eagle e = new Eagle("Wingy");
		assertTrue(!e.isSick());
	}
	
	@Test
	void Animal_setSickness() {
		Eagle e = new Eagle("Wingy");
		e.setSickness(true);
		assertTrue(e.isSick());
	}
	
	@Test
	void Animal_getHealthIndicator() {
		Eagle e = new Eagle("Wingy");
		assertEquals(e.getHealthIndicator(), 10);
	}
	
	@Test
	void Animal_setHealthIndicator() {
		Eagle e = new Eagle("Wingy");
		e.setHealthIndicator(8);
		assertEquals(e.getHealthIndicator(), 8);
	}
	
}
