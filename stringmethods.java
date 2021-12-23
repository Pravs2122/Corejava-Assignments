package stringassignment;

public class stringmethods {

	public static void main(String[] args) {
		String str1="Java String pool refers to collection of Strings which are stored in heap memory";
		String str2="java string pool refers to collection of strings which are stored in heap memory";	
		
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		String s=str1.replace('A', '$');
		System.out.println("str1 is :" +str1);
		
		if (str1.contains("collection"))
		{
			System.out.println("The word collection contains in the string");
		}
       
		if(str1==str2)
        {
        	System.out.println("str1 matches str2");
        }
        else
        {
        	System.out.println("str1 does not match with str2");
        }
        
		String str3=new String("Java String pool refers to collection of Strings which are stored in heap memory");
        String str4=new String("java string pool refers to collection of strings which are stored in heap memory");
       
        if(str3.equals (str4))
        {
        	System.out.println("str3 equals str4");
        }
        else
        {
        	System.out.println("str3 not equal to str4");
        }
       
       /* if(str3.compareTo(str4) == 0)
        {
        	System.out.println("str3 equals str4");
        }
        else
        {
        	System.out.println("str3 not equal to str4");
        }*/
	}
	
}
