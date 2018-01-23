
public class Fractions {
	private int numerator;
    private int denominator;
}

public Fraction() {
	numerator = 0;
	denominator = 1;
}
public class Fractions throws IllegalArgumentException {
	public int num;
	public int denom;
	if (denom <= 0) {
		throw new IllegalArgumentException("The Denominator cannot less then or equal to 0.");
	}
}

