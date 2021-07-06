package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

	// Arrays []
	public static void main(String[] args) {
		
		int[] idades = new int[5]; // inicializa o array com os valores padroes, no caso do tipo int = 0
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
			System.out.println(idades[i]); 
			
		}
		
		

	}

}
