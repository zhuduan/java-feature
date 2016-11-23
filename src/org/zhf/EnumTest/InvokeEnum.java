package org.zhf.EnumTest;

public class InvokeEnum {

	public static void main(String[] args) {
		System.out.println(Status.NOT_ALLOWED.toString());
		
		Status ss = Status.NOT_FOUND_1;
		StatusCopy copy = StatusCopy.NOT_FOUND;
		switch(ss){
			case NOT_ALLOWED:
				System.out.println("Not Allowed");
				break;
			case NOT_FOUND_1:
				System.out.println("Not Found: " + ss.getErrorCode());
				break;
			default:
				System.out.println("bingo");
				break;
		}
		System.out.println("the copy code is " + copy.getErrorCode());
	}

}
