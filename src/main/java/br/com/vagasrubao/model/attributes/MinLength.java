package br.com.vagasrubao.model.attributes;

import br.com.vagasrubao.interfaces.PasswordAtrribute;

public class MinLength implements PasswordAtrribute {

	@Override
	public boolean checkAttribute(String value) {
		if (value.length() >= 9)
			return true;

		return false;
	}

}
