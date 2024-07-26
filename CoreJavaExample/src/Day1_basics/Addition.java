package Day1_basics;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Trainer name:");
		String name = sc.nextLine();
		
		c = a+b;
		System.out.println("Addition of a ="+a+" and b ="+b+" is "+c);
        System.out.print("Tech trainer:"+ name);
	}

}
