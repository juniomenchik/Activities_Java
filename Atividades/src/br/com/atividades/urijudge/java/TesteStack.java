package br.com.atividades.urijudge.java;

import java.util.Stack;

public class TesteStack {

	public static void main(String[] args) {
		
		Stack<Integer> pilha1 = new Stack<>();
	
		int i = 1;
		
		pilha1.push(i);
		
		
		System.out.println(pilha1.peek());
		
		i++;
		
		pilha1.push(i); 	// coloca no topo da pilha
		
		
		System.out.println(pilha1.peek());
		
		
		
	
		
		
	}
	
}
