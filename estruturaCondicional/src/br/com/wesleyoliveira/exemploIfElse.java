package br.com.wesleyoliveira;

import java.util.Scanner;

public class exemploIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hora;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Quantas horas? ");
		hora = teclado.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia!");
		}
		else if (hora < 18) {
			System.out.println("Boa Tarde!");
				
			}
		else {
			System.out.println("Boa Noite!");
		}
		
		teclado.close();

	}

}
