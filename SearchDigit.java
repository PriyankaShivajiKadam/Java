import java.util.Scanner;
class SearchDigit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num=sc.nextInt();
         System.out.println("Enter digit to search : ");

		int digit=sc.nextInt();
		isDigitPresent(num,digit);
	}

	public static void isDigitPresent(int digit,int num)
	{
        while(num>0)
        {
        	int d=num%10;
        	if(d==digit)
        	{
        		System.out.println("Digit is present");

        	}
        	else{
        		System.out.println("Digit is not spresent");

        	}
        	num/=10;
        }
        


	}
}