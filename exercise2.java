/*
 * Fa�a um programa que:
- Leia a cota��o do d�lar
- Leia um valor em d�lares
- Converta esse valor para Real
- Mostre o resultado 

 */
package lista_exercicios;

import java.util.Scanner;

public class exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe a cota��o do dolar: ");
		double cotacaoDol = sc.nextDouble();
		System.out.println("Digite o valor em dolares que ser� convertido: ");
		double qtdDol = sc.nextDouble();
		System.out.printf("O valor em reais � de: %.2f%n", qtdDol * cotacaoDol);
		
		sc.close();
	}
}
