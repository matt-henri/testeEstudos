package exercicios;

import java.util.Scanner;

public class salarioXhorasTrabalhadas {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int number, horas;
		double valorPorHora, salary;
		
		
		System.out.print("Digite a matricúla do funcionário: ");
		number = sc.nextInt();
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		horas = sc.nextInt();
		System.out.print("Digite o valor da hora trabalhada: ");
		valorPorHora = sc.nextDouble();
		
		salary = horas * valorPorHora;
		
		System.out.println("Matricula = " + number);
		System.out.printf("Salário = R$ %.2f", + salary);
		
		
		
		sc.close();
	}
}
