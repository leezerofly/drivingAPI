package com.driving.status;

/**
 * 状态的实体类
 * created by wk 2017-11-24
 */
public class StatusObject {

	private String code;	//状态码
	private String status;	//状态类型
	private String message;	//状态信息

	public StatusObject(String code, String status) {
		this.code = code;
		this.status = status;
	}

	public StatusObject(String code, String status, String message) {
		super();
		this.code = code;
		this.status = status;
		this.message = message;
	}

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
}
