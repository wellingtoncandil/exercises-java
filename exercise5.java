/*
 * Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz
12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média.
Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE.
Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a
fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média,
tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais.
 */

package lista_exercicios;

import java.util.Scanner;

public class exercise5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("..:Quantidade de combustivel utilizada:..");
		double vMedia, distancia, litros;
		System.out.println("Informe o tempo gasto na viagem (HH:mm): ");
		String strTempo = sc.nextLine();
		int horas = Integer.parseInt(strTempo.substring(0,2));
		int minutos = Integer.parseInt(strTempo.substring(3, 5));
		System.out.println("Digite a velocidade média (km/h): ");
		vMedia = sc.nextDouble();
		distancia = ((vMedia/60) * ((horas*60)+minutos));
		litros = distancia / 12;
		
		System.out.println("Velocidade média: "+vMedia);
		System.out.println("Tempo gasto na viagem: "+strTempo);
		System.out.printf("Distancia percorrida %.2f%n",distancia);
		System.out.printf("Quantidade de combustivel gasto(L):%.2f%n ", litros);
		
		sc.close();
	}
}
