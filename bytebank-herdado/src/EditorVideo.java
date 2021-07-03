
public class EditorVideo extends Funcionario {

	public double getBonifacao() {
		System.out.println("Aqui tem a bonificacao do Editor");
		return super.getSalario() + 100;
	}
	
	
	
}