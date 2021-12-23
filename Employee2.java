import java.util.Scanner;

public class Employee2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("press 1 to 2 for the details");
		int s=sc.nextInt();
		
		
		switch(s)
		{
		case 1:
		{
			Manager m=new Manager();
			m.basic=35000;
			m.GrossSalary();
			m.NetSalary();
			m.TaxPay();
			m.TotalPay();
			m.display();
			break;
		}
		case 2:
		{
			Labour l=new Labour();
			l.basic=35000;
			l.GrossSalary();
			l.NetSalary();
			l.TaxPay();
			l.OvertimePay();
			l.TaxPay();
			l.display();
			break;
		}

	}

	}
}