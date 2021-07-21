package br.com.wesleyoliveira;

import java.util.Scanner;

public class CondicaoEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
		
		int x;
		
		Scanner teclado = new Scanner(System.in);
		
		x = teclado.nextInt();
		
		if (x < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}
		
		teclado.close();

	}

}
