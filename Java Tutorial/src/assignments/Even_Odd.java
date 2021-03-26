package assignments;

import java.util.Scanner;
//program to find even and odd numbers
public class Even_Odd {
	public static void main(String[]args) {
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of the elements you want in array");//6
		number=sc.nextInt();
		int[]a=new int[number];
		System.out.println("enter the elements");//2,3,4,5,6,7.
		for(int iteration=0;iteration<number;iteration++) {
			a[iteration]=sc.nextInt();
		}
		sc.close();
		System.out.println("odd numbers:");
		for(int iteration=0; iteration<number; iteration++) {
			if(a[iteration]%2!=0) {
				System.out.println(a[iteration]);
			}
		}
		System.out.println("even numbers");
		for(int iteration=0; iteration<number; iteration++) {
			if(a[iteration]%2==0) {
				System.out.println(a[iteration]);
			}
		}
	}

}
