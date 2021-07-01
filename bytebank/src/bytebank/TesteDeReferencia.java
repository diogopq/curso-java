package bytebank;

public class TesteDeReferencia {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira : " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("O saldo da segunda : " + segundaConta.saldo);
	
		segundaConta.saldo += 100;
		
		System.out.println("O saldo da primeira agora : " + primeiraConta.saldo);
		System.out.println("O saldo agora da segunda : " + segundaConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("Sao a mesma conta");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
	

}
