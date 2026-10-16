package es.centro.incidencias;

import java.util.List;
/**
 * Representa un gestor de incidencias.
 *
 * <p>Permite listar, buscar y obtener incidencias, listar las incidencias abiertas, y buscar incidencias por id</p>
 *
 * @author Profesor
 * @version 1.0
 * @since 1.0
 *
 */
public final class GestorIncidencias {

    private final List<Incidencia> incidencias;

    /**
     * Construye el gestor de incidencias a partir de una lista de objetos de clase Incidencia
     */
    public GestorIncidencias() {
        incidencias = List.of(
                new Incidencia("INC-001", "No se puede iniciar sesión", "alta", true),
                new Incidencia("INC-002", "Actualizar el navegador", "media", false),
                new Incidencia("INC-003", "Impresora sin conexión", "baja", true),
                new Incidencia("INC-004", "Fallo de red en el aula", "alta", true)
        );
    }

    /**
     *Lista todas las incidencias
     *
     * @return lista de incidencias
     */
    public List<Incidencia> listar() {
        return incidencias;
    }

    /**
     * Lista las incidencias abiertas
     *
     * @return lista de incidencias donde el estado es abierta
     * @see Incidencia#isAbierta()
     */
    public List<Incidencia> listarAbiertas() {
        return incidencias.stream()
                .filter(Incidencia::isAbierta)
                .toList();
    }

    /**
     * Busca todas las incidencias cuyo id o título coincide con un texto de filtrado
     *
     * @param texto (String) permite filtrar las incidencias
     * @return lista de incidencias cuyo id o título coincide con el texto proporcionado
     * @see Incidencia#coincideCon(String)
     */
    public List<Incidencia> buscar(String texto) {
        return incidencias.stream()
                .filter(incidencia -> incidencia.coincideCon(texto))
                .toList();
    }

    /**
     * Busca una incidencia por su id
     *
     * @param id (String) identificador único de la incidencia
     * @return una única incidencia cuyo id coincide con el proporcionado o una excepción si no se encuentra
     * @throws IncidenciaNoEncontradaException si el id proporcionado no coincide con ninguno del listado de incidencias
     * @see Incidencia#getId()
     * @see IncidenciaNoEncontradaException
     */
    public Incidencia buscarPorId(String id) throws IncidenciaNoEncontradaException {
        return incidencias.stream()
                .filter(incidencia -> incidencia.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new IncidenciaNoEncontradaException(id));
    }

    /**
     * Metodo deprecated a partir de la versión 1.0.0. Se recomienda sustituirlo por:
     * {@link GestorIncidencias#buscarPorId(String)}
     *
     * Este metodo devuelve un resultado null si no se encuentra la incidencia. El nuevo metodo gestiona correctamente esta excepción.
     *
     * Busca una incidencia por su id
     *
     * @param id (String) identificador único de la incidencia
     * @return una única incidencia cuyo id coincide con el proporcionado o nada si no se encuentra
     * @see IncidenciaNoEncontradaException
     */
    @Deprecated(since = "1.0.0", forRemoval = false)
    public Incidencia obtenerIncidencia(String id) {
        try {
            return buscarPorId(id);
        } catch (IncidenciaNoEncontradaException excepcion) {
            return null;
        }
    }
}
