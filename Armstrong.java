
public class Armstrong {

	public static void main(String[] args) {
		int number=153,number2,remainder,result=0;
		number2=number;
		while(number2!=0)
		{
			remainder=number2%10;
			result+=Math.pow(remainder, 3);
			number2 /=10;
		}
     if(result == number)
    	 System.out.println(number + " is an Armstrong number");
     else
    	 System.out.println(number + " is not an Armstrong number");
	}

}
