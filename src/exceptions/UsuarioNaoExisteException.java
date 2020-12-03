package exceptions;

public class UsuarioNaoExisteException extends Exception {

	private static final long serialVersionUID = 1L;

	public UsuarioNaoExisteException(String message) {
		super(message);
	}
}
