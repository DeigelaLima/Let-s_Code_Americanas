package br.com.letscode.java;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class StringsDatas {

	public static void main(String[] args) {
		
		//Olá, {nome}. Hoje é {dia-da-semana},BOM DIA.

//		String nome = "Deigela";
//		//Deixa as letras em maiuscula
//		System.out.println(nome.toUpperCase());
//		//Deixa em letra minuscula
//		System.out.println(nome.toLowerCase());
//		//Conta quantos caracteres tem na frase.
//		System.out.println(nome.length());
//		
//		String nomeOutro = "deigela";
//		//Comparando Strings
//		//equalsIgnoreCase não leva em consideração letra maiuscula e menuscula
//		System.out.println(nome.equalsIgnoreCase(nomeOutro));
		
		
		String nome = "Deigela";
		
		// Padrão mundial ISO 8601: Define como representar uma data de formato
		// padrão para o mundo inteiro.
		//Dessa forma consigo recuperar qual é o dia de hoje, então isso
		// representa uma data com as informações locais da regionalização.
		LocalDate hoje = LocalDate.now();
		//Data atual
		//System.out.println(hoje);
		//Dia da semana
//		System.out.println(hoje.getDayOfWeek());
		//Dia da semana em português
		Locale Brasil = new Locale("pt", "BR");// linguage e país
		//Exibe o dia da semana com a formatação: nome completo no formato do Brasil.
//		System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, Brasil));
		
		String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, Brasil);
		String saudacao;
		//Representação da hora atual
		LocalDateTime agora = LocalDateTime.now();
		
		if(agora.getHour() >= 0 && agora.getHour() < 12) {
			saudacao = "Bom Dia";
		}else if(agora.getHour() >= 12 && agora.getHour() < 18) {
			saudacao = "Boa Tarde";
		}else if(agora.getHour() >= 18 && agora.getHour() < 24) {
			saudacao ="Boa Noite";
		}else {
			//se por acaso surgir algum erro, ou seja, não entrar nas 
			//condições anteriores. Isso provavelmente não aconteça,
			//porque estamos recuperando a informação atravez do LocalDateTime.now().
			saudacao = "Olá!";
		}
		//Olá, {nome}. Hoje é {dia-da-semana},BOM DIA.
		System.out.printf("Olá, %s. Hoje é %s, %s. %n", nome, diaSemana, saudacao.toUpperCase());

	}

}
