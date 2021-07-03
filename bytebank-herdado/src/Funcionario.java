

//não pode instanciar objetos dessa classe porque do abstract
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	
	//metodo sem corpo = não ha implementação desse metodo aqui, mas nos filhos tem.
	public abstract double getBonifacao();
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	
}
