import static org.junit.Assert.*;

import org.junit.Test;


public class GameWithCoinsTest {

	Solver solver = new Solver();
	
	@Test
	public void test() {

		assertTrue("Sample input 1", solver.findWinner(0, 3).equals("First"));
		assertTrue("Sample input 2", solver.findWinner(1, 1).equals("Second"));

	}

}
