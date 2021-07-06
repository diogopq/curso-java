package br.com.bytebank.banco.teste;

public class TesteString  {

	public static void main(String[] args) {
		
		
		String nome = "Alura"; // object literal
		StringBuilder diogo = new StringBuilder();
		
		
		
		
		diogo.append("Diogo");
		diogo.append("Jannuzzi");
		
		System.out.println(diogo);
		System.out.println(diogo.reverse());
		
		nome = nome.replace("A", "a");
		nome = nome.toLowerCase();
		char c = nome.charAt(2);
		int t = nome.indexOf("ur");
		String sub = nome.substring(1);
		System.out.println(sub);
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length();i++) {
			//System.out.println(i);
			char q = nome.charAt(i);
			System.out.println(q);
		}
		String nomeEspaco = "  Diogo Jannuzzi     ";
		System.out.println(nomeEspaco);
		System.out.println(nomeEspaco.trim());
		System.out.println(nome);
		System.out.println(c);
		System.out.println(t);
	}

}
