package br.com.atividades.urijudge.java;

import java.util.Scanner;
import java.util.Stack;

public class Java_1166 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numdepilhas = 5;
		Stack<Integer> pilhas[] = new Stack[numdepilhas];
		for (int i = 0; i < numdepilhas; i++) {
			pilhas[i] = new Stack<>();
		}
		int bola = 1;
		for (int vara = 0; vara < numdepilhas;) {

			if (pilhas[vara].empty()) {
				
				pilhas[vara].push(bola);
				bola++;
			} else {
				
				int ultimabola = pilhas[vara].peek();
				double soma = bola + ultimabola;
				soma = Math.sqrt(soma);
				if (soma == (int) soma) {
					pilhas[vara].push(bola);
					bola++;
				} else
					vara++;
			}

		}

		scanner.close();
	}

}
