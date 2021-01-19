package chap01;

import java.util.Scanner;

public class SumWhile {
	

	public static void main(String[] args) {
		
		Scanner val = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 값을 구합니다 ");
		System.out.println("n의 값: ");
		int n = val.nextInt();
		int sum = 0;
		int i = 1;
		
		while (i<=n) {
			
			sum += i;
			System.out.println("i : " +i+ "sum : " + sum);
			i++;
		}
		
		
		System.out.println(" 합은 " + sum +"입니다");
		
		
		
		
		
	}

}
