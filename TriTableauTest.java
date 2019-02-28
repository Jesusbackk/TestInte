import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TriTableauTest {

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	

	@Test
	void triCroissant() {
		
		int Tableau1 [] = {5,4,3,2,1};
		int Tableau2 [] = {1,2,3,4,5};
		
		TriTableau.triCroissant(Tableau1);
		assertEquals(Tableau1[0],Tableau2[0]);
		
		for(int i =0 ; i < Tableau1.length - 1 ; i++) {
			assertTrue(Tableau1[i] <= Tableau1 [i+1]);
		}
		
		
	}
	
	
	@Test
	void triDecroissant() {
		int Tableau3 [] = {1,5,9};
		int Tableau4 [] = {9,5,1};
		
		TriTableau.triDecroissant(Tableau3);
		assertEquals(Tableau3[0],Tableau4[0]);
		

	}

}
