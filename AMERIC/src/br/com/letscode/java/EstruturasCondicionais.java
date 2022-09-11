package br.com.letscode.java;

public class EstruturasCondicionais {

	public static void main(String[] args) {
		
		
		// Se nota maior ou igual 70, então aprovado
//		if(nota >= 70) {
//			System.out.println("Aluno Aprovado!");
//		}else {
//			System.out.println("Não aprovado.");
//		}
		
		int nota = 100;
		String graducao;
		
		// A >= 80, B < 80 && >= 70, C < 70 && >= 60, D = 0 caso contrario
		if(nota >= 80) {
			graducao = "A";
		}else if(nota < 80 && nota >= 70) {
			graducao = "B";
		}else if(nota < 70 && nota >= 60) {
			graducao = "C";
		}else if(nota < 60 && nota >= 0) {
			graducao = "D";
		}else {
			graducao = "";
		}
		
		switch (graducao) {
		case "A":
		case "B":
			System.out.println("Aluno aprovado!");
			break;
		case "C":
		case "D":
			System.out.println("Não aprovado!");
		default:
			System.out.println("Graduação inválida.");
			break;
		}
	}

}
