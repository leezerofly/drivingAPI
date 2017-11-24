package com.driving.status;

/**
 * 将状态封装成对象
 * created by wk on 2017-11-24
 */
public class AbstractJsonObject {

	private String code;	//状态码
	private String status;	//状态类型
	private String message;	//状态信息

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setStatusObject(StatusObject statusObject) {
		this.code = statusObject.getCode();
		this.status = statusObject.getStatus();
		this.message = statusObject.getMessage();
	}
}
