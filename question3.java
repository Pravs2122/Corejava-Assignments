import java.util.*;
public class question3 {
public static void main(String[] args) {
String s1,s2;
List<Integer> list=new ArrayList<Integer>();
list.add(1);
list.add(2); Iterator<Integer> itr=list.iterator();
while(itr.hasNext()){
System.out.println(itr.next()+" ");
}
System.out.println("After exchanging the positions ");
Collections.swap(list, 0 , 1);
System.out.print(" "+list); } }

