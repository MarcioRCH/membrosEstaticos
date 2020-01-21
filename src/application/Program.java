package application;

import java.util.Locale;
import java.util.Scanner;

import util.currencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Dollar Converter to Real");
		System.out.print("What is the dollar price? ");
		currencyConverter.real = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		currencyConverter.dollar = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", currencyConverter.converter());
		
		sc.close();

	}

}
