import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Datas {

	
	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadas = LocalDate.of(2099, Month.JANUARY, 25);
		
		int anos = olimpiadas.getYear() - hoje.getYear();
		
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, olimpiadas);
		System.out.println(periodo.getDays());
		
//		Duration horas = Duration.between(hoje, olimpiadas);
//		System.out.println(horas);
		
		LocalDate plusYears = olimpiadas.plusYears(4);
		System.out.println(plusYears);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String valorFormatado = plusYears.format(formatador);
		System.out.println(valorFormatado);
		
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		
		System.out.println(agora.format(formatadorComHoras));
		
		
	}
}
