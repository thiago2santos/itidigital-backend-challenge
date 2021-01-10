package br.com.vagasrubao;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.vagasrubao.model.attributes.DigitTest;
import br.com.vagasrubao.model.attributes.LowercaseTest;
import br.com.vagasrubao.model.attributes.MinLengthTest;
import br.com.vagasrubao.model.attributes.SpecialCharacterTest;
import br.com.vagasrubao.model.attributes.UniqueCharacterTest;
import br.com.vagasrubao.model.attributes.UppercaseTest;
import br.com.vagasrubao.model.attributes.WhiteSpaceNotAllowedTest;
import br.com.vagasrubao.services.PasswordServiceTest;

@RunWith(Suite.class)
@SuiteClasses({ DigitTest.class, 
	LowercaseTest.class, 
	MinLengthTest.class, 
	SpecialCharacterTest.class,
	UniqueCharacterTest.class, 
	UppercaseTest.class, 
	WhiteSpaceNotAllowedTest.class, 
	PasswordServiceTest.class })

public class AllTestsSuite {

}
