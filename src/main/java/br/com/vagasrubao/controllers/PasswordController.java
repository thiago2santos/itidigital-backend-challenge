package br.com.vagasrubao.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vagasrubao.model.Password;
import br.com.vagasrubao.services.PasswordService;

@RestController
@RequestMapping(value = "/senha")
public class PasswordController {

	private PasswordService passwordService;

	public PasswordController(PasswordService passwordService) {
		this.passwordService = passwordService;
	}

	@GetMapping("/{value}")
	public ResponseEntity<Password> teste(@PathVariable String value) {

		boolean isValid = passwordService.check(value);
		return ResponseEntity.ok().body(new Password(isValid));
		
	}

}
