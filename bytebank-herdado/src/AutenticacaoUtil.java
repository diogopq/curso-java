
public class AutenticacaoUtil {

	private int senha;
	
	
	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Voce pode acessar");
			return true;
		}else {
			System.out.println("Voce nao pode acessar");
			return false;
		}
	
	}
	
}
