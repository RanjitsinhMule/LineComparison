package com.bridgelabz;

import java.util.Scanner;

public class Linecomparison {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison");
		
				Scanner scan =new Scanner(System.in);
				System.out.println("Enter x1 value: ");
				int x1=scan.nextInt();
				System.out.println("Enter x2 value: ");
				int x2=scan.nextInt();
				System.out.println("Enter y1 value: ");
				int y1=scan.nextInt();
				System.out.println("Enter y2 value: ");
				int y2=scan.nextInt();
				int r= ((int)Math.pow((x2-x1), 2)+(int)Math.pow((y2-y1), 2));
				Double Length= Math.sqrt(r);
				System.out.println("Length of Line1 is: " + Length);

				System.out.println("Enter a1 value: ");
				int a1=scan.nextInt();
				System.out.println("Enter a2 value: ");
				int a2=scan.nextInt();
				System.out.println("Enter b1 value: ");
				int b1=scan.nextInt();
				System.out.println("Enter b2 value: ");
				int b2=scan.nextInt();
				int res= ((int)Math.pow((a2-a1), 2)+(int)Math.pow((b2-b1), 2));
				Double Length1= Math.sqrt(res);
				System.out.println("Length of Line2 is: " + Length1);
				
				if(Length==Length1) {
					System.out.println("Two lines are equal");
				}
				else {
					System.out.println("Two lines are not equal");
				}
				
				
				 int result = Length.compareTo(Length1);
				if(result > 0)
					System.out.println("Length of First end points is Greater than Length of Second end Points");
				else if(result < 0)
					System.out.println("Length of First end points is Less than Length of Second end Points");
				else
					System.out.println("Both lines are Equal");
		}
		
}
				



