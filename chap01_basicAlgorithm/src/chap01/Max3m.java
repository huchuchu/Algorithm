package chap01;

public class Max3m {
	
	public static int max3(int a, int b, int c){

		int max = a;
		
		if ( b > max ) max = b;
		if ( c > max ) max = c;		
		
		return max;
		
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("a = 1, b = 3, c = 5 중 최대값은 " + max3(1,3,5));
		
		
	}
	
	
	
	
}
