package chap01;

import java.util.Scanner;

public class Gauss {
	
	public static void main(String[] args) {
		
		Scanner val = new Scanner(System.in);
		
	
		System.out.println("n : "); int n = val.nextInt();
		
		System.out.println("1����"+n+"������ ��");
		
		int sum = (1+n)*(n/2)+( n%2==1 ? (n+1)/2 : 0);
		
		System.out.println("���� : " + sum);
		
		
		
	}
	

}
