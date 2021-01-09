package br.com.vagasrubao.utils;

import java.util.List;

import br.com.vagasrubao.interfaces.Checker;
import br.com.vagasrubao.interfaces.PasswordAtrribute;

public class PasswordChecker implements Checker {

	@Override
	public boolean check(List<PasswordAtrribute> attributes, String value) {

		return attributes.stream().allMatch(attr -> attr.checkAttribute(value) == true);
		
	}

}
