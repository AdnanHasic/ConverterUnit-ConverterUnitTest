import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConverterUnitTest {

	ConverterUnit c1;
	ConverterUnit c2;
	double delta;
	
	@Before
	public void setUp() {
		c1 = new ConverterUnit(10.0);
		c2 = new ConverterUnit();
		delta = 0.01;
	}
	
	@Test
	public void getValueOfLengthTest_ShouldReturnGetValueOfLength_IfCalledGetValueofLength() {
		
		assertEquals(10.0, c1.getValueOfLength(), delta);
		
	}
	
	@Test
	public void valueOfLengthIsLessThanOrEqualToZeroTest_ShouldSetValueOfLengthOnOne_IfValueOfLengthIsLessThanOrEqualToZero() {
	     
		c2 = new ConverterUnit(0);
		c2.valueOfLengthIsLessThanOrEqualToZero();
		
		assertEquals(1, c2.getValueOfLength(), delta);
	}
	

}
