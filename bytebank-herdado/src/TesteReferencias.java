
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente(); // mais generico na esquerda e mais especifico na direita -> desde que tenha herança
		g1.setNome("Marcos");
		g1.setSalario(5000);
		
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		
		
		String nome = g1.getNome();
		
		System.out.println(controle.getSoma());
		
		
	}
}
