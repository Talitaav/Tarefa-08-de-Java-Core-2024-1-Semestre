package tarefa08_java;

import java.util.Scanner;

public class Exercicio01 {

	/*
	 * 1) Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um
	 * número qualquer.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número para a tabuada: ");
		int num = sc.nextInt();

		System.out.println("Tabuada de multiplicação para " + num + ":");
		for (int i = 1; i <= 10; i++) {
			int resultado = num * i;
			System.out.println(num + " x " + i + " = " + resultado);
		}
		sc.close();
	}

}
