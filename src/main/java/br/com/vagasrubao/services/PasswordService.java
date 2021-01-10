package br.com.vagasrubao.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.vagasrubao.interfaces.Checker;
import br.com.vagasrubao.interfaces.PasswordAtrribute;
import br.com.vagasrubao.model.attributes.Digit;
import br.com.vagasrubao.model.attributes.Lowercase;
import br.com.vagasrubao.model.attributes.MinLength;
import br.com.vagasrubao.model.attributes.SpecialCharacter;
import br.com.vagasrubao.model.attributes.UniqueCharacter;
import br.com.vagasrubao.model.attributes.Uppercase;
import br.com.vagasrubao.model.attributes.WhiteSpaceNotAllowed;
import br.com.vagasrubao.utils.PasswordChecker;

@Service
public class PasswordService {

	public boolean check(String password) {

		List<PasswordAtrribute> attributes = new ArrayList<PasswordAtrribute>();
		attributes.add(new Digit());
		attributes.add(new Lowercase());
		attributes.add(new MinLength());
		attributes.add(new SpecialCharacter());
		attributes.add(new UniqueCharacter());
		attributes.add(new Uppercase());
		attributes.add(new WhiteSpaceNotAllowed());

		Checker passwordChecker = new PasswordChecker();

		return passwordChecker.check(attributes, password);

	}

}
