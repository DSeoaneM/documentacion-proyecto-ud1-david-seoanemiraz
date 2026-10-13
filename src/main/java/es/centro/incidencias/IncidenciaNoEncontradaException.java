package es.centro.incidencias;
/**
 * Representa una excepción que es lanzada cuando una incidencias no existe.
 *
 * @author Profesor
 * @version 1.0
 * @since 1.0
 *
 */
public class IncidenciaNoEncontradaException extends Exception {

    /**
     * Es una excepción lanzada cuando no hay incidencias con el identificador propocionado.
     * Hereda y modifica el comportamiento de las excepciones de la clase Exception.
     *
     * @param id (String) identificativo único de la incidencia en formato 'INC-000'
     *
     */
    public IncidenciaNoEncontradaException(String id) {
        super("No existe ninguna incidencia con el identificador " + id + ".");
    }
}
