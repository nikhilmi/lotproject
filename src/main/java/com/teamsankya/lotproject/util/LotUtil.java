package com.teamsankya.lotproject.util;

import com.teamsankya.lotproject.exception.LotIdException;

public class LotUtil {
	public String toUppercase(String lotId) {
		String id = lotId.toUpperCase();
		return id;
	}

	public boolean checkSpace(String lotId) {

		char ch[] = lotId.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				return false;

			}
		}

		return true;

	}

	public boolean splCharValidate(String lotId) {
		char ch[] = lotId.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int a = ch[i];
			if (a == 45 || (a >= 97 && a <= 122) || (a >= 65 && a <= 90) || a == 46 || (a >= 48 && a <= 57)) {

			} else {
				return false;
			}

		}
		return true;

	}

	public String trim(String lotId) {
		String id = lotId.trim();
		return id;
	}

	public boolean noOfChar(String lotId) {

		char ch[] = lotId.toCharArray();
		if (ch.length >= 30) {
			return false;

		}
		return true;

	}

	public String validate(String lotId) {
		String s = trim(lotId);
		boolean res = checkSpace(s);
		if (res == false) {
			throw new LotIdException("syntex error in lot id");
		}
		boolean isValid = splCharValidate(s);
		if (isValid == false) {
			throw new LotIdException("syntex error in lot id");
		}
		boolean noOfChar = noOfChar(s);
		if (noOfChar == false) {
			throw new LotIdException("syntex error in lot id");
		}
		String finalRes = toUppercase(s);
		return finalRes;
	}

	/**
	 * This method will accept a String lotId and will return String lotId. It will
	 * remove the extra spaces after and before the String. After removing extra
	 * space it will convert the string to Uppercase. It will then return the String
	 * value to LotServiceImpl class.
	 * 
	 * @return String
	 * @param String
	 * 
	 * @author Samarpita Das
	 */
	public String toValidate(String lotId) {

		String s = trim(lotId);
		System.out.println("inside to validate");
		System.out.println(s);
		String finalRes = toUppercase(s);
		System.out.println(finalRes);
		return finalRes;

	}

	/**
	 * This method will accept a String lotId and will return result in boolean. It
	 * will check for all the conditions lotid should satisfy. It will then return
	 * boolean result to LotServiceImpl class.
	 * 
	 * @return boolean
	 * @param String
	 * 
	 * @author Samarpita Das
	 */
	public boolean validateAll(String lotId) {
		boolean res = checkSpace(lotId);
		boolean isValid = splCharValidate(lotId);
		boolean noOfChar = noOfChar(lotId);
		if (res == true && isValid == true && noOfChar == true) {
			return true;
		}

		return false;
	}
}
