package zoosimulator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ZooSimulator_test {

	@Before
	void tearup() {
		
	}
	
	@Test
	void createZoo() {
		Zoo z= new Zoo("Zoo", "Alain", true, 20);
		assertTrue(z instanceof Zoo);
	}
	
	@Test
	void checkZoo_getName() {
		Zoo z= new Zoo("Zoo", "Alain", true, 20);
		assertEquals(z.getName(),"Zoo"); //Check
		assertTrue(z.getName() != "zoo");		
	}
	
	@Test
	void checkZoo_Worker_getName() {
		Zoo z= new Zoo("Zoo", "Alice", false, 35);
		Worker w = z.getWorker();
		assertEquals(w.getName(),"Alice");
		assertTrue(w.getName() != "Alain");
	}
	
	@Test
	void checkZoo_Worker_getGender() {
		Zoo z= new Zoo("Zoo", "Alice", false, 35);
		Worker w = z.getWorker();
		assertTrue(!w.isGender());
		assertEquals(w.getGender(),"Femme");
		assertTrue(w.getGender() != "Homme");
	}
	
	@Test
	void checkZoo_Worker_getAge() {
		Zoo z= new Zoo("Zoo", "Alice", false, 35);
		Worker w = z.getWorker();
		assertEquals(w.getAge(), 35);
		assertTrue(w.getAge() != 30);
	}
	
}
