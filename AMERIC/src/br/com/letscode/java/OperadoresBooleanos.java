package br.com.letscode.java;

public class OperadoresBooleanos {

	public static void main(String[] args) {
//		
//		//Declaração de Variável e Atribuição com um valor lógico.
//		boolean resultado = false;
//		
//		//Atalho: sout ou sysout
//		System.out.println(resultado);

		//Algoritmo: uma sequencia de passos
		boolean finDeSemana = false;
		boolean fazendoSol = false;
		boolean vamosAPraia = finDeSemana && fazendoSol;
		
		//  TABELA VERDADE
		// Operador && (AND)
		// true && true = true
		// true && false = false
		// false && true = false
		// false && false = false
		
		// Operador || (OR)
		// true || true = true
		// true || false = true
		// false || true = true
		// false || false = false
		
		// Operador Ternário: é o ponto de interrogação(?), temos três termos.
		// 1° Termo: o termo que está sendo avaliado, por isso a interrogação (?).
		// 2° Termo: caso o valor seja Verdadeiro.
		// 3° Termo: caso o valor seja Falso.
		
		System.out.println(vamosAPraia);
		
		String mensagem = finDeSemana ? "É fim de semana" : "Não é fim de semana";
		System.out.println(mensagem);
		
		
		
		
	}

}
