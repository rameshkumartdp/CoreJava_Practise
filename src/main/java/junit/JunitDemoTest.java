package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitDemoTest {

	@Test
	public void testTestData() {
		JunitDemo demo = new JunitDemo();
		String result = demo.testData("JUnit");
		assertNotNull(result);
		assertEquals("Hello JUnit", result);
	}
	
	@Test
	public void testTestData1() {
		JunitDemo demo = new JunitDemo();
		String result = demo.testData("JUnit");
		assertNotNull(result);
		assertEquals("Hello JUnit", result);
	}

}
