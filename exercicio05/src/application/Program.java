package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
		
		int positivo = 0;
		int par = 0;
		
		for (int i=1; i<=25; i++) {
			System.out.print(i + "º numero: ");
			int numero = sc.nextInt();
			
			if (numero > 0) {
				positivo ++;
			}
			if (numero % 2 == 0) {
				par++;
			}
			
		}
		
		System.out.println("Quantidade de numeros positivo = " + positivo);
		System.out.println("Quantidade de numeros pares = " + par);
		}
		catch (InputMismatchException e) {
			System.out.println("Erro no input!");
			e.printStackTrace();
		}
		
		System.out.println("Fim do programa!");
		sc.close();
	}

}
