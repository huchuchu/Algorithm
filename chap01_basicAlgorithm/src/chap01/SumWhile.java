package chap01;

import java.util.Scanner;

public class SumWhile {
	

	public static void main(String[] args) {
		
		Scanner val = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ� ");
		System.out.println("n�� ��: ");
		int n = val.nextInt();
		int sum = 0;
		int i = 1;
		
		while (i<=n) {
			
			sum += i;
			System.out.println("i : " +i+ "sum : " + sum);
			i++;
		}
		
		
		System.out.println(" ���� " + sum +"�Դϴ�");
		
		
		
		
		
	}

}
