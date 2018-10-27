package zoosimulator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ZooSimulator_test {
	
	@Test
	void checkZoo() {
		Zoo z= new Zoo("Zoo", "Alain", true, 20);
		assertTrue(z instanceof Zoo);
	}
	
	@Test
	void checkZoo_getName() {
		Zoo z= new Zoo("Zoo", "Alain", true, 20);
		assertEquals(z.getName(),"Zoo");
		assertTrue(z.getName() != "zoo");		
	}
	
	@Test
	void checkZoo_Worker_getName() {
		Worker w = Worker.getInstance("Alice", true, 20);
		assertEquals(w.getName(),"Alice");
		assertTrue(w.getName() != "Alain");
	}
	
	@Test
	void checkZoo_Worker_getGender() {
		Worker w = Worker.getInstance("Alice", false, 20);
		assertTrue(!w.isGender());
		assertEquals(w.getGender(),"Femme");
		assertTrue(w.getGender() != "Homme");
	}
	
	@Test
	void checkZoo_Worker_getAge() {
		Worker w = Worker.getInstance("Alice", true, 20);
		assertEquals(w.getAge(), 20);
		assertTrue(w.getAge() != 30);
	}
	
	@Test
	void checkZoo_Worker_getPtsAction() {
		Worker w = Worker.getInstance("Alice", true, 20);
		assertEquals(w.getPtsAction(), 10);
        w.setPtsAction(4);
		assertEquals(w.getPtsAction(), 6);
	}
	
	@Test
	void checkZoo_Paddock_getName() {
		AquaticPaddock<AquaticAnimals> p = new AquaticPaddock<>("Paddock1",(double)20,(double)20,(double)20);
		assertEquals(p.getName(),"Paddock1");
	}
	
	@Test
	void checkZoo_Paddock_getLength() {
		AquaticPaddock<AquaticAnimals> p = new AquaticPaddock<>("Paddock1",(double)20,(double)25,(double)30);
		assertEquals(p.getLength(), 20.00);
		assertTrue(p.getLength() != 25.00);
	}
	
	@Test
	void checkZoo_Paddock_getWidth() {
		AquaticPaddock<AquaticAnimals> p = new AquaticPaddock<>("Paddock1",(double)20,(double)25,(double)30);
		assertEquals(p.getWidth(), 25.00);
		assertTrue(p.getWidth() != 30.00);
	}
	
	@Test
	void checkZoo_Paddock_getArea() {
		AquaticPaddock<AquaticAnimals> p = new AquaticPaddock<>("Paddock1",(double)20,(double)25,(double)30);
		assertEquals(p.getArea(), 20.00*25.00);
		assertTrue(p.getArea() != 25.00);
	}
	
	@Test
	void checkZoo_Paddock_getCleanliness() {
		AquaticPaddock<AquaticAnimals> p = new AquaticPaddock<>("Paddock1",(double)20,(double)25,(double)30);
		assertEquals(p.getState(), Paddock.State.GOOD);
		String s = "Propret� : ";
		String s1=s+"Bonne";
		String s2=s+"Mauvaise";
		assertEquals(p.getCleanliness(), s1);
		p.setCleanliness(Paddock.State.BAD);
		assertEquals(p.getState(), Paddock.State.BAD);
		assertEquals(p.getCleanliness(), s2);
	}
	
	@Test
	void checkZoo_Paddock_getSpecialDimension() {
		AquaticPaddock<AquaticAnimals> p = new AquaticPaddock<>("Paddock1",(double)20,(double)25,(double)30);
		assertEquals(p.getSpecialDimension(), "Profondeur : "+p.getDeepness());
	}
	
	@Test
	void checkZoo_Paddock_getVolume() {
		AquaticPaddock<AquaticAnimals> p = new AquaticPaddock<>("Paddock1",(double)20,(double)25,(double)30);
		String s = ""+(20.00*25.00*30.00);
		assertEquals(p.getVolume(), s);
	}
	
}