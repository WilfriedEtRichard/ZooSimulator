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
		assertEquals(w.getPtsAction(), 100);
	}
	
	@Test
	void Worker_setPtsAction() {
		Worker w = Worker.getInstance("Alice", true, 20);
        w.setPtsAction(4);
		assertEquals(w.getPtsAction(), 96);
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
	
}
