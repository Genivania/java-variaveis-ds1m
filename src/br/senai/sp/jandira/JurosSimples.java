package br.senai.sp.jandira;

import java.util.Scanner;

public class JurosSimples {

	public static void main(String[] args) {
	

		double juros, capital, taxa, tempo;
		Scanner leitor; 
		
		leitor = new Scanner(System.in); //captura o que o usuário escreveu, o SCANER é a "biblioteca".
		
		System.out.print("Qual é o capital? "); //emitir uma mensagem na tela para o usuário.
		capital = leitor.nextDouble(); //vai usar o leitor, esperando o usuario dar ENTER, depois vai ser guardado o que foi digitado pelo usuário.
		
		System.out.print("Qual é a taxa de juros? ");
		taxa = leitor.nextDouble(); 
		
		
		System.out.print("Qual é o tempo? ");
		tempo = leitor.nextDouble();
		
		juros = capital * taxa/100 * tempo;       //J=c.t.i
		
		System.out.println ("O valor do juros é: " + juros); // ou pode usar o System.out.printf ("O valor do juros é %s ", juros);
		
		System.out.printf("Ao final do período você terá R$%s ", capital+juros);
			
		
	
	}

}
