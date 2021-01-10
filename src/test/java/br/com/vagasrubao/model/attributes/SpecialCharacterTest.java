package br.com.vagasrubao.model.attributes;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.vagasrubao.interfaces.Checker;
import br.com.vagasrubao.interfaces.PasswordAtrribute;
import br.com.vagasrubao.utils.PasswordChecker;

public class SpecialCharacterTest {

	public SpecialCharacterTest() {
	}

	@Test
	public void test() {
		List<PasswordAtrribute> attributes = new ArrayList<PasswordAtrribute>();
		attributes.add(new SpecialCharacter());
		Checker passwordChecker = new PasswordChecker();
		assertTrue(passwordChecker.check(attributes, "asdf!asdf"));
		assertTrue(passwordChecker.check(attributes, "asdf@asdf"));
		assertTrue(passwordChecker.check(attributes, "asdf#asdf"));
		assertTrue(passwordChecker.check(attributes, "asdf$asdf"));
		assertTrue(passwordChecker.check(attributes, "asdf%asdf"));
		assertTrue(passwordChecker.check(attributes, "asdf&asdf"));
		assertTrue(passwordChecker.check(attributes, "asdf*asdf"));
		assertTrue(passwordChecker.check(attributes, "asdf(asdf"));
		assertTrue(passwordChecker.check(attributes, "asdf)asdf"));
		assertTrue(passwordChecker.check(attributes, "asdf-asdf"));
		assertTrue(passwordChecker.check(attributes, "asdf+asdf"));
		assertFalse(passwordChecker.check(attributes, "asdfasdf"));
	}

}
