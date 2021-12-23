import java.util.HashMap;
public class Randomvalue {
public static void main(String[]args) {

HashMap<Integer, Double> Map = new HashMap<Integer, Double>();

Map.put(1, 100.0);
Map.put(2, 200.0);
Map.put(3, 300.0);
Map.put(4, 400.0);
Map.put(5, 500.0);
Map.put(6, 600.0);
Map.put(7, 700.0);
Map.put(8, 800.0);
Map.put(9, 900.0);
Map.put(10, 1000.0);

System.out.println("Iterating Hashmap......");
for(java.util.Map.Entry m :  Map.entrySet()) {
System.out.println(m.getKey()+ "" +m.getValue());
}
}
}