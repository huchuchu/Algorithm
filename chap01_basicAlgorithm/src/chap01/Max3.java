package chap01;

import java.util.Scanner;

public class Max3 {
	
	public static void main(String[] args) {

		Scanner val = new Scanner(System.in);
		
		
		System.out.println("최대값 구하기!!");
		System.out.println("a 의  값: "); int a = val.nextInt();
		System.out.println("b 의 값 : "); int b = val.nextInt();
		System.out.println("c 의 값 : "); int c = val.nextInt();
		
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		System.out.println("최대값은 : " + max);
		
		
		
		
		
		
	}

}
