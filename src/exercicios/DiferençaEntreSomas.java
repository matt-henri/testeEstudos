package exercicios;

import java.util.Scanner;

public class DiferençaEntreSomas {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diferenca;
		
		System.out.print("Digite o valor de A: ");
		a = sc.nextInt();
		System.out.print("Digite o valor de B: ");
		b = sc.nextInt();
		System.out.print("Digite o valor de C: ");
		c = sc.nextInt();
		System.out.print("Digite o valor de D: ");
		d = sc.nextInt();
		
		diferenca = (a * b) - (c * d);
		
		
		System.out.println("Diferença: " + diferenca);
		
		sc.close();
	}
}
