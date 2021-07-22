import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Curso {

	private String nome;
	private int alunos;
	
	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getAlunos() {
		return this.alunos;
	}
}

public class ExemploCursos{
	
	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
	
	
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		
//		cursos.stream()
//			.filter(c -> c.getAlunos() >= 50)
//			.forEach(c -> System.out.println(c.getNome()));; //utilizando o .stream()
//		cursos.stream()
//			.filter(c -> c.getAlunos() >= 100) //filtra todos os cursos que tem igual ou mais de 100 alunos
//			.map(c -> c.getAlunos()) // pegando a quantidade de alunos de cada curso
//			.forEach(System.out::println);; // percorrendo os resultados
//			
//		OptionalDouble media = cursos.stream() // <- Jogou para uma variavel int através do ctrl + 1 do Eclipse.
//				.filter(c -> c.getAlunos() >= 100) // filtra todos os cursos que tem 100 ou mais alunos
//				.mapToInt(c -> c.getAlunos()) // pegando a quantidade de alunos de cada curso e transformando em Inteiros.
//				.average(); 
//		
//		System.out.println(media.getAsDouble());
//		
//		Stream<String> nomes = cursos.stream().map(Curso::getNome);
//		nomes.forEach(c -> System.out.println(c));
//		
//		cursos.stream()
//			.filter(c -> c.getAlunos() >=1000)
//			.findAny()
//			.ifPresent(c -> System.out.println(c.getNome()));
		
		//cursos = cursos.stream().filter(c -> c.getAlunos() >= 100).collect(Collectors.toList()); //.collect(Collectors.toList() -> transforma em lista para poder assumir o local da List cursos
		cursos.stream().filter(c -> c.getAlunos() >= 100).collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos())).forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));;
		
	
				
		cursos.forEach(s -> System.out.println(s.getNome() + " , " + s.getAlunos()));
		
		Optional<Curso> findFirst = cursos.stream().filter(c -> c.getAlunos() >50).findFirst();
		System.out.println(findFirst.get().getNome());
		
		OptionalDouble average = cursos.stream().mapToDouble(c -> c.getAlunos()).average();
		System.out.println("A média de todos os alunos do curso é: " + average.getAsDouble());
		
		Stream<Curso> stream = cursos.stream().filter(c -> c.getAlunos() > 50);
		
		List<Curso>stream2 = stream.collect(Collectors.toList());
		System.out.println(stream2.get(0).getNome());
		
		
		
	}
	
	
}
