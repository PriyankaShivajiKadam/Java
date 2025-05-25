class RangeOfRotatingPrimeNumbers{

	public static void main(String args[])
	{

		for(int  start=1;start<=200;start++)
		{
			if(printingRotatingPrime(start))
			{
				System.out.println(start);
			}

		}

	}

	public static boolean printingRotatingPrime(int num)
	{
		int rot=num;
		if(isPrime(num))
		{
			
			do
			{
				rot=rotate(rot);
				if(isPrime(rot))
				{
				 continue;

				}
				else{
					return false;
				}

			}
			while(rot!=num);
			return true;
		}
		return false;

		
	}

	public static boolean isPrime(int num)
	{
		int den=2;
		while(den<num)
		{
			if(num%den==0)
			{
				return false;
			}
			den++;

		}
		return den==num;
	}




	public static int rotate(int num)
	{
		int last=num%10;
		num/=10;
		int ct=count(num);
		return last*power(10,ct)+num;
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
			num/=10;
			ct++;
		}
		return ct;
	}

}