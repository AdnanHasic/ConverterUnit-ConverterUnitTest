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
	
	@Test
	public void fromKilogramsToPoundsTest_ShouldReturnValueInPounds_IfGivenAValueInKilograms() {
	
		double awaiting = c1.getValueOfLength() * 2.2046;
		
		assertEquals(awaiting, c1.fromKilogramsToPounds(), delta);
		
	}
	
	@Test
	public void fromPoundsToKilogramsTest_ShouldReturnValueInKilograms_IfGivenAValueInPounds() {
		
		double awaiting = c1.getValueOfLength() / 2.2046;
		
		assertEquals(awaiting, c1.fromPoundsToKilograms(), delta);
	}
	
	@Test
	public void fromCentimetersToInchesTest_ShouldReturnValueInInches_IfGivenValueInCentimeters() {
		
		double awaiting = c1.getValueOfLength() * 0.39370;
		
		assertEquals(awaiting, c1.fromCentimetersToInches(), delta);
		
	}
	
	@Test
	public void fromInchesToCentimetersTest_ShouldReturnValueInCentimeters_IfGivenValueIninches() {
		
		double awaiting = c1.getValueOfLength() / 0.39370;
		
		assertEquals(awaiting, c1.fromInchesToCentimeters(), delta);
	}
	
	@Test
	public void fromCelsiusToFahrenheitTest_ShouldReturnValueInFahrenheit_IfGivenValueInCelsius() {
		
		double awaiting = (c1.getValueOfLength() * 1.8) + 32;
		
		assertEquals(awaiting, c1.fromCelsiusToFahrenheit(), delta);
	}
	
	@Test
	public void fromFahrenheitToCelsiusTest_ShouldReturnValueInCelsius_IfGivenValueInFahrenheit() {
		
		double awaiting = (c1.getValueOfLength() * 1.8) + 32;
		
		assertEquals(awaiting, c1.fromFahrenheitToCelsius(), delta);
	}

}
