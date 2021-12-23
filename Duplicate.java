import java.util.HashSet;
public class Duplicate {
public static void main(String[] args)
{
HashSet<String> hashset = new HashSet<String>();
hashset.add("Apple");
hashset.add("Mango");
hashset.add("Grapes");
hashset.add("Orange");
hashset.add("Banana");
hashset.add("Apple");
hashset.add("Mango");
hashset.add("Banana");
System.out.println(hashset);
}
}
