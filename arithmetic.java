import java.util.Scanner;

public class arithmetic {
public static void main(String[] args) {
	int a,b,add,subtract,multiply;
	float divide;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers :");
	a=sc.nextInt();
	b=sc.nextInt();
	add=a+b;
	subtract=a-b;
	multiply=a*b;
	divide=(float)a/b;
	System.out.println("Sum of two numbers="+add);
	System.out.println("Subtraction of two numbers="+subtract);
	System.out.println("Multiplication of two numbers="+multiply);
	System.out.println("Division of two numbers="+divide);
}
}
