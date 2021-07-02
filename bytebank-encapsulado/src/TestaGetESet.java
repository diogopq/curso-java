
public class TestaGetESet {

	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		conta.setNumero(1337);
		conta.setNumero(-34);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		conta.setCliente(paulo); // conta.titular = paulo;
		paulo.setNome("Paulo");
		paulo.setCpf("222.222.222-22");
		paulo.setProfissao("Programador");
		System.out.println(paulo.getNome());
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setNome("Diogo");
		System.out.println(conta.getTitular().getNome());
		System.out.println(paulo.getNome());
		
		Cliente titularDaConta = new Cliente();
		titularDaConta = conta.getTitular();
		conta.getTitular().setNome("Patricia");
		
		System.out.println(titularDaConta.getNome());
		System.out.println(conta.getTitular().getNome());
		
		Cliente outroTitular = conta.getTitular();
		conta.getTitular().setNome("Pedro");
		
		System.out.println(outroTitular.getNome());
		System.out.println(conta.getTitular().getNome());
 		
	}
}
