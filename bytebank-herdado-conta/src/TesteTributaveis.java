
public class TesteTributaveis {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(1000);
		
		SeguroVida seguro = new SeguroVida();
		
		CalculadorImposto ci = new CalculadorImposto();
		
		ci.registra(cc);
		ci.registra(seguro);
		
		System.out.println(ci.getTotalImposto());
		
	}

}
