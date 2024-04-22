package com.goldenplanet.license.authenticator;

public enum ErrorCode {
	MAC_ADDRESS_MISMATCH("MAC address does not match."),
	EXPIRED("The license has expired."),
	SOLUTION_CODE_MISMATCH("Solution code does not match."),
	MAC_ADDRESS_CANNOT_READ("Mac address can't read");

	private String errorMessage;

	ErrorCode(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
}
