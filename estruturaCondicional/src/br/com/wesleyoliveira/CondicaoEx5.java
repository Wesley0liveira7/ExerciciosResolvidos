package br.com.wesleyoliveira;

import java.util.Locale;
import java.util.Scanner;

public class CondicaoEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
		//seguir, calcule e mostre o valor da conta a pagar.
		
		Scanner teclado = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		int cod, qt;

		
		cod = teclado.nextInt();
		qt = teclado.nextInt();
		
		if (cod == 1) {
			System.out.printf("Total: %.2f", qt * 4.00);
		}
		else if (cod == 2) {
			System.out.printf("Total: %.2f", qt * 4.50);
		}
		else if (cod == 3) {
			System.out.printf("Total: %.2f", qt * 5.00);
		}
		else if (cod == 4) {
			System.out.printf("Total: %.2f", qt * 2.00);
		}
		else if (cod == 5) {
			System.out.printf("Total: %.2f", qt * 1.50);
		}

		teclado.close();
	}

}
