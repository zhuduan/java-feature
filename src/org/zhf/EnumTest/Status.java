package org.zhf.EnumTest;

public enum Status {
	
	NOT_FOUND_1(1,"not found 1"),
	NOT_FOUND_2(1,"not found 1"),
	NOT_ALLOWED(2,"not allowed");
	
	private int errorCode;
	private String errorInfo;
	
	Status(int code, String info){
		this.errorCode = code;
		this.errorInfo = info;
	}

	public int getErrorCode() {
		return errorCode;
	}
	
	public String getErrorInfo() {
		return errorInfo;
	}
	
	@Override
	public String toString(){
		return ("@"+this.errorCode+","+this.errorInfo);
	}
}
