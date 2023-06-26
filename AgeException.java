package Exception;

import java.rmi.AccessException;

public class AgeException extends AccessException {
	public AgeException(String msg) {
		super(msg);
	}

}
