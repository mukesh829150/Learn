package javaBasics;

public class reverse {
	public static void main(String[] args) {
		String a="Welcome to opentext";
		
		  String[] split=a.split(" ");
		  String rev = "";
		  for(String abc : split) {
			  String reversed=reverseString(abc);
			  rev = rev+" "+reversed;
		  }
		  System.out.println(rev);
	}

	  private static String reverseString(String a) {
		  String b="";
		  for(int i=a.length()-1; i>=0; i--) {
			  b=b+a.charAt(i); 
		  }
		  return b;  
	  }

   public static void builderReverse() {
	   String a="abcde";
	   StringBuilder b = new StringBuilder(a);
	   b.reverse();
	   System.out.println(b);
	   reversed();
   }

   public static void reversed() {
	   String[] a = {"abcde"};
	   System.out.println(a[0]); }
  
}
 
