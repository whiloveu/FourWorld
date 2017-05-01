package com.wh.lib.util;

public class BaseResp<T> {
	
	private String ReturnMag;
	
	private T record;

	public String getReturnMag() {
		return ReturnMag;
	}

	public void setReturnMag(String returnMag) {
		ReturnMag = returnMag;
	}

	public T getRecord() {
		return record;
	}

	public void setRecord(T record) {
		this.record = record;
	}
	
	

}
