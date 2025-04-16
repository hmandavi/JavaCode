package demo.miscellaneous;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int count = 0;
		for(int i = 2 ; i<num ; i++) {
			if(num % i == 0) {
				count++;
				break;
			}
		}
		
		if(count == 0)
			System.out.println("This is a Prime Number");
		else
			System.out.println("This is not a Prime Number");
		
		sc.close();		
	}

}
