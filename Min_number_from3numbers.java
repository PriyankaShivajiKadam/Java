package assignment;

import java.util.Scanner;

public class Min_number_from3numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers :");
		float a,b,c;
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
		
		if(a<b&&a<c) {
			System.out.println(a+" is a minimum number");
			
		}
		else if(b<a&&b<c){
			System.out.println(b+" is a minimum number");
			
			
		}
		else {
			System.out.println(c+" is a minimum number");
			
		}
	}

}
