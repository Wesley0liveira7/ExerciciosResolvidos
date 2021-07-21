package br.com.wesleyoliveira;

import java.util.Scanner;

public class CondicaoEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
		//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
		//ordem crescente ou decrescente.
		
		int x , y ;
		Scanner teclado = new Scanner(System.in);
		
		x = teclado.nextInt();
		y = teclado.nextInt();
		
		if ( x % y == 0) {
			System.out.println("Sao Multiplos");
		}
		else if (y % x == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		teclado.close();
		

	}

}
