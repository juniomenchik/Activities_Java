package br.com.atividades.urijudge.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Java_1024 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {

		for (int j = Integer.parseInt(in.readLine()); j > 0; j--) {

			String fraseCrip = in.readLine();
			int tam = fraseCrip.length();
			char[] frarray = new char[200];

			double metade = (double) tam / 2;
			int metadecerta;

			if (metade == (int) metade) {
				metadecerta = (int) metade;
			} else {
				metade -= 0.5;
				metadecerta = (int) metade;
			}

			frarray = fraseCrip.toCharArray();
/**
 * 			Na primeira passada, somente caracteres que sejam letras
 * 			 minúsculas e maiúsculas devem ser deslocadas 3 posições para a direita,		
 */
			for (int i = 0; i < tam; i++) {

				if (frarray[i] >= 97 && frarray[i] <= 122 || frarray[i] >= 65 && frarray[i] <= 90) {


					
					frarray[i] += 3;
				}

			}

			char[] versearray = new char[200];
			versearray = fraseCrip.toCharArray();
			int aux = 0;
/**
 *  Na segunda passada, a linha deverá ser invertida.
 */
			for (int y = tam - 1; y >= 0; y--) {

				versearray[aux] = frarray[y];

				aux++;

			}
/**
 *  Na terceira e última passada, todo e qualquer caractere a partir da metade em diante (truncada) devem ser
 *   deslocados uma posição para a esquerda na tabela ASCII. Neste caso, 'b' vira 'a' e 'a' vira '`
 */
			for (int trunk = metadecerta; trunk < tam; trunk++) {

				versearray[trunk] -= 1;

			}

			for (int x = 0; x < tam; x++) {
				out.print(versearray[x]);
			}
			out.println();
		}

		out.close();
	}

}
