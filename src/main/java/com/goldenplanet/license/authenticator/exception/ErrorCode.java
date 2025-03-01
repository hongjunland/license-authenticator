package com.goldenplanet.license.authenticator.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {
	INVALID("It is a invalid key"),
	MAC_ADDRESS_MISMATCH("MAC address does not match."),
	EXPIRED("The license has expired."),
	SOLUTION_CODE_MISMATCH("Solution code does not match."),
	MAC_ADDRESS_CANNOT_READ("Mac address can't read");

	private final String errorMessage;

	ErrorCode(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
