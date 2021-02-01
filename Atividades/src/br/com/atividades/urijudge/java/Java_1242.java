package br.com.atividades.urijudge.java;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Java_1242 {

    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String entrada;
        while ((entrada = input.readLine()) != null) { 
            int ligacoes = 0;
            char[] charEntrada = entrada.toCharArray();
            Stack<Byte> pilha = new Stack<>();
            for (int i = 0; i < entrada.length(); i++) {
                if (!pilha.empty() && temConexao((byte) charEntrada[i], pilha.peek())) {
                    ligacoes++;
                    pilha.pop();
                } else {
                    pilha.push((byte) charEntrada[i]); 
                }
            }
            System.out.println(ligacoes);
        }
    }

    public static boolean temConexao(byte a, byte b) {
        return (a == 'B' && b == 'S') || (b == 'B' && a == 'S') || (a == 'C' && b == 'F') || (b == 'C' && a == 'F'); //retorna se existe a conexao ou nao 
    }
}
