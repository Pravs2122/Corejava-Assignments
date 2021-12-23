import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		String username;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username :");
		username=sc.nextLine();
		System.out.println("Entered username :"+username);
		int c=3;
		while(true)
		{
			System.out.println("Enter your Password :");
			String ps=sc.nextLine();
			System.out.println("Password :"+ps);
			if(ps.compareTo("Pravallika")==0)
			{
				System.out.println("Welcome " +username);
				break;
			}
			else
			{
				c--;
				if(c==0)
				{
					System.out.println("Contact admin");
					break;
				}
				System.out.println("Wrong. Password attempts remaining :" +c);
			}
		}
	}
}
