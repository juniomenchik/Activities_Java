package br.com.atividades.testes; 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class PrinterClass {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {

		out.println("dale?");
		String l;
		l = in.readLine();
		int j = (int)in.read();
		out.println(j);
		out.println(l);
		out.close();  
	}

}
