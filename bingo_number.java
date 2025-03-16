package assignment;

import java.util.Scanner;

public class bingo_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number=");
       int num=sc.nextInt();
       boolean flag=true;
       
       if(num%7!=0) {
    	   flag=false;
       }
       while(num>0) {
		   if(num%10==7) {
			  flag=false;
			   break;
		   }
		  
		   
		   num/=10;
	   }
       
       if(flag==true) {
    	   System.out.println("Number is  bingo number");
       }
       else {
    	   System.out.println("Number is not bingo number");
       }
       
	}

}
