package com.teamsankya.lotproject.util;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * {@link ToStringBuilder} class reflectionToString static method
 * 
 * @author Yasar
 */
public class ToStringImpl {
	public static String toString(Object obj) {
		return ToStringBuilder.reflectionToString(obj);

	}

}
