import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Transaction2 {
	
	public static void main(String[] args) {
		List<Transaction> transaction =Arrays.asList(
		new Transaction("Cotton",1998,350),
		new Transaction("Jute",2007,200),
		new Transaction("Coir",1994,210),
		new Transaction("Iron",2011,320),
		new Transaction("Steel",2011,250)
		);
		Optional<Object> c =transaction.stream()
		.max(Comparator.comparing(Transaction::getValue))
		.map(p->p.value);
		System.out.println(c);

		Optional<Object> c1 =transaction.stream()
		.min(Comparator.comparing(Transaction::getValue))
		.map(p->p.value);
		System.out.println(c1);

		List<String> c2 =transaction.stream()
		.map(p->p.toString())
		.collect(Collectors.toList());
		System.out.println(c2);
		
		List<String> c3 = transaction.stream()
		.filter(p->p.year == 2011)
		.sorted((o1,o2)->(o1.getValue()-o2.getValue()))
		.map(p->p.toString())
		.collect(Collectors.toList());
		System.out.println(c3);
		}
}


