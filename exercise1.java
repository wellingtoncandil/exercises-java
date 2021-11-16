/*
 * Faça um programa para calcular o estoque médio de uma peça, sendo que:
   ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2. 
 */

package lista_exercicios;

import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(".:Calculadora de estoque médio:.");
		System.out.println("Digite a quantidade máxima: ");
		int estMax = sc.nextInt();
		System.out.println("Digite a quantidade minima: ");
		int estMin = sc.nextInt();
		double estMed = (estMax + estMin)/2;
		
		System.out.println("O estoque médio para a peça é: "+estMed);
		sc.close();

	}

}
