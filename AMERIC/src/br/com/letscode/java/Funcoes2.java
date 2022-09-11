package br.com.letscode.java;

public class Funcoes2 {

	public static void main(String[] args) {
		
		String nomeOriginal = "Let's Code";
		
		//chamando a função saudacao
		saudacao(nomeOriginal);
	}

	public static void saudacao(String nomeParametro) {
		System.out.println("Hello, " + nomeParametro);
	}
}
