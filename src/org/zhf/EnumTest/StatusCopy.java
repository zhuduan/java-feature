package org.zhf.EnumTest;

public enum StatusCopy {

	NOT_FOUND(3,"not copy"),
	NOT_ALLOWED(4,"not copy");
	
	private int errorCode;
	private String errorInfo;
	
	StatusCopy(int code, String info){
		this.errorCode = code;
		this.errorInfo = info;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}
	
}
