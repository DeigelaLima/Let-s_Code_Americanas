package br.com.letscode.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class StringsDatas2 {

	public static void main(String[] args) {
		
		String nome = "Deigela Lima";
		
		LocalDate hoje = LocalDate.now();
		Locale Brasil = new Locale("pt", "BR");
		
		String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, Brasil);
		String saudacao;
		LocalDateTime agora = LocalDateTime.now();
		
		if(agora.getHour() >= 0 && agora.getHour() < 12) {
			saudacao = "Bom Dia";
		}else if(agora.getHour() >= 12 && agora.getHour() < 18) {
			saudacao = "Boa Tarde";
		}else if(agora.getHour() >= 18 && agora.getHour() < 24) {
			saudacao ="Boa Noite";
		}else {
			saudacao = "Olá!";
		}
		//Olá, {nome}. Hoje é {dia-da-semana},BOM DIA.
		System.out.printf("Olá, %s. Hoje é %s, %s. %n", nome, diaSemana, saudacao.toUpperCase());
	}

}
