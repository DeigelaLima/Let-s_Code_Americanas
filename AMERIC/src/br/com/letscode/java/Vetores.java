package br.com.letscode.java;

import java.util.Arrays;

public class Vetores {

	public static void main(String[] args) {
		
		//Declaração do array
//		int [] numeros = new int[5];
//		String [] letras = new String[5];
		
		//[0] [1] [2] [3] [4]
//		numeros[0] = 1;
//		numeros[1] = 2;
//		numeros[2] = 3;
//		numeros[3] = 4;
//		numeros[4] = 5;
		
//		letras[0] = "A";
//		letras[1] = "B";
//		letras[2] = "C";
//		letras[3] = "D";
//		letras[4] = "E";

		//[I@6f2b958e
//		System.out.println(numeros);
		
		//acessar os elementos dentro do array
//		for(int i = 0; i < numeros.length; i++) {
//			System.out.println(numeros[i]);
//		}
//		
//		for(int i = 0; i < letras.length; i++) {
//			System.out.println(letras[i]);
//		}
		
		//se souber quais os valores que quero adicionar no array
		//posso usar essa anotação.
		String[] letras = {"A", "B", "C", "D", "E"};
//		for(int i = 0; i < letras.length; i++) {
//			System.out.println(letras[i]);
//		}
		
		//Outra anotação para imprimir um array
		System.out.println(Arrays.toString(letras));
	}

}



//[I@6f2b958e
//[ = significa um array
//I = array de inteiros
//@6f2b958e = referencia de posição de memória, onde está armazenado o array.