/*
 * Fa�a um programa para calcular o estoque m�dio de uma pe�a, sendo que:
   ESTOQUE M�DIO = (QUANTIDADE_M�NIMA + QUANTIDADE_M�XIMA) / 2. 
 */

package lista_exercicios;

import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(".:Calculadora de estoque m�dio:.");
		System.out.println("Digite a quantidade m�xima: ");
		int estMax = sc.nextInt();
		System.out.println("Digite a quantidade minima: ");
		int estMin = sc.nextInt();
		double estMed = (estMax + estMin)/2;
		
		System.out.println("O estoque m�dio para a pe�a �: "+estMed);
		sc.close();

	}

}
