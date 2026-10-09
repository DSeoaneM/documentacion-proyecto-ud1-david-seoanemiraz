package es.centro.incidencias;

import java.util.Locale;
/**
 * Representa una incidencia definida por un identificador, un título, un nivel de prioridad y un estado.
 *
 * @author Profesor
 * @version 1.0
 * @since 1.0
 *
 */
public final class Incidencia {

    private final String id;
    private final String titulo;
    private final String prioridad;
    private final boolean abierta;

    /**
     * Crea una incidencia.
     *
     * @param id String identificativo único con formato 'INC-000'.
     * @param titulo String descriptivo de la incidencia referida.
     * @param prioridad String indicativo del nivel de prioridad de la incicendia. Puede tomar los valores: alto, medio o bajo.
     * @param abierta booleano que toma el valor true cuando la incidencia sigue abierta, o false cuando se ha cerrado.
     *
     */
    public Incidencia(String id, String titulo, String prioridad, boolean abierta) {
        this.id = id;
        this.titulo = titulo;
        this.prioridad = prioridad;
        this.abierta = abierta;
    }

    /**
     * Devuelve el id de la incidencia.
     *
     * @return id de la incidencia.
     */
    public String getId() {
        return id;
    }

    /**
     * Devuelve el título de la incidencia.
     *
     * @return titulo de la incidencia.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Devuelve el nivel de prioridad de la incidencia.
     *
     * @return prioridad de la incidencia.
     */
    public String getPrioridad() {
        return prioridad;
    }

    /**
     * Devuelve el estado abierto o cerrado de la incidencia.
     *
     * @return abierta de la incidencia.
     */
    public boolean isAbierta() {
        return abierta;
    }

    /**
     * Devuelve el cierto o falso si el identificador o el título de una incidencia coinciden o no con un texto proporcionado.
     *
     * @param texto String que se proporciona como texto de búsqueda en el id o en el título de la incidencia
     *
     * @return boolean según haya o no coincidencia entre el texto proporcionado y el id o el título de la incidencia.
     */
    public boolean coincideCon(String texto) {
        String criterio = texto.toLowerCase(Locale.ROOT);
        return id.toLowerCase(Locale.ROOT).contains(criterio)
                || titulo.toLowerCase(Locale.ROOT).contains(criterio);
    }

}
