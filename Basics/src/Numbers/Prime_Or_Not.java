package Numbers;

import java.util.Scanner;

public class Prime_Or_Not {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number for checking prime or not ");
	int num=sc.nextInt();
	int temp=0;
	for (int i=2;i<num;i++)
	{
		if (num%i==0)
		{
			temp=temp+1;
			break;
		}
	}
	if (temp==0)
		System.out.println(num+" is prime ");
	else 
		System.out.println(num+" is not prime");
}
}
