package chap01;

import java.util.Scanner;

public class Max3 {
	
	public static void main(String[] args) {

		Scanner val = new Scanner(System.in);
		
		
		System.out.println("�ִ밪 ���ϱ�!!");
		System.out.println("a ��  ��: "); int a = val.nextInt();
		System.out.println("b �� �� : "); int b = val.nextInt();
		System.out.println("c �� �� : "); int c = val.nextInt();
		
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		System.out.println("�ִ밪�� : " + max);
		
		
		
		
		
		
	}

}
