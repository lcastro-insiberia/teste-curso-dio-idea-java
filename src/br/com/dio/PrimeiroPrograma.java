package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
	
		Gato gato = new Gato(); //é preciso importar a classe Gato
		livros livros = new livros (); // nova variavel é criada sem necessidade de importação 
       
		System.out.println(gato);
		System.out.println(livros);
		
		/*int a = 2;
       int b = 3;
		System.out.println("Hello World! " + (a+b));*/
	}
		
}

class livros {
	private String name; //essa clase esta fora do aquivo br.com.dio portanto não é necessario importar 
	private String npag; //
	
}