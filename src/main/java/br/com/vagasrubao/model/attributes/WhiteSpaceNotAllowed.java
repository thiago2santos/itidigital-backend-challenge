package br.com.vagasrubao.model.attributes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.vagasrubao.interfaces.PasswordAtrribute;

public class WhiteSpaceNotAllowed implements PasswordAtrribute {

	@Override
	public boolean checkAttribute(String value) {
		Pattern p = Pattern.compile("\\s");
		Matcher m = p.matcher(value);
		if (m.find())
			return false;

		return true;
	}

}
