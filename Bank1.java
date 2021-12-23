public class Bank1 {

	public static void main(String[] args) {
		
		CurrentAccount c=new CurrentAccount();
		SavingAccount s=new SavingAccount();
		c.deposite(500.00);
		s.deposite(500.00);
        doWithdrawl(c);
        doWithdrawl(s);
        
	}
	public static void doWithdrawl(Bank acc)
	{
		boolean result=acc.Withdraw(1000.00);
		if(result)
		   {
			System.out.println("withdraw success");
			}
		else
			{
				System.out.println("withdraw fail");
			}
		
	}
	}