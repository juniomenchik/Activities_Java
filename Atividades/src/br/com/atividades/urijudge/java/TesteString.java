package br.com.atividades.urijudge.java;

/**
 * @author Jeff Menchik
 *
 */
public class TesteString {

	public static void main(String[] args) {
		
		System.out.println("Testando Metodos da classe String.");
		
		String nome = "Jeferson";
		String dale = "Jeferson";
//		System.out.println("String nome : " + nome );
//		System.out.println("Testando .charAt(5)   =  " + nome.charAt(5));
//		
//		System.out.println("Testando .codePointAt(1) e (2)  =  " 
//		+ nome.codePointAt(1) + " "+ nome.codePointAt(2));
//		
//		System.out.println("Testando .codePointBefore(2) e (3)  =  " 
//		+ nome.codePointBefore(2) + " " + nome.codePointBefore(3));
//		
//		System.out.println("Testando nome.length() =    " + nome.length());
//		
		System.out.println(nome.compareToIgnoreCase(dale));
		
	}
	
}
