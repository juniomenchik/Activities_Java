package br.com.atividades.urijudge.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Java_1082 {

    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int numCasos = 1, numVezes = Integer.parseInt(input.readLine()), prim, seg, x, y, conex;
        int[] arrayInteiros;
        int[][] charMatriz;
        String texto;
        while (numVezes-- > 0) {
            arrayInteiros = lerArray();
            prim = arrayInteiros[0];
            seg = arrayInteiros[1];
            charMatriz = new int[prim][prim];
            while (seg-- > 0) {
                texto = input.readLine();
                x = (int) texto.charAt(0) - 97;
                y = (int) texto.charAt(2) - 97;
                charMatriz[x][y] = 1;
                charMatriz[y][x] = 1;
            }
            conex = 0;
            System.out.printf("Case #%d:\n", numCasos++);
            for (int i = 0; i < prim; i++) {
                TreeSet<Integer> treeSet = new TreeSet<>(); //set para ordenar os elementos adicionados
                treeSet.add(i);
                treeSet = getConexoes(treeSet, charMatriz, i, 0);
                if (!treeSet.isEmpty()) {
                    conex++;
                    for (Integer next : treeSet) {
                        System.out.print((char) (next + 97) + ",");
                    }
                    System.out.println();
                }
            }
            System.out.printf("%d connected components\n", conex);
            System.out.println();
        }
        System.out.close();
    }

    private static int[] lerArray() throws IOException { //separar os chars da string 
        String[] line = input.readLine().split("\\s");
        int l = line.length;
        int[] a = new int[l];
        for (int i = 0; i < l; i++) {
            a[i] = Integer.parseInt(line[i]);
        }
        return a;
    }
    
    private static TreeSet<Integer> getConexoes(TreeSet<Integer> treeSet, int[][] matriz, int i, int p) { //calcular o numero de conecoes dos casos
        boolean temConexao = false;
        int semConexao = 0;
        for (int j = 0; j < matriz[i].length; j++) {
            if (matriz[i][j] == 1) {
                temConexao = true;
                matriz[i][j] = 2;
                matriz[j][i] = 2;
                treeSet.add(j);
                treeSet = getConexoes(treeSet, matriz, j, p+ 1); //recursao das conexoes
            } else if (matriz[i][j] == 0) {
                semConexao++;
            }
        }
        if (!temConexao && semConexao < matriz[i].length && p == 0) { //remocao dos elementos sem a conexao
            treeSet.remove(i);
        }
        return treeSet;
    }
}