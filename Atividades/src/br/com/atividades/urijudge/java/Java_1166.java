package br.com.atividades.urijudge.java;

import java.util.Scanner;
import java.util.Stack;

public class Java_1166 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String sisi = scanner.nextLine();
		for (int n = Integer.parseInt(sisi); n > 0; n--) {
			String numdepilha = scanner.nextLine();
			int numdepilhas = Integer.parseInt(numdepilha);
			scanner.reset();
			Stack<Integer> pilhas[] = new Stack[numdepilhas];
			for (int i = 0; i < numdepilhas; i++) {
				pilhas[i] = new Stack<>();
			}
			int bola = 1;
			for (int vara = 0; vara < numdepilhas;) {

				if (pilhas[vara].empty()) {

					pilhas[vara].push(bola);
					bola++;
					vara = 0;
				} else {

					int ultimabola = pilhas[vara].peek();
					double soma = bola + ultimabola;
					soma = Math.sqrt(soma);
					if (soma == (int) soma) {
						pilhas[vara].push(bola);
						bola++;
						vara = 0;
					} else
						vara++;
				}

			}
			if(numdepilhas>50) {
				System.out.println(-1);
			}else {
				System.out.println(bola - 1);
			}
			
		}

		System.out.println();

		scanner.close();
	}

}
