package Numbers;

import java.util.Scanner;

public class Reverse_A_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to be reversed");
		int num=sc.nextInt();
		
		int rem;
		int rev=0;
		while(num!=0)
		{
			rem=num%10;
			rev=((rev*10)+rem);
			num=num/10;
		}
		System.out.println("reverse is "+rev);
	}

}
