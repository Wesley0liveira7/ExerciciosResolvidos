package br.com.wesleyoliveira;

import java.util.Locale;
import java.util.Scanner;

public class CondicaoEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Em um pa�s imagin�rio denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem 
		//que nele n�o existem pol�ticos corruptos e os recursos arrecadados s�o utilizados em benef�cio da popula��o, sem 
		//qualquer desvio. A moeda deste pa�s � o Rombus, cujo s�mbolo � o R$.
		//Leia um valor com duas casas decimais, equivalente ao sal�rio de uma pessoa de Lisarb. Em seguida, calcule e 
		//mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
		//Lembre que, se o sal�rio for R$ 3002.00, a taxa que incide � de 8% apenas sobre R$ 1000.00, pois a faixa de 
		//sal�rio que fica de R$ 0.00 at� R$ 2000.00 � isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa � 
		//de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com 
		//duas casas decimais.
		
		Scanner teclado = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		float salario;
		
		salario = teclado.nextFloat();
		
		if ( salario >= 0.00 && salario <= 2000.00) {
			System.out.println("Isento");
		}
		

	}

}
