package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		try {
			
		int senha = 100;
		int numero = 0;
		int cont = 0;
		int contPar = 0;
		
		while (numero != senha) {
			System.out.print("Numero: ");
			numero = sc.nextInt();
			if (numero % 2 == 0 && numero != 100) {
				contPar++;
			}
			cont++;
		}
		
		 System.out.println("Quantidade de numeros digitado = " + cont);
		 System.out.println("Quantidade de numeros pares = " + contPar);
		}
		catch (InputMismatchException e) {
			System.out.println("Erro no input!");
			e.printStackTrace();
		}
		
		System.out.println("Fim do programa!"); 
		sc.close();
	}

}
