package zoosimulator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ZooSimulator_test {

	@Test
	void createBear() {
		Bear b1 = new Bear();
		assertEquals(b1 instanceof Animals, true);
		assertEquals(b1 instanceof Bear, true);
	}
	
	@Test
	void display() {
		Bear b = new Bear();
		assertEquals(b.toString(), b.getName()+" ("+b.getGender()+" "+b.getSpecies()+") \n"+"Age : "+b.getAge()+" ans | Weight : "+b.getWeight()+"kg | Size : "+b.getSize()+"m \n"+"Health : "+b.getHealthIndicator()+" | Hunger : "+b.getHungerIndicator()+" | Sleep : "+b.getSleepIndicator()+"\n"+"Action : "+b.getAction()+"\n");
	}
}
