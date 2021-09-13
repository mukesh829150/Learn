package javaBasics;

import interviewPrograms.StringOutput;

public class AccessModifiers extends StringOutput{
	
	StaticBlocks a = new StaticBlocks();
	StringOutput b = new StringOutput();
	
	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers(1);
	}
	
	private AccessModifiers() {
		
	}
	
	private AccessModifiers(int a) {
		System.out.println(a);
	}
	
	void access(){
		methodPrtd();
		mtdDefaultupdatedtpPrtd();
		a.methodPrtd();
		a.mtdDefault();
	}

}
