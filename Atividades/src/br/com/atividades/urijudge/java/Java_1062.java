package br.com.atividades.urijudge.java;

import java.util.Scanner;

public class Java_1062 {

	public static void main(String[] args) {
		int entradalac;
		Scanner x = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		entradalac = x.nextInt();

		for (int y = 0; y != entradalac; entradalac = x.nextInt()) {
			String crescente = "";
			String decrescente = "";
			String comparacao = "";
			for (int i = 1; i <= entradalac; i++) {

				crescente = crescente.concat(Integer.toString(i));

				if (i == entradalac) {
				} else
					crescente = crescente.concat(" ");
			}
			for (int i = entradalac; i > 0; i--) {

				decrescente = decrescente.concat(Integer.toString(i));

				if (i == 1) {
				} else
					decrescente = decrescente.concat(" ");
			}
			comparacao = scanner.nextLine();
			for (String j = "0"; j.compareToIgnoreCase(comparacao) != 0; comparacao = scanner.nextLine()) {
				if (comparacao.compareToIgnoreCase(crescente)==0) {
					System.out.println("Yes");
				} else
					if(comparacao.compareToIgnoreCase(decrescente)==0){
					System.out.println("Yes");	
					}else System.out.println("No");
				scanner.reset();
			}
			x.reset();
		}

		scanner.close();
		x.close();
	}

}
