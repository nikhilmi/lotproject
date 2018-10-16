package com.teamsankya.lotproject.utiltest;

import org.junit.Test;

import com.teamsankya.lotproject.util.LotUtil;

import junit.framework.TestCase;

public class LotUtilTest extends TestCase {

	@Test
	public void testtoUppercase() {
		LotUtil lotUtil = new LotUtil();
		String lotId = "2sqT34020.1";
		String upperCaseLotId = lotUtil.toUppercase(lotId);
		assertEquals(upperCaseLotId, lotId.toUpperCase());
	}
	
	@Test
	public void testcheckSpaceNegetive() {
		LotUtil lotUtil = new LotUtil();
		String lotId = "2SQT340 20.1";
		boolean check = lotUtil.checkSpace(lotId);
		assertEquals(check, false);
		lotId = "2SQT340 20.1";
		check = lotUtil.checkSpace(lotId);
		assertEquals(check, false);
	}
	
	@Test
	public void testtrim() {
		LotUtil lotUtil = new LotUtil();
		String lotId = "2SQT34020.1";
		String trim = lotUtil.trim(lotId);
		assertEquals(trim, lotId.trim());

	}
	
	@Test
	public void testvalidate() {
		LotUtil lotUtil = new LotUtil();
		String lotId = "   2SQT34020.1   ";
		String validate = lotUtil.validate(lotId);
		assertEquals(validate , "2SQT34020.1");

	}

}
