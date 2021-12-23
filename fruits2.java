import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class fruits2 {
           
	public static void main(String[] args) {
		List<Fruits> fruits= Arrays.asList(
				new Fruits("apple",40,60,"red"),
				new Fruits("banna",79,80,"yellow"),
				new Fruits("mango",70,60,"yellow"),
				new Fruits("orange",50,70,"orange"),
				new Fruits("grapes",60,50,"green"),
				new Fruits("guva",30,40,"green")
				);
		
		Collections.sort(fruits,(o1,o2)->(o2.getCalories()-o1.getCalories()));
		
		Collections.sort(fruits,(o1,o2)->(o1.getPrice()-o2.getPrice()));
		fruits.stream()
		.forEach(p ->System.out.println(p.toString()));
		//descending order of calories
		List<Integer> c=fruits.stream()
		.filter(p->p.calories<100)
		.sorted((o1,o2)->(o2.getCalories()-o1.getCalories()))
		.map(p->p.calories)
		.collect(Collectors.toList());
		System.out.println(c);
		//displaying colorwise
		List<String> c1 = fruits.stream()
		.sorted((o1,o2) ->(o1.getColor().compareTo(o2.getColor())))
		.map(p->p.color)
		.collect(Collectors.toList());
		System.out.println(c1);
		//display red color fruit price ascending order
		List<String> c2 = fruits.stream()
		.filter(p->p.getColor().equals("red"))
		.sorted((o1,o2) ->(o1.getColor().compareTo(o2.getColor())))
		.map(p->p.color)
		.collect(Collectors.toList());
		System.out.println(c2);
	}
}