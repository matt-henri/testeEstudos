package exercicios;

import java.util.Scanner;

public class raio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int a1, b1,a2, b2,a3, b3, soma1, soma2, soma3;
		System.out.println("digite:");
		a1 = sc.nextInt();
		b1 = sc.nextInt();
		System.out.println("digite:");
		a2 = sc.nextInt();
		b2 = sc.nextInt();
		System.out.println("digite:");
		a3 = sc.nextInt();
		b3 = sc.nextInt();
		soma1 = a1 + b1;
		soma2 = a2 + b2;
		soma3 = a3 + b3;
		System.out.println(soma1);
		System.out.println(soma2);
		System.out.println(soma3);
		
		sc.close();
	}
}
