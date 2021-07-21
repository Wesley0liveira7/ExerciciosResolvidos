package br.com.wesleyoliveira;

import java.util.Locale;
import java.util.Scanner;

public class CondicaoEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//	Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
	//	de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o 
	//	ponto, ou se est� sobre um dos eixos cartesianos ou na origem (x = y = 0).
	//	Se o ponto estiver na origem, escreva a mensagem �Origem�.
	//	Se o ponto estiver sobre um dos eixos escreva �Eixo X� ou �Eixo Y�, conforme for a 
	//	situa��o.
		

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		double x = teclado.nextDouble();
		double y = teclado.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}
		else if (x == 0.0) {
			System.out.println("Eixo Y");
		}
		else if (y == 0.0) {
			System.out.println("Eixo X");
		}
		else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		
		teclado.close();
	}
	
}