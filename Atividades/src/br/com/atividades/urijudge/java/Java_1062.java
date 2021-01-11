package br.com.atividades.urijudge.java;

import java.util.Scanner;

public class Java_1062 {

	public static void main(String[] args) {
		int entradalac;
		Scanner x = new Scanner(System.in);
		entradalac = x.nextInt();
		
			for(int y=0;y!=entradalac;entradalac=x.nextInt()) {
				String crescente = "";
				String decrescente = "";
				for (int i = 0; i <= entradalac; i++) {

					crescente = crescente.concat(Integer.toString(i));

					if (i == entradalac) {
						System.out.println(crescente);
					} else
						crescente = crescente.concat(" ");
				}
				for (int i = entradalac; i >= 0; i--) {

					decrescente = decrescente.concat(Integer.toString(i));

					if (i == 0) {
						System.out.println(decrescente);
					} else
						decrescente = decrescente.concat(" ");
				}
			}
		

		x.close();
	}

}
