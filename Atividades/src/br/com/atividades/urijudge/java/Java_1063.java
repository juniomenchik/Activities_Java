package br.com.atividades.urijudge.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Stack;


public class Java_1063 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String numVagoes;
        String[] Sequencia, newSequencia;
        int numVagoesInteiro, atual;
        while (!(numVagoes = in.readLine()).equals("0")) {
            numVagoesInteiro = Integer.parseInt(numVagoes);
            Sequencia = read().split("\\s");
            newSequencia = read().split("\\s");
            Stack<String> stack = new Stack<>();
            atual = 0;
            for (int i = 0; i < numVagoesInteiro; i++) {
                stack.push(Sequencia[i]);
                out.print("I");
                while (stack.size() > 0 && newSequencia[atual].equals(stack.lastElement())) {
                    atual++;
                    stack.pop();
                    out.print("R");
                }
            }
            out.println(stack.size() > 0 ? " Impossible" : "");
        }
        out.close();
    }

    private static String read() throws IOException {
        return in.readLine();
    }

}