
public class nArmstrong {

	public static void main(String[] args) {
		int low=100,high=999,number2;
		for(int number=low+1;number<high;++number)
		{
			int digits=0,result=0;
			number2 = number;
			while(number2 !=0)
			{
				number2/=10;
				++digits;
			}
			number2=number;
			while(number2 !=0)
			{
				int remainder=number2%10;
				result+=Math.pow(remainder,digits);
				number2 /= 10;
			}
			if(result == number)
			{
				System.out.print(number + " ");
			}
		}
	}
}
