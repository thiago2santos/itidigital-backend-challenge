package br.com.vagasrubao.model.attributes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.vagasrubao.interfaces.PasswordAtrribute;

public class Lowercase implements PasswordAtrribute {

	@Override
	public boolean checkAttribute(String value) {
		Pattern p = Pattern.compile("[a-z]");
		Matcher m = p.matcher(value);
		if (m.find())
			return true;

		return false;
	}

}
