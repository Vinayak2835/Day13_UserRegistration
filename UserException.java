public class UserException extends Exception {
	 /**
     * this class creates a constructor for invalid input
     *
     * @return error message as Invalid output or failure
     *
     */
	String errorMessage;
	UserException (String message) {
		this.errorMessage = message;
	}
}
