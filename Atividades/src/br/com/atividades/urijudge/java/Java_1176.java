package br.com.atividades.urijudge.java;

import java.util.Scanner;

public class Java_1176 {

	public static void main(String[] args) {

		int varVezes;
		int varEntrada;
		int i, j;
		long fib[] = new long[61];
		fib[0] = 0;
		fib[1] = 1;

		Scanner scanner = new Scanner(System.in);
		varVezes = scanner.nextInt();

		for (j = 0; j < varVezes; j++) {
			varEntrada = scanner.nextInt();

			if (varEntrada <= 60 && varEntrada >= 0) {
				for (i = 2; i < 61; i++) {
					fib[i] = fib[i - 1] + fib[i - 2];
					if (varEntrada == 0) {
						System.out.println("Fib("+ 0 +") = " + 0);
						break;
					} else if (varEntrada == 1) {
						System.out.println("Fib("+ 1 +") = " + 1);
						break;
					}

					if (i == varEntrada) {
						System.out.println("Fib("+ i +") = " + fib[i]);
					}
					
				}

			} else {

			}

		}

	}

}
