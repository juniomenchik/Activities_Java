package br.com.atividades.urijudge.java;

import java.util.Scanner;

public class Java_1133 {

	public static void main(String[] args) {

		// import java.util.Scanner;

		Scanner scanner = new Scanner(System.in);
		int X = scanner.nextInt();
		int Y = scanner.nextInt();
		scanner.close();
		if (X < Y) {
			for (X+=1; X < Y; X++) {
				if (X % 5 == 2 || X % 5 == 3) {
					System.out.println(X);
				}
			}
		} else if(Y<X){
			for (Y+=1; Y < X; Y++) {
				if (Y % 5 == 2 || Y % 5 == 3) {
					System.out.println(Y);
				}
			}
		}else System.out.println();
	
	}

}
