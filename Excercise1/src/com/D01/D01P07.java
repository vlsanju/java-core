package com.D01;
 
import java.util.Scanner;
 
public class D01P07 {

	public static void main(String[] args) {
		//int percentage = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the percentage to check the grade");
		int grade = sc.nextInt();
		if( grade >= 60) {
			System.out.println("Grade A");
		}
		else if (grade >= 45) {
			System.out.println("Grade B");
		}
		else if (grade >=35) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Fail");
		}
		sc.close();
	}

}


