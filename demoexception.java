import java.util.Scanner;
public class demoexception {

public static void main(String[] args) 
{
try (Scanner sc = new Scanner(System.in)) {
System.out.println(" Enter the first number:");
int i = sc.nextInt();
System.out.println(" Enter the second number:");
int j = sc.nextInt();
try {
int k = i / j;
System.out.println("answer = " + k);
} catch (ArithmeticException e)
    {
     System.out.println("Zero cannot divide any number");
    }
}
}
}