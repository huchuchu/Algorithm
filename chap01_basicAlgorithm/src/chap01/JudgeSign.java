package chap01;

import java.util.Scanner;

public class JudgeSign {

	
	public static void main(String[] args) {
		
		Scanner val = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���");
		int a = val.nextInt();
		
		if (a>0) {
			System.out.println("����Դϴ�");
		}else if (a<0) {
			System.out.println("�����Դϴ�");
		}else {
			System.out.println("0�Դϴ�");
		}
		
		
	}
	
}
