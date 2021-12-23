import java.util.ArrayList;
import java.util.function.UnaryOperator;
class Op implements UnaryOperator<String> {
public String apply(String str) {
return str.toUpperCase();
}
}
public class Question6 {
public static void main(String[] args) throws CloneNotSupportedException {
ArrayList<String> list = new ArrayList<>();
list.add("Pravallika");
list.add("Praveen");
list.add("AbhayRam");
list.add("Jashith");
list.add("Vedanshi");
System.out.println("Contents of the list: "+list);
list.replaceAll(new Op());
System.out.println("Contents of the list after replace operation: \n"+list);
}
}

