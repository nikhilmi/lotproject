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

			public String trim(String lotId) {
				String id = lotId.trim();
				return id;
			}

			public String validate(String lotId) {
				String s = trim(lotId);
				boolean res = checkSpace(s);
				if (res == false) {
					 throw new LotIdException("invalid lot id");
				}
				String finalRes = toUppercase(s);
				return finalRes;
			}
		}






