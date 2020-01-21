package util;

public class currencyConverter {
	
	public static final double IOF = 0.06;
	public static double dollar;
	public static double real;
	
	public static double converter() {
		return (real * dollar) * IOF + real * dollar;
	}

}
