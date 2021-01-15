package br.com.atividades.testes;

import java.util.Scanner;
import java.util.Stack;

public class TesteStack {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numdepilhas = scanner.nextInt();

		@SuppressWarnings("unchecked")
		Stack<Integer> pilhas[] = new Stack[numdepilhas];

		for (int i = 1; i < numdepilhas; i++) {

			pilhas[i] = new Stack<>();

		}
		int i = 10;

		pilhas[1].push(i);

		int b = 20;

		pilhas[2].push(b);

		System.out.println(pilhas[1].peek());

		System.out.println(pilhas[2].peek());

		scanner.close();

	}

}
