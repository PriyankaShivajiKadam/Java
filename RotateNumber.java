class RotateNumber
{

	public static void main(String args[])
	{
		System.out.println(rotate(1234));

	}

	public static int rotate(int num)
	{
		int last=num%10;
		num/=10;
		int ct=count(num);
		return last*power(10,ct)+num;
	}
	public static int count(int num)
	{
		int ct=0;
		while(num>0)
		{
			num/=10;
			ct++;
		}
		return ct;
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
}