package com.tmn.phone.test;

import com.tmn.phone.service.impl.PhoneServiceImpl;

public class PhoneNumberTest {

	public static void main(String[] args) {
		PhoneServiceImpl impl = new PhoneServiceImpl();
		impl.getOperatorName("019557179");
	}
}
