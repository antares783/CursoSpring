package mx.com.antares.ejemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import mx.com.antares.ejemplo.Saludo;


/**
 * {@link Service} with hard-coded input data.
 */
@Component
public class ExampleService implements Service {
	
	@Autowired
	private Saludo saludo;
	
	/**
	 * Reads next record from input
	 */
	public String getMessage() {
		return saludo.getMensaje();	
	}

}
