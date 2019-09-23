package com.neu.entity;

public class RespBean {
	private String status = "success";
	private String msg;
	private Admin admin;
	
	public RespBean(String msg, Admin admin) {
		super();
		this.msg = msg;
		this.admin = admin;
	}
	public RespBean(String status, String msg) {
		super();
		this.status = status;
		this.msg = msg;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin=admin;
	}
	public RespBean(String status, String msg, Admin admin) {
		super();
		this.status = status;
		this.msg = msg;
		this.admin=admin;
	}
	public RespBean() {
		super();
	}
	@Override
	public String toString() {
		return "RespBean [status=" + status + ", msg=" + msg + ", user=" + admin + "]";
	}
	
	
}
