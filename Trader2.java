import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Trader2 {
	public static void main(String[] args) {
		List<Trader> traders = Arrays.asList(
		new Trader("Jute","Hyderabad"),
		new Trader("Cotton","Pune"),
		new Trader("Textiles","Mumbai"),
		new Trader("Metal","Indore"),
		new Trader("Iron","Delhi"),
		new Trader("Steel","Chennai")
		);
		
		List<String> c1=traders.stream()
		.sorted((o1,o2) ->(o1.getCity().compareTo(o2.getCity())))
		.map(p->p.city)
		.collect(Collectors.toList());
		System.out.println(c1);
		
		List<String> c2=traders.stream()
		.filter(p->p.getCity().equals("Pune"))
		.map(p->p.toString())
		.collect(Collectors.toList());
		System.out.println(c2);
		
		List<String> c3=traders.stream()
		.sorted((o1,o2) ->(o1.getName().compareTo(o2.getName())))
		.map(p->p.toString())
		.collect(Collectors.toList());
		System.out.println(c3);
	
		List<String> c4=traders.stream()
		.filter(p->p.getCity().equals("Indore"))
		.map(p->p.toString())
		.collect(Collectors.toList());
		System.out.println(c4);
		}

}