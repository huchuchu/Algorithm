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
		
		System.out.println("a�� �� : "); int a = val.nextInt();
		System.out.println("b�� �� : "); int b = val.nextInt();
		System.out.println("c�� �� : "); int c = val.nextInt();
		
		System.out.println("�߾Ӱ��� " + med3(a,b,c) + "�Դϴ�");
		
		
		
		
	}

}
