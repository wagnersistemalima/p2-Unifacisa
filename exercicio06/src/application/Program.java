package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
		int soma = 0;
		for (int i=0; i<50; i++) {
			System.out.print(i + 1 + "º numero: ");
			int numero = sc.nextInt();
			if (numero % 3 == 0) {
				soma += numero;
			}
		}
		
		System.out.println("A soma dos numeros digitados que são multiplos de 3 = " + soma);
		}
		catch (InputMismatchException e) {
			System.out.println("Erro no input!");
			e.printStackTrace();
		}
		
		System.out.println("Fim do programa...");
		
		sc.close();
	}

}
