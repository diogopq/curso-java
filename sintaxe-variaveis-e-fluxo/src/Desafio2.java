
public class Desafio2 {

	
	public static void main(String[] args) {
		int fatorial = 1;
		for(int n = 1; n<11 ; n++) {
			fatorial *= n;
			//fatorial = fatorial * n
			//exemplo 1 = 1 * 1 =1
			//exemplo 2 = 1 * 2 = 2 
			//exemplo 3 = 2 * 3 = 6
			System.out.println("Fatorial de " + n + " = " + fatorial);
		}
	}
}
