package javaBasics;

public class PrintPattern {
	
	public static void main(String[] args) {
		//System.out.println(123+Integer.parseInt("100")+"100"+"abc");
		int i,j,row=6;
		for(i=0; i<row; i++) {
			for(j=0;j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}	
}