/*
 * Faça um programa para pagamento de comissão de vendedores de peças, levando-se em consideração que sua
 comissão será de 5% do total da venda e que você tem os seguintes dados:
- Identificação do vendedor
- Código da peça
- Preço unitário da peça
- Quantidade vendida
 */
package lista_exercicios;

import java.io.PrintStream;
import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("..:Calculo do pagamento de comissões:.. ");
		
		int vendedorId, codPeca;
		double precoUnit, qtdVendida, comissao = 0.05f;
		
		System.out.println("Digite o ID do vendedor: ");
		vendedorId = sc.nextInt();
		System.out.println("Digite o código da peça: ");
		codPeca = sc.nextInt();
		System.out.println("Digite o preço unitário: ");
		precoUnit = sc.nextDouble();
		System.out.println("Informe a quantidade vendida: ");
		qtdVendida = sc.nextDouble();
		
		System.out.println("INFORMAÇÕES DA VENDA");
		System.out.println("ID Vendedor: "+ vendedorId);
		System.out.println("Código da peça: "+ codPeca);
		System.out.printf("Preço unitário da peça: R$%.2f%n", precoUnit );
		System.out.println("Quantidade vendida: "+qtdVendida);
		System.out.printf("Comissão do vendedor: R$%.2f%n", (qtdVendida*precoUnit)*comissao);
		
		sc.close();

	}

}
