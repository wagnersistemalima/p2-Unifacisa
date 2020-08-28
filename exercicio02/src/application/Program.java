package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			
			double soma = 0.0;
			for (int i=1; i<=3; i++) {
				System.out.print("Digite o " + i + " valor: ");
				double valor = sc.nextDouble();
				soma += valor;
			}
			
			double media = soma / 3;
			System.out.println("A media aritimetica dos valores digitados foi " + String.format("%.2f", media));
		}
		catch (InputMismatchException e ) {
			System.out.println("Erro no input!");
			e.printStackTrace();
		}
		
		
		System.out.println("Fim do programa!");
		sc.close();

	}

}
