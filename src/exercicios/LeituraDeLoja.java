package exercicios;

import java.util.Scanner;

public class LeituraDeLoja {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codDeRoupa1, codDeRoupa2, quantDeRoupa1, quantDeRoupa2;
		double valorDaRoupa1, valorDaRoupa2;
		
		
		System.out.println("Digite o código da peça 1: ");
		codDeRoupa1 = sc.nextInt();
		System.out.println("Digite a quantidade de peças 1: ");
		quantDeRoupa1 = sc.nextInt();
		System.out.println("Digite o valor da peça 1: ");
		valorDaRoupa1 = sc.nextDouble();
		System.out.println("Digite o código da peça 2: ");
		codDeRoupa2 = sc.nextInt();
		System.out.println("Digite a quantidade de peças 2: ");
		quantDeRoupa2 = sc.nextInt();
		System.out.println("Digite o valor da peça 2: ");
		valorDaRoupa2 = sc.nextDouble();
		
		double ValorTotal = (quantDeRoupa1 * valorDaRoupa1 ) + (quantDeRoupa2 * valorDaRoupa2 );
		
		System.out.printf("Valor da pagar = %.2f", + ValorTotal);
		
		
		sc.close();
	}
	
	
	
	
}
