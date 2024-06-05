package exercicios;

import java.util.Scanner;

public class exSoma {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		System.out.print("Digite um numero: ");
		a = sc.nextInt();
		System.out.print("Digite um número: ");
		b = sc.nextInt();
		int c = a + b;
		System.out.println("A soma de " + a + " + " + b + " = " + c);

		
		
		
		sc.close();
	}

}
