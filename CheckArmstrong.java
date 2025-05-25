import java.util.Scanner;
class CheckArmstrong
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num :");
		int num=sc.nextInt();
        System.out.println(isArmstrong(num));

	}

	public static boolean isArmstrong(int num)
	{

       int sum=0;
       for(int i=num;i!=0;i/=10)
       {

          int ct=count(num);
          int digit=i%10;
           sum=sum+power(digit,ct);
       }
       return sum==num;



	}
	public static int power(int digit,int ct)
	{
		int pow=1;

        while(ct>0)
        {
        	pow*=digit;
        	ct--;
        }
        return pow;
	}
	public static int count(int num)
	{

		int ct=0;
		while(num>0){

			ct++;
			num/=10;


		}
		return ct;
	}
}