
package br.com.controller;

import br.com.view.JCadClienteView;
import java.util.ArrayList;


public class validaDados {

String nome;
long numeroUltimaContaCriada;
long numeroUltimaAgenciaCriada;




public static boolean ehTexto(String nome) { 
	if (! nome.matches("[a-zA-Z\\s]*")) {
		return false;
	}
	return true;
}

public static String filtraDigitos(String cpf) {
	String cpfFiltrado = "";
	for (int i=0; i < cpf.length(); i++ ) {
		char car = cpf.charAt(i);
		if (  Character.isDigit(car) )
			cpfFiltrado += car;
	}
	return cpfFiltrado;
}


public boolean existeCPF(String cpf) {
	String cpfFiltrado = filtraDigitos(cpf);
	long cpfComoLong = Long.parseLong(cpfFiltrado); 
	boolean cpfVerifica = verDigitoValidador(cpfComoLong, 2);
	if (cpfVerifica)
		return true;
	else
		return false;
}

private boolean verDigitoValidador(long sequencia, int qte) {
	long  sequenciaTeste;
	int multiplier = 1;
	for(int i=1; i<=qte; i++)
		multiplier *= 10;
	sequenciaTeste = sequencia / multiplier;
	for(int i=1; i<=qte; i++)
		sequenciaTeste = calculaDV_ALL(sequenciaTeste);
	return (sequenciaTeste == sequencia);
}

private long calculaDV_ALL(long sequenciaSemDV) {
	int mult = 2;
	int soma = 0;
	long sequencia = sequenciaSemDV;
	while (sequenciaSemDV > 0) {
		soma += mult * (sequenciaSemDV % 10);
		sequenciaSemDV = sequenciaSemDV / 10;
		mult++;
	}
	int dv = 11 - (soma % 11);
	if (dv > 9)
		dv = 0;
	return sequencia * 10 + dv;
}

			
}