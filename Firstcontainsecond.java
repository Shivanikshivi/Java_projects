package basics;

import java.util.Scanner;

public class Firstcontainsecond {

	public static void main(String[] args) {
		String a,b;
		System.out.println("Enter string 1:");
		Scanner sc1 = new Scanner(System.in);
		a=sc1.nextLine();
		System.out.println("Enter string 2:");
		Scanner sc2 = new Scanner(System.in);
		b=sc1.nextLine();
		if(a.equals(b))
		{
			System.out.println("Strings are same");
		}
		else
		{
			System.out.println("Strings are not same");
		}
	}
}







	


