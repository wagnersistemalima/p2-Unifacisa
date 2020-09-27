package application;

import entities.ContaCorrente;

public class Program {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente("Joao", 1010, 200.0, 500.0);
		System.out.println(conta);
		System.out.println("---------------------------------");
		
		double quantia = 200.0;
		conta.depositar(quantia);
		System.out.println(conta);                                // teste depositar
		System.out.println("----------------------------------");
		
		double saque = 200.0;
		conta.saque(saque);                                       // teste sacar
		System.out.println(conta);
		System.out.println("-----------------------------------");
		
		ContaCorrente conta1 = new ContaCorrente("Maria", 1011, 200.0);
		System.out.println(conta1);
		System.out.println("-----------------------------------");
		
		
		double transferir = 150.0;                               // teste trasferir
		conta.transferir(transferir, conta1);
		System.out.println(conta1);
		System.out.println("------------------------------------");
		
		System.out.println(conta);
		
	}

}
