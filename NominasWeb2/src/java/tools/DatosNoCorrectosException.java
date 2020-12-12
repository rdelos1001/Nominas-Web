package tools;
/**
 * Esta excepción salta cuando los datos recibidos no son correctos.
 * @author Raúl
 *
 */
public class DatosNoCorrectosException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DatosNoCorrectosException() {
        super("Datos no correctos");
    }
}