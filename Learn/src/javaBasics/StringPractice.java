package javaBasics;

public class StringPractice {
	
	public static void main(String[] args) {
		String xyz="abc10bcd78xyz499abc12abc";
		int Total = 0;
		for(int i=0; i<xyz.length(); i++) {
			String number="";
			Character ch = xyz.charAt(i);
			if(Character.isDigit(ch)) {
				number=number+ch;
				//System.out.println(number);
				for(int j=i+1; j<xyz.length(); j++) {
					Character ch2 = xyz.charAt(j);
					if(Character.isDigit(ch2)) {
						number=number+ch2;
						//System.out.println(number);
						i=j;
					}else {
						break;
					}
				}
			}if(!number.isEmpty()) {
				Total=Total+Integer.parseInt(number);
			}
		}System.out.println(Total);
	}
	
	



public void questions() {
	
	
	
}
	
	
}



