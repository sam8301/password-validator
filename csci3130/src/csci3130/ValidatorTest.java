package csci3130;


import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

class ValidatorTest {

	@Test 

	public void testCase1() {
        //2
		assertEquals(Validator.case1("password"),1);
		//2,5
		assertEquals(Validator.case1("PassWord"),2);
		//1,3
		assertEquals(Validator.case1("asdf#"),2);
		//1,2,4
		assertEquals(Validator.case1("sdjijfieo0"),3);
		//1,2,4,5
		assertEquals(Validator.case1("sdjijfieo0#"),4);
		//1,2,3,4,5
		assertEquals(Validator.case1("sdDjijfieo0#"),5);
		
	}

}
