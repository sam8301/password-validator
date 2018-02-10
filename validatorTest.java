import org.junit.Test;

import static org.junit.Assert.assertEquals;

class ValidatorTest {

	@Test 

	public void testCase1() {
		
		//test for     it is not “password” (case insensitive)
		// and         it is at least 8 characters long
		assertEquals(Validator.case1("password"),1);
		assertEquals(Validator.case1("PassWord"),1);
		assertEquals(Validator.case1("asdf"),1);
		assertEquals(Validator.case1("sdjijfiweofijsi"),2);
		System.out.println("pass");
	}

}
