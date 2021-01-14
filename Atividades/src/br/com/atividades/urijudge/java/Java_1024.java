package br.com.atividades.urijudge.java;

import java.util.Scanner;

public class Java_1024 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String fraseCrip = input.nextLine();
		int tam = fraseCrip.length();
		char [] frarray = new char[200];
		frarray = fraseCrip.toCharArray();
		
		for(int i = 0;i<tam;i++) {
			frarray[i] += 3; 											//primeira
		}
		
		
//		for(int i = 0;i<tam;i++) {
//			System.out.print(frarray[i]);						// frase completa
//		}	
//		System.out.println();
		
		
		
		char [] versearray = new char[200];
		versearray = fraseCrip.toCharArray();
		int aux=0;
		for(int y = tam-1;y>=0;y--) {

			versearray[aux]=frarray[y];
			
			aux++;
			
		}
		
		
//		for(int i = 0;i<tam;i++) {
//			System.out.print(versearray[i]);						// frase completa
//		}	
//		System.out.println();
		
		
		
		
		
		
	}
	
}
