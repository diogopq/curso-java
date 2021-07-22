import java.util.ArrayList;
import static java.util.Comparator.comparing; //import static
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("Alura Online");
		palavras.add("Editora Casa do Código");
		palavras.add("Caelum");

		// Collections.sort(palavras, comparador);
		//palavras.sort((s1, s2) -> s1.length() - s2.length());
		
		palavras.sort(Comparator.comparing(s-> s.length()));
		palavras.sort(comparing(String::length)); // equivalente com a linha de cima
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		
		Comparator<String> comparador = Comparator.comparing(s -> s.length());
		palavras.sort(comparador);
		
		
		System.out.println(palavras);
		
		Consumer<String> impressor = System.out::println;
		palavras.forEach(impressor);

		palavras.forEach(t -> System.out.println(t)); // foreach com lambda

	}

	
	
}


