package chap01;

import java.util.Scanner;

public class Median {
	
	
	static int med3 (int a, int b, int c){
	 
		if (a >= b) {
			if ( b >= c) {
				return b;
			}else if ( c >= a) {
				return a;
			}else {
				return c;
			}
		}else if (a > c) {
			return a;
		}else if (b < c) {
			return b;
		}else {
			return c;
		}
		

	}
	
	public static void main(String[] args) {
		
		Scanner val = new Scanner(System.in);
		
		System.out.println("a의 값 : "); int a = val.nextInt();
		System.out.println("b의 값 : "); int b = val.nextInt();
		System.out.println("c의 값 : "); int c = val.nextInt();
		
		System.out.println("중앙값은 " + med3(a,b,c) + "입니다");
		
		
		
		
	}

}
