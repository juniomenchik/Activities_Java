package urijudge;

import java.util.Scanner;

public class Java_1151 {

	public static void main(String[] args) {

		Scanner x = new Scanner(System.in);
		int entrada = x.nextInt();
		int saida = entrada - 1;
		int Num1 = 0;
		int Num2 = 1;
		int Num3 = 0;
		if (entrada > 0 && entrada < 46) {
			for (int i = 0; entrada > i; i++) {

				System.out.print(Num1);
				Num3 = Num2;
				Num2 = Num1;
				Num1 = Num2 + Num3;
				if (i != saida) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		x.close();
		System.out.println("hmm");
	
	}
	

}
