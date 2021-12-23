import java.util.Scanner;

public class Incometax {

	public static void main(String[] args) {
		double tax=0,IT;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter income :");
		int income=sc.nextInt();
		if(income<180000)
		{
			System.out.println("No tax");
		}
		else if((income>=180000)&&(income<300000))
		{
			tax=income*(0.01);
			System.out.println("Income tax :"+tax);
		}
		else if((income>=300001)&&(income<500000))
		{
			tax=income*(0.02);
			System.out.println("Income tax :"+tax);
		}
		else if((income>=500001)&&(income<1000000))
		{
			tax=income*(0.03);
			System.out.println("Income tax :"+tax);
		}
		
	}

}
