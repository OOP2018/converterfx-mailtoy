package converter;

/**
 * An enumeration (enum) of length units, with values.
 * 
 * @author Kanchanok Kannee
 *
 */
public enum Length {

	Mile(1609.344), 
	Kilometer(1000.0), 
	Meter(1.0), 
	Centimeter(0.01), 
	Foot(0.30480), 
	Wa(2.0), 
	AU(1495978707e2);

	/* attributes of the enum members */
	private final double value;

	/**
	 * Constructor of Length.
	 * 
	 * @param value is a multiplier to convert this unit to a quantity of a
	 *            "standard" unit.
	 */
	private Length(double value) {
		this.value = value;
	}

	/**
	 * Get all the Length members.
	 * 
	 * @return value of unit.
	 */
	public double getValue() {
		return this.value;
	}

}
