package com.chainsys.home.validator;

import com.chainsys.home.model.Register;

public class LoginValidator {
	public void loginValidator(Register register) throws Exception {
		if (register.getEmail().equals(null)) {
			throw new Exception("invalid email id");
		}
		if (register.getPassword() == "null") {
			throw new Exception("Invalid Password");
		}
	}

	public Boolean EmailExistValidator(Register register) {

		return true;
	}

}
