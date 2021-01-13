package br.com.atividades.urijudge.java;

import java.util.Scanner;

public class Java_1036 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double a = 10.0;
		double b = 20.1;
		double c = 5.1;
		
		double r1 = 0.0;
		double r2 = 0.0;
		
		String str = scanner.nextLine();
		String arstr []= str.split(" ");
		
		
		
		
		double delta = (b*b);
		delta-=(4*a*c);
		
		

		
		r1 = -b + Math.sqrt(delta);
		r2 = -b - Math.sqrt(delta);
		r1 = r1 / (2*a);
		r2 = r2 / (2*a);
		System.out.printf("R1 = %.5f %n",r1);
		System.out.printf("R2 = %.5f %n",r2);
		//   RAIZ         Math.sqrt(a)
		// 					Math.pow(var,exp)
		// 					Math.pow(5, 2)
		
		scanner.close();
	}
	
}
