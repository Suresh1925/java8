package Exception;

import java.rmi.AccessException;

public class LoginException extends AccessException {
	public LoginException(String msg) {
		super(msg);
	}

}
