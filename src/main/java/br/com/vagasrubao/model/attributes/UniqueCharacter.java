package br.com.vagasrubao.model.attributes;

import java.util.HashSet;
import java.util.Set;

import br.com.vagasrubao.interfaces.PasswordAtrribute;

public class UniqueCharacter implements PasswordAtrribute {

	@Override
	public boolean checkAttribute(String value) {
		Set<Character> conjunto = new HashSet<Character>();

		for (int i = 0; i < value.length(); i++)
			conjunto.add(new Character(value.charAt(i)));

		if (conjunto.size() == value.length())
			return true;

		return false;
	}

}
