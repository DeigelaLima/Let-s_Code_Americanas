package br.com.letscode.java;

public class LacosNumericos {

	public static void main(String[] args) {
		
		// 1 2 3 4 5 6 7 8 9 10
		// Para uma variável que inicia em 1, e vai até 10, mudando 1-por-1(incremento ++), faça:
		// i: variável de controle
		//imprime de 1 a 10
//		for(int i = 1;i <= 10; i++) {
//			System.out.println(i);
//		}
		
		//imprime de 2 em 2, como o i começa em 1,
		//então vai imprimir só os némros ímpares.
//		for(int i = 1; i <= 10; i+=2) {
//			System.out.println(i);
//		}
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.println(j + "x" + i + " = " + j * i);
				// 1 x 1 = 1
				// 2 x 1 = 2
				
			}
		}
	}

}
