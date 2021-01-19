package chap01;

import java.util.Scanner;

public class SumAB {
	
	
public static void main(String[] args) {
	
	Scanner val = new Scanner(System.in);
	
	System.out.println("a : "); int a = val.nextInt();
	System.out.println("b : "); int b = val.nextInt();
	
	System.out.println(a +", " + b +"의  합을 구하자 ");
	
	//절대값??
	
	int sum = (a+b) * (( Math.abs(a-b) + 1)/2)+ ((Math.abs(a-b)+1) %2 == 1 ? (a+b)/2 : 0 ) ;
	
	System.out.println("합 : " + sum);
			
//	System.out.println( (a+b) * (( Math.abs(a-b) + 1)/2) );
	
	
}
	
	
	
	
	
	

}
