package exercicios;

import java.util.Scanner;

public class RaioDoCirculo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double raio;
		double pi = 3.14159;
		
		System.out.print("digite o raio: ");
		raio = sc.nextDouble();
		
		double area = pi * (raio * raio);
		
		System.out.printf("A = %.4f", + area);
		
		
		
		
		
		sc.close();
	}
}
