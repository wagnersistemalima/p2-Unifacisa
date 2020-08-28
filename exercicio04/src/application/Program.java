package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		try {
		System.out.print("Digite o primeiro número: ");
		int numero1 = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		int numero2 = sc.nextInt();
		
		int maior = 0;
		int menor = 0;
		
		if (numero1 > numero2) {
			maior = numero1;
			menor = numero2;
		}
		else {
			maior = numero2;
			menor = numero1;
		}
		int contador = 0;
		for (int i=menor + 1; i < maior; i++) {
			if (i % 4 == 0) {
				contador++;
			}
		}
		
		System.out.println("A quantidade de multiplos de 4 entre o numero " + menor + " e " + maior + " = " + contador + " multiplos");
		
		}
		catch (InputMismatchException e) {
			System.out.println("Erro no input!");
			e.printStackTrace();
		}
		
		
		System.out.println("Fim do programa!");
		sc.close();
	}

}
