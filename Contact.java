import java.util.*;
import java.util.Map.Entry;
import java.util.TreeMap;
public class Contact 
{
public static void main(String[] args){
Map<Long,Contact> values = new TreeMap<Long, Contact>().descendingMap();
@SuppressWarnings("deprecation")
Long l1 =new Long(834L);
@SuppressWarnings("deprecation")
Long l2 =new Long(854L);
@SuppressWarnings("deprecation")
Long l3 =new Long(814L);
Contact c1 = new Contact();
Contact c2 = new Contact();
Contact c3 = new Contact();
values.put(l1,c1);
values.put(l2,c2);
values.put(l3,c3);
Set<Entry<Long,Contact>> entrySet=values.entrySet();
for(Entry<Long,Contact>entry:entrySet)
{
  System.out.println(entry.getKey()+"::"+entry.getValue());//
}
}
}
