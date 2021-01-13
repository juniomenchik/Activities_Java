package br.com.atividades.urijudge.java;

import java.util.Scanner;

public class Java_1036 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		
		double r1 = 0.0;
		double r2 = 0.0;
		
		String str = scanner.nextLine();
		
		String arstr[]= str.split("\\s");
		
		a = Double.parseDouble(arstr[0]);
		b = Double.parseDouble(arstr[1]);
		c = Double.parseDouble(arstr[2]);
		
			
			
		
		
		double delta = (b*b);
		delta-=(4*a*c);
		
		

		
		r1 = -b + Math.sqrt(delta);
		r2 = -b - Math.sqrt(delta);
		r1 = r1 / (2*a);
		r2 = r2 / (2*a);
		if( Double.isNaN(r1) ||  Double.isNaN(r2) ) {
			System.out.println("Impossivel calcular");
		}else {
			System.out.printf("R1 = %.5f%n",r1);
			System.out.printf("R2 = %.5f%n",r2);
		}
		
		//   RAIZ         Math.sqrt(a)
		// 					Math.pow(var,exp)
		// 					Math.pow(5, 2)

		scanner.close();
		
	}
	
}
