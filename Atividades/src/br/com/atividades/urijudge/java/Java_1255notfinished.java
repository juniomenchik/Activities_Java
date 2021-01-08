package br.com.atividades.urijudge.java;

import java.util.Scanner;

public class Java_1255notfinished {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

		System.out.print("write your first message :");
		
		String PrimeiraEntrada = scanner.nextLine();
		scanner.close();
		char[] c = PrimeiraEntrada.toCharArray();

		System.out.println("this is your first message : "+ PrimeiraEntrada);

		for(char d : c) {
			System.out.print(d + "  ");
			
			
		}
		
		
	}
	
}
