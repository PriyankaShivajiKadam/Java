import java.util.Scanner;
class StrongNumber
{
	public static void main(String args[])
	{
       Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num :");
		int num=sc.nextInt();
       System.out.println(isStrong(num));

	}


	public static boolean isStrong(int num)
	{
		int sum=0;
		for(int i=num;i!=0;i/=10){

             int last=i%10;
             sum=sum+factorial(last);
         }
         return sum==num;

	}
	

	public static int factorial(int digit){


		int fact=1;
		while(digit>0)
		{
			fact*=digit;
			digit--;

		}
		return fact;
	}


}