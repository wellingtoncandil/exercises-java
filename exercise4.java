/*
 * Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e multiplicação entre os
valores lidos, baseando-se na utilização do conceito de propriedade distributiva. Dica: se forem lidas as variáveis
A, B, C e D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B
com D e por último C com D. Note que para cada operação serão utilizadas seis combinações. Assim sendo,
devem ser realizadas doze operações de processamento, sendo seis para as adições e seis para as
multiplicações.
 */

package lista_exercicios;

import java.util.Scanner;

public class exercise4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vet = new int[4];
		System.out.println("Digite os 04 valores a seguir: ");
		for(int i=0; i<vet.length; i++) {
			System.out.print("Valor #"+(i+1)+": ");
			vet[i] = sc.nextInt();
		}
		for(int i=0; i<vet.length-1; i++) {
			for(int j=0; j<vet.length; j++) {
				int r = vet[i]+vet[j];
				if(j!=i && i<j) {
					System.out.println("Soma #"+(i+1)+" e #"+(j+1)+": "+r);
				}		
			}
		}
		System.out.println("---------------------------------------");
		for(int i=0; i<vet.length-1; i++) {
			for(int j=0; j<vet.length; j++) {
				int r = vet[i]*vet[j];
				if(j!=i && i<j) {
					System.out.println("Multiplicação #"+(i+1)+" e #"+(j+1)+": "+r);
				}		
			}
		}
		
		
		
		sc.close();
		
	}
}
