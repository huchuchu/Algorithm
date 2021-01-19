package chap01;

import java.util.Scanner;

public class JudgeSign {

	
	public static void main(String[] args) {
		
		Scanner val = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int a = val.nextInt();
		
		if (a>0) {
			System.out.println("양수입니다");
		}else if (a<0) {
			System.out.println("음수입니다");
		}else {
			System.out.println("0입니다");
		}
		
		
	}
	
}
