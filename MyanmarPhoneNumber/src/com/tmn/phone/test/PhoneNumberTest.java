package com.tmn.phone.test;

import com.tmn.phone.service.impl.PhoneServiceImpl;

public class PhoneNumberTest {

	public static void main(String[] args) {
		PhoneServiceImpl phNumber = new PhoneServiceImpl();
		phNumber.getOperatorName("09979599035");
	}
	
	
	public static boolean isStringEmpty(String input) {
		return (input == null || input.equals(""))? true :false;
	}
}
