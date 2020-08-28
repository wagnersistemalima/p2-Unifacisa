package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.print("Nome do produto: ");
		String name = sc.nextLine();	
		System.out.print("Preço do produto: ");
		double price = sc.nextDouble();
		
		double discountProduct = price;
		if (price > 0.0 && price <= 100.0) {
			discountProduct -= price * 0.05;
		}
		else if(price > 100.0 && price <= 500.0) {
			discountProduct -= price * 0.10;
		}
		else {
			discountProduct -= price * 0.15;
		}
		if (price == 0.0) {
			discountProduct = price;
		}
		
		System.out.println("Nome do produto: " + name + ". $ " + String.format("%.2f", discountProduct));
		}
		catch (InputMismatchException e) {
			System.out.println("Erro no input!");
			e.printStackTrace();
		}
		
		System.out.println("Fim do programa!");
		
		sc.close();
	}

}
