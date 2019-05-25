
public class ConverterUnit {
	
	private double value;

	public ConverterUnit() {
		
	}

	public ConverterUnit(double value) {
		if (value <= 0) {
		this.value = 1;
		} else {
		this.value = value;
		}
	}

	public double getValue() {
		return value;
	}
	

	public double fromKilogramsToPounds() {
		
		return this.value * 2.2046;
	}
	
	public double fromPoundsToKilograms() {
		
		return this.value / 2.2046;
	}
	
	public double fromCentimetersToInches() {
		
		return this.value * 0.39370;
	}
	
	public double fromInchesToCentimeters() {
		
		return this.value / 0.39370;
	}
	
	public double fromCelsiusToFahrenheit() {
		
		return (this.value * 1.8) + 32;
	}
	
	public double fromFahrenheitToCelsius() {
		
		return (this.value - 32) / 1.8;
	}
}
