package exercicios;

import java.util.Scanner;

public class ValoresGeometricos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float A, B, C;
		double pi = Math.PI;
		
		System.out.print("Digite o valor de A: ");
		A = sc.nextFloat();
		System.out.print("Digite o valor de B: ");
		B = sc.nextFloat();
		System.out.print("Digite o valor de C: ");
		C = sc.nextFloat();
		
		float triangulo = (A * C) / 2;
		double circulo = pi * ( C * C);
		float trapezio = ((A + B)* C) / 2;
		float quadrado = B * B;
		float retangulo = A * B;
		
		System.out.printf("Trinangulo : %.3f \n", + triangulo);
		System.out.printf("Círculo : %.3f \n", + circulo);
		System.out.printf("Trapézio : %.3f \n", + trapezio);
		System.out.printf("Quadrado : %.3f \n", + quadrado);
		System.out.printf("Retangulo : %.3f \n", + retangulo);
		
		
		
		sc.close();
	}
	
}
