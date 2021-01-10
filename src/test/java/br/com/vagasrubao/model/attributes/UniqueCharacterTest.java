package br.com.vagasrubao.model.attributes;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.vagasrubao.interfaces.Checker;
import br.com.vagasrubao.interfaces.PasswordAtrribute;
import br.com.vagasrubao.utils.PasswordChecker;

public class UniqueCharacterTest {

	public UniqueCharacterTest() {
	}

	@Test
	public void test() {
		List<PasswordAtrribute> attributes = new ArrayList<PasswordAtrribute>();
		attributes.add(new UniqueCharacter());
		Checker passwordChecker = new PasswordChecker();
		assertTrue(passwordChecker.check(attributes, "fgaspo"));
		assertFalse(passwordChecker.check(attributes, "fgaspopo"));
	}

}
