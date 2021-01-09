package br.com.vagasrubao.model.attributes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.vagasrubao.interfaces.PasswordAtrribute;

public class SpecialCharacter implements PasswordAtrribute {

	@Override
	public boolean checkAttribute(String value) {
		Pattern p = Pattern.compile("[!@#$%^&*()\\-+]");
		Matcher m = p.matcher(value);
		if (m.find())
			return true;

		return false;
	}

}
