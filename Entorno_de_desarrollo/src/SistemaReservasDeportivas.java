/**
 * Clase que modela un sistema de reservas deportivas.
 * @author david
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que modela un sistema de reservas deportivas.
 */
public class SistemaReservasDeportivas {
	/**
	 * Lista de reservas
	 */
    private List<Reserva> reservas;
    /**
     * Array de booleanos que indica si la iluminación está activada en cada pista
     */
    private boolean[] iluminacion;
    /**
     * Número máximo de pistas
     */
    private static final int MAX_PISTAS = 10; // Asumimos un máximo de 10 pistas

	/**
	 * Constructor de la clase
	 */
    public SistemaReservasDeportivas() {
        reservas = new ArrayList<>();
        iluminacion = new boolean[MAX_PISTAS];
    }
    /**
     * Método que permite reservar una pista
     * @param idPista Identificador de la pista
     * @param fecha Fecha de la reserva
     * @param duracion Duración de la reserva en horas
     * @return true si la reserva se realizó con éxito, false en caso contrario
     */
    public boolean reservarPista(int idPista, String fecha, int duracion) {
        if (idPista < 0 || idPista >= MAX_PISTAS) {
            return false; // ID de pista inválido
        }
        for (Reserva r : reservas) {
            if (r.getIdPista() == idPista && r.getFecha().equals(fecha)) {
                return false; // La pista ya está reservada en esa fecha
            }
        }
        reservas.add(new Reserva(idPista, fecha, duracion));
        return true;
    }

    /**
     * Método que permite cancelar una reserva
     * @param idReserva Identificador de la reserva
     * @return true si la reserva se canceló con éxito, false en caso contrario
     */
    public boolean cancelarReserva(int idReserva) {
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getIdPista() == idReserva) {
                reservas.remove(i);
                return true;
            }
        }
        return false; // No se encontró la reserva
    }
    /**
     * Método que permite activar la iluminación de una pista
     * @param idPista Identificador de la pista
     * @return true si la iluminación se activó con éxito, false en caso contrario
     */

    public boolean activarIluminacion(int idPista) {
        if (idPista < 0 || idPista >= MAX_PISTAS) {
            return false; // ID de pista inválido
        }
        iluminacion[idPista] = true;
        return true;
    }
    /**
     * Método que permite desactivar la iluminación de una pista
     * @param idPista Identificador de la pista
     * @return true si la iluminación se desactivó con éxito, false en caso contrario
     */

    public boolean desactivarIluminacion(int idPista) {
        if (idPista < 0 || idPista >= MAX_PISTAS) {
            return false; // ID de pista inválido
        }
        iluminacion[idPista] = false;
        return true;
    }
    /**
     * Método que permite verificar la disponibilidad de una pista
     * @param idPista Identificador de la pista
     * @param fecha fecha de la reserva
     * @param hora hora de la reserva
     * @return true si la pista está disponible, false en caso contrario
     */

    public boolean verificarDisponibilidad(int idPista, String fecha, String hora) {
        if (idPista < 0 || idPista >= MAX_PISTAS) {
            return false; // ID de pista inválido
        }
        for (Reserva r : reservas) {
            if (r.getIdPista() == idPista && r.getFecha().equals(fecha)) {
                return false; // La pista no está disponible en esa fecha
            }
        }
        return true; // La pista está disponible
    }
}