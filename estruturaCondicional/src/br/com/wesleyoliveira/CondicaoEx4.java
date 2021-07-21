package br.com.wesleyoliveira;

import java.util.Scanner;

public class CondicaoEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
		//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		
		int hI, hF;
		
		Scanner teclado = new Scanner (System.in);
		
		hI = teclado.nextInt();
		hF = teclado.nextInt();
		
		int duracao;
		if (hI < hF) {
			duracao = hI - hF;
		}
		else {
			duracao = 24 - hI + hF;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		teclado.close();
		

	}

}
