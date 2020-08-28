package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.print("Digite o primeiro valor: ");
		double valor1 = sc.nextDouble();
		System.out.print("Digite o segundo valor: ");
		double valor2 = sc.nextDouble();
		
		if (valor1 > valor2) {
			System.out.println("O maior valor � " + valor1);
		}
		else if (valor2 > valor1) {
			System.out.println("O maior valor � " + valor2);
		}
		else {
			System.out.println("Os valores s�o iguais!");
		}
		
		}
		catch (InputMismatchException e) {
			System.out.println("Erro no input!");
			e.printStackTrace();
		}
		
		System.out.println("Fim do programa....");
		sc.close();
	}

}
