package smitawebappproject.calculator3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculatortest {

	@Test
	public void caltestadd() {
		assertEquals(10,calculator3.add(5, 5));
	}
	
	@Test
	public void caltestsub() {
		assertEquals(0,calculator3.sub(5, 5));
	}
	
	@Test
	public void caltestmul() {
		assertEquals(25,calculator3.mul(5, 5));
	}
	
	@Test
	public void caltestdiv() {
		assertEquals(1,calculator3.div(5, 5));
	}

}

