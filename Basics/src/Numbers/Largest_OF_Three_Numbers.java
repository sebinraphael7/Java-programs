package Numbers;

import java.util.Scanner;

public class Largest_OF_Three_Numbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		int big=num1;
		if (num2>big)
			big=num2;
		if(num3>big)
			big=num3;
		System.out.println("biggest of 3 numbers is "+ big);
		
	}

}
