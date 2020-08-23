package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double entrada = sc.nextDouble();
		
		System.out.println("NOTAS:");
		
		List<Double> notas = new ArrayList<Double>();
		notas.add(100.0);
		notas.add(50.0);
		notas.add(20.0);
		notas.add(10.0);
		notas.add(5.0);
		notas.add(2.0);
		
		List<Double> moedas = new ArrayList<Double>();
		moedas.add(1.0);
		moedas.add(0.50);
		moedas.add(0.25);
		moedas.add(0.10);
		moedas.add(0.05);
		
		List<Double> centavos = new ArrayList<Double>();
		centavos.add(0.01);
		
		
		for (Double nota: notas) {
			int quantidadeNotas = (int) (entrada / nota);
			System.out.printf("%d nota(s) de R$ %.2f%n", quantidadeNotas, nota);
			entrada -= quantidadeNotas * nota;
		}
		
		System.out.println("MOEDAS:");
		
		for (Double moeda: moedas) {
			int quantidadeMoedas = (int) (entrada / moeda);
			System.out.printf("%d moeda(s) de R$ %.2f%n", quantidadeMoedas, moeda);
			entrada -= quantidadeMoedas * moeda;
		}
		
		for (Double cent: centavos) {
			int quantidadeCentavos = (int) Math.round(entrada / cent);
			System.out.printf("%d moeda(s) de R$ %.2f%n", quantidadeCentavos, cent);
		}
		
		sc.close();

	}

}
