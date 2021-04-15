package br.com.atividades.urijudge.java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Stack;

public class Java_1062 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		String numVagoes;
		String[] vagoes;
		int N;
		int vagaoAtual; 
		int vagao;
		boolean primeiroTeste = true;
		
		while (!(numVagoes = in.readLine()).equals("0")) {
			
			N = Integer.parseInt(numVagoes);
			if (primeiroTeste) {
				primeiroTeste = false;
			} else {
				out.println();
			}																						
			while (!(numVagoes = in.readLine()).equals("0")) {			
				Stack<Integer> vagoesAsair = new Stack<>();
				vagoes = numVagoes.split("\\s");
				vagaoAtual = 0;
				vagao = Integer.parseInt(vagoes[vagaoAtual]);
				
				for (int i = 1; i <= N; i++) {					//1 3 2 5 4 6 =
					vagoesAsair.push(i);								//>1 2   // stack		

					while (!vagoesAsair.isEmpty() && vagao == vagoesAsair.lastElement()) {
						if (++vagaoAtual < N) {
							vagao = Integer.parseInt(vagoes[vagaoAtual]);
						}
						vagoesAsair.pop();
					}
				}
				
				if(vagoesAsair.isEmpty()){
					out.println("Yes");
				}else out.println("No");
			}
		}
		out.println();
		out.close();
	}

}