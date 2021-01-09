package br.com.vagasrubao.model;

import java.io.Serializable;

public class Password implements Serializable {
	private static final long serialVersionUID = 1L;

	private boolean valid;

	public Password() {
	}

	public Password(boolean valid) {
		this.valid = valid;
	}

	public boolean isValid() {
		return valid;
	}

}
