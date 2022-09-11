package br.com.letscode.java;

public class Vetores2 {

	public static void main(String[] args) {
		
		int[] numeros = {9, 10, 12, 25, 2};
		int maior = numeros[0];
		int menor = numeros[0];
		int media = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] > maior) {
				//atualizo a variável maior
				maior = numeros[i];
			}
			if(numeros[i] < menor) {
				//atualizo a variável menor
				menor = numeros[i];
			}
			//somando os numeros e atribuido a media
			media += numeros[i];
		}
		
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		//dividindo pelo numero de elementos  
		System.out.println("Média: " + media / numeros.length);
	}

}
