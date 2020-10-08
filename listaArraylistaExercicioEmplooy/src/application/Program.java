package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("List of employees:");
		Employee employee1 = new Employee(333, "Maria Brown", 4000.0);
		Employee employee2 = new Employee(536, "Alex Grey", 3000.0);
		Employee employee3 = new Employee(772, "Bob Green", 5000.0);
		
		List<Employee> list = new ArrayList<Employee>();
		
		// adicionando employees na lista
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		
		for (Employee start: list) {
			System.out.println(start);
		}
		
		System.out.println();
		
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		
		// função de alta ordem lambida, que recebe um predicado, procura um id na lista
		Employee posicaoEmployeeNaLista = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (posicaoEmployeeNaLista == null) {
			System.out.println("ID não encontrado");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			posicaoEmployeeNaLista.increaseSalary(percentage);
		}
		
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("List of employees:");
		for (Employee start: list) {
			System.out.println(start);
		}
		
		System.out.println("----------------------------------------------------------------");
		
		
		sc.close();
	}
	
	// funçao para evitar que usuario digite um id repetido
	public static boolean hasId(List<Employee> list, int id) {
		Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return employee != null;
	}
	
	// função auxiliar para pesquisar na lista um ID
	public static Integer pesquisarId(List<Employee> list, int id) {
		for (int i=0; i<list.size(); i++) {
			// get(i) = se o elemento na lista na posição i
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
