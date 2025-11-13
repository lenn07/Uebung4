package h3;

public class main {
    public static void main(String[] args) {
		float celsiusFloat = 14.2f;
		float fahrenheitFloat;
		double celsiusDouble = 14.2;
		double fahrenheitDouble;
		
		fahrenheitFloat = celsiusFloat * 9/5 + 32;
		fahrenheitDouble = celsiusDouble * 9/5 + 32;
		
		System.out.println(fahrenheitFloat);
		System.out.println(fahrenheitDouble);
	}
}
