import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConverterUnitTest {

	ConverterUnit c1;
	double delta;
	
	@Before
	public void setUp() {
		c1 = new ConverterUnit(10.0);
		delta = 0.01;
	}
	
	@Test
	public void getValueOfLengthTest_ShouldReturnGetValueOfLength_IfCalledGetValueofLength() {
		
		assertEquals(10.0, c1.getValueOfLength(), delta);
		
	}
	

}
