package br.com.atividades.urijudge.java;

import java.util.Scanner;

public class Java_1029 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int testes = input.nextInt();
		for (; testes > 0; testes--) {
			int fibSeqTotal = 0;
			int fibSeqOne = 0;
			int fibSeqTwo = 0;
			int fibSeqContador = input.nextInt();
			int fibTotal = 0;
			int fibum = 0;
			int fidois = 1;
			for (int i = 1; i < fibSeqContador; i++) {
				fibSeqTotal = fibSeqOne + fibSeqTwo + 2;
				fibSeqOne = fibSeqTwo;
				fibSeqTwo = fibSeqTotal;
			}
			for(int j = 1;j<fibSeqContador;j++) {
				fibTotal=fibum+fidois;
				fibum=fidois;
				fidois=fibTotal;
				}
			System.out.println("fib("+fibSeqContador+") = "+fibSeqTotal+" calls = "+fibTotal);
		}

	}

}
