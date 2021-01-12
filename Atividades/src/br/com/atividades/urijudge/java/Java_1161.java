package br.com.atividades.urijudge.java;

import java.util.Scanner;

public class Java_1161 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String resp = "";
			Long vetor = (long) 0;
			Long totalvet = (long) 1;
			Long vetor2 = (long) 0;
			Long totalvet2 = (long) 1;
			resp = scanner.nextLine();
			String array [] = resp.split(" ");
			vetor = (long) Integer.parseInt(array[0]);

			vetor2 = (long) Integer.parseInt(array[1]);
			
			for (int i = 0; vetor > i; vetor--) {
				totalvet = totalvet * vetor;
			}

			
			for (int i = 0; vetor2 > i; vetor2--) {
				totalvet2 = totalvet2 * vetor2;
			}
			System.out.println(totalvet + totalvet2);
		}
		scanner.close();
	}

}
