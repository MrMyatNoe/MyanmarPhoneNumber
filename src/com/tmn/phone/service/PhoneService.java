package com.tmn.phone.service;

public interface PhoneService {

	public final String UNKNOWN = "unknown";
	public final String MM_PHONE_NUMBER = "(?:^|\\W)([+]95)?[0]?\\d{7,12}(?:$|\\W)";

	boolean isMyanmarPhoneNumber(String phone_no);

	String getOperatorName(String phone_no);
}
