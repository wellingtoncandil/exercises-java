/*
 * Fa�a um programa para pagamento de comiss�o de vendedores de pe�as, levando-se em considera��o que sua
 comiss�o ser� de 5% do total da venda e que voc� tem os seguintes dados:
- Identifica��o do vendedor
- C�digo da pe�a
- Pre�o unit�rio da pe�a
- Quantidade vendida
 */
package lista_exercicios;

import java.io.PrintStream;
import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("..:Calculo do pagamento de comiss�es:.. ");
		
		int vendedorId, codPeca;
		double precoUnit, qtdVendida, comissao = 0.05f;
		
		System.out.println("Digite o ID do vendedor: ");
		vendedorId = sc.nextInt();
		System.out.println("Digite o c�digo da pe�a: ");
		codPeca = sc.nextInt();
		System.out.println("Digite o pre�o unit�rio: ");
		precoUnit = sc.nextDouble();
		System.out.println("Informe a quantidade vendida: ");
		qtdVendida = sc.nextDouble();
		
		System.out.println("INFORMA��ES DA VENDA");
		System.out.println("ID Vendedor: "+ vendedorId);
		System.out.println("C�digo da pe�a: "+ codPeca);
		System.out.printf("Pre�o unit�rio da pe�a: R$%.2f%n", precoUnit );
		System.out.println("Quantidade vendida: "+qtdVendida);
		System.out.printf("Comiss�o do vendedor: R$%.2f%n", (qtdVendida*precoUnit)*comissao);
		
		sc.close();

	}

}
