class PrimeandPower
{
	public static void main(String args[])
	{
		System.out.println(power(5,3));
		System.out.println(isprime(25));


	}
	public static int power(int base,int raise)
	{
		int pow=1;
		for(int i=0;i<raise;i++){
			pow=pow*base;

		}
		return pow;
	}
	public static boolean isprime(int num){
		int den=2;
		while(den<num){
			if(num%den==0) {
				return false;
			}
			den++;
		}
		return true;
	}
}