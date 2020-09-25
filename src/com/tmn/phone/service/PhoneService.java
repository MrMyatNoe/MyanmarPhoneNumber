package com.tmn.phone.service;

public interface PhoneService {

	public final String UNKNOWN = "unknown";
	public final String MM_PHONE_NUMBER = "^((09|\\+?950?9|\\+?95950?9)\\d{7,9})$";

	boolean isMyanmarPhoneNumber(String phone_no);

	String getOperatorName(String phone_no);
}
