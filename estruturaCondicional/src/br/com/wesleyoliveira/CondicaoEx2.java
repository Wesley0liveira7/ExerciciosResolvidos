package br.com.wesleyoliveira;

import java.util.Scanner;

public class CondicaoEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
		
		Scanner teclado = new Scanner (System.in);
		int x;
		
		x = teclado.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		teclado.close();

	}

}
