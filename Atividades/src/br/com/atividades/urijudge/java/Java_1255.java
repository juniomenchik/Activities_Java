package br.com.atividades.urijudge.java;

  
import java.util.Scanner; //import scan
import java.util.Arrays; //import arrays

public class Java_1255{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int numTestes = scanner.nextInt(), freqMaior, len;
		char c;
		String entrada, resultado;
		int[] numLetras = new int[26]; 
		scanner.nextLine();
		while(numTestes-- > 0){
			resultado = "";
			entrada = scanner.nextLine();
			freqMaior = 0;
			Arrays.fill(numLetras, 0);
			entrada = entrada.toLowerCase();
			len = entrada.length();
			for(int i = 0; i < len; i++){
				c = entrada.charAt(i);
				if(c >= 'a' && c <= 'z'){
					numLetras[c-97]++;
					if(numLetras[c-97] > freqMaior)
						freqMaior = numLetras[c-97];
				}
			}
			for(int i = 0; i < 26; i++){

				if(numLetras[i] == freqMaior)
					resultado += (char) ('a' + i);
			}
			
			
			System.out.println(resultado);
		}
	}
}