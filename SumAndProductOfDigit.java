import java.util.Scanner;
class SumAndProductOfDigit
{    
	public static void main(String args[])
	{

        Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num :");
		int num=sc.nextInt();
		System.out.println("Sum of digits of "+num +" is "+sumOfDigit(num));
		System.out.println("Product of digits of "+num +" is "+productOfDigit(num));
	}


	public static int sumOfDigit(int num)
	{  int sum=0;
		while(num>0)
		{
			
			sum=sum+(num%10);
			num/=10;

		}
		return sum;

	}
	public static int productOfDigit(int num)
	{
		int pro=1;
		while(num>0)
		{
			
			pro=pro*(num%10);
			num/=10;

		}
		return pro;

	}
}