package logs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PersonaLog {
    private final static Logger logger = LogManager.getRootLogger();
    private String nombre;

    public PersonaLog(String nombre) {
        nombre = nombre;
        logger.debug("Un objeto de Persona ha sido creado: " + nombre);
    }

    public void comer() {
        logger.debug("Llamada a comer.");
        System.out.println("Comer");
    }
}
