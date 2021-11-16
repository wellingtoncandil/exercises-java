/*
 * Ler quatro valores num�ricos inteiros e apresentar o resultado dois a dois da adi��o e multiplica��o entre os
valores lidos, baseando-se na utiliza��o do conceito de propriedade distributiva. Dica: se forem lidas as vari�veis
A, B, C e D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B
com D e por �ltimo C com D. Note que para cada opera��o ser�o utilizadas seis combina��es. Assim sendo,
devem ser realizadas doze opera��es de processamento, sendo seis para as adi��es e seis para as
multiplica��es.
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
					System.out.println("Multiplica��o #"+(i+1)+" e #"+(j+1)+": "+r);
				}		
			}
		}
		
		
		
		sc.close();
		
	}
}
