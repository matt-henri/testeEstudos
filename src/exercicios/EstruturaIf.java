package exercicios;

import java.util.Scanner;

public class EstruturaIf {
	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		System.out.println("Digite um número: ");
		number = sc.nextInt();
		if ( number % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
		
		
		sc.close();
	}
}
