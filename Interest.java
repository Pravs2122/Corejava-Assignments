import java.util.*;
public class Interest {

	public static void main(String[] args) {
		double amount,rate,sim,com,year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount:");
		amount=sc.nextDouble();
		System.out.println("Enter the number of years:");
		year=sc.nextDouble();
		System.out.println("Enter the rate of interest:");
		rate=sc.nextDouble();
		sim=(amount*year*rate)/100;
		com=amount*Math.pow(1.0+rate/100.0,year)-amount;
		System.out.println("Simple Interest="+sim);
		System.out.println("Compound Interest="+com);
	}
}
