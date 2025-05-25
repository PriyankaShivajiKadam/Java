import java.util.Scanner;
class RangeOfPrime
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a start");
		int start=sc.nextInt();
		System.out.println("Enter a end");
		int end=sc.nextInt();

		rangeOfPrime(start,end);

	}
	public static void rangeOfPrime(int start,int end){
		while(start<end){

			if(isPrime(start)){
				System.out.println(start);

			}
			start++;
		}

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