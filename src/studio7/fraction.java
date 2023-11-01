package studio7;

public class fraction {
	private int numerator;
	private int denominator;
	
	public double fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public String toString() {
		return "Fraction [numerator = " + numerator + ", denominator = " + denominator + "]";
	}
	
	public static void main(String[] args) {
		fraction a = new fraction(1, 2);
		System.out.println(a.fraction(0, 0));
	}
	
}