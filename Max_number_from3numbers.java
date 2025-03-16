package assignment;

import java.util.Scanner;

public class Max_number_from3numbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers :");
		float a,b,c;
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=sc.nextFloat();
		
		if(a>b&&a>c) {
			System.out.println(a+" is a greater number");
			
		}
		else if(b>a&&b>c){
			System.out.println(b+" is a greater number");
			
			
		}
		else {
			System.out.println(c+" is a greater number");
			
		}
		
		
	}

}
