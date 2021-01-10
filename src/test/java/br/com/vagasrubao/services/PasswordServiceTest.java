package br.com.vagasrubao.services;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class PasswordServiceTest {

	public PasswordServiceTest() {
	}

	@Test
	public void CheckPasswordTest() {
//		fail("Not yet implemented");
		PasswordService passwordService = new PasswordService();

		assertFalse(passwordService.check(""));
		assertFalse(passwordService.check("aa"));
		assertFalse(passwordService.check("ab"));
		assertFalse(passwordService.check("AAAbbbCc"));
		assertFalse(passwordService.check("AbTp9!foo"));
		assertFalse(passwordService.check("AbTp9!foA"));
		assertFalse(passwordService.check("AbTp9f ok"));
		assertTrue(passwordService.check("AbTp9!fok"));
	}

}
