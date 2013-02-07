package com.valtech.devoxx.tddgame.wecodeinpeace.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class JavaltechianServiceTest {

	JavaltechianService service = new JavaltechianService();
	
	@Test
	public void testGivePowerByName() {
		assertEquals(14,service.givePowerByName("totovoxx"));	
	}

	@Test
	public void testGiveAgeByName() throws Exception {
		assertEquals(12,service.givePowerByName("totovoxx"));
	}

	@Test
	public void testGiveNumberOfEyesByName()
		throws Exception {
	
	}

}


