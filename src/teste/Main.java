package teste;

import java.util.Scanner;

/**
 * 
 * @author henriquerc_18
 *
 */

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a = 0, b = 0, c = 0;
		Baskara b1 = new Baskara(a, b, c);
		
		System.out.println("Por favor, digite um número para A: ");
		b1.a = ler.nextInt();
		
		System.out.println("Por favor, digite um número para B: ");
		b1.b = ler.nextInt();
		
		System.out.println("Por favor, digite um número para C: ");
		b1.c = ler.nextInt();
		
		System.out.println(b1.toString());

	}

}
