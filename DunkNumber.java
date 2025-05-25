import java.util.Scanner;
class DunkNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num=sc.nextInt();
         System.out.println(isDunk(num));

	}


	public static boolean isDunk(int num)
	{

		while(num>0){

			if(num%10==0){
				return true;
			}

			num/=10;
		}
		return false;
	}
}