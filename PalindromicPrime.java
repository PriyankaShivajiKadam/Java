import java.util.Scanner;
class PalindromicPrime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(isPalindrome(num) && isPrime(num))
		{
			System.out.println(num+" is Palindromic prime");
		}

	    else{
	    	System.out.println(num+" is Not Palindromic prime");

	    }

	}

	public static boolean isPalindrome(int num){
		int rev=0;
		for(int i=num;i!=0;i/=10){
			rev=rev*10+(i%10);

		}
		return rev==num;
	}
	public static boolean isPrime(int num){
		int den=2;
		while(den<num){
			if(num%den==0){
				return false;
			}
			den++;
		}
		return true;
	}
}