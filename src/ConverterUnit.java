
public class ConverterUnit {
	
	private double valueOfLength;

	public ConverterUnit() {
		
	}

	public ConverterUnit(double valueOfLength) {
		
		this.valueOfLength = valueOfLength;
	}

	public double getValueOfLength() {
		return valueOfLength;
	}
	
	public void valueOfLengthIsLessThanOrEqualToZero() {
		
		if (valueOfLength <= 0) {
			this.valueOfLength = 1;
		}
	}

}
