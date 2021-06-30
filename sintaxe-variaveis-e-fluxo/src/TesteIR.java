
public class TesteIR {

	public static void main(String[] args) {
		
		double salario = 2801.0;

		if (salario > 1900 && salario <= 2800) {
			System.out.println("A Aliquota do Imposto de renda é de 7,5%");
			System.out.println("Você pode deduzir R$142,00");
		}else {
			if(salario > 2800 && salario <= 3751) {
				System.out.println("A Aliquota do Imposto de renda é de 15%");
				System.out.println("Você pode deduzir R$ 350");
			}else {
				System.out.println("A Aliquota do Imposto de renda é de 22.5%");
				System.out.println("Você pode deduzir R$ 636");
			}
		}
	}
}
