package com.tmn.phone.service.impl;

import com.tmn.phone.service.PhoneService;
import com.tmn.phone.utility.PhoneOperator;

public class PhoneServiceImpl implements PhoneService {

	@Override
	public boolean isMyanmarPhoneNumber(String phone_no) {
		return (phone_no != null) ? phone_no.matches(MM_PHONE_NUMBER) : false;
	}

	@Override
	public String getOperatorName(String phone_no) {
		if (phone_no == null) {
			throw new NullPointerException();
		}
		String operatorName = UNKNOWN;
		if (isMyanmarPhoneNumber(phone_no)) {
			for (PhoneOperator operator : PhoneOperator.values()) {
				if (phone_no.matches(operator.getRegex())) {
					operatorName = operator.getName();
					break;
				}
			}
		}
		System.out.println(operatorName);
		return operatorName;
	}

}
