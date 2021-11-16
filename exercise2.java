/*
 * Faça um programa que:
- Leia a cotação do dólar
- Leia um valor em dólares
- Converta esse valor para Real
- Mostre o resultado 

 */
package lista_exercicios;

import java.util.Scanner;

public class exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe a cotação do dolar: ");
		double cotacaoDol = sc.nextDouble();
		System.out.println("Digite o valor em dolares que será convertido: ");
		double qtdDol = sc.nextDouble();
		System.out.printf("O valor em reais é de: %.2f%n", qtdDol * cotacaoDol);
		
		sc.close();
	}
}
