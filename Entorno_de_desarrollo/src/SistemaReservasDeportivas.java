/**
 * Clase que modela un sistema de reservas deportivas.
 * @author david
 * @version 1.0
 */
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Clase que modela un sistema de reservas deportivas.
 */
public class SistemaReservasDeportivas {
	
	/**
     * Número máximo de pistas
     */
    private static final int MAX_PISTAS = 10; // Asumimos un máximo de 10 pistas
    private ArrayList<Reserva> reservas;
    private GestorIluminacion gestorIluminacion;
    
	/**
	 * Constructor de la clase
	 */
    public SistemaReservasDeportivas() {
        reservas = new ArrayList<>();
 
    }
    public class GestorIluminacion {
        private boolean[] iluminacion;
        /**
         * Constructor
         * @param numPistas
         */
        public GestorIluminacion(int numPistas) {
            iluminacion = new boolean[numPistas]; // Inicializa todas las luces en false
        }
        /**
         * Activa la iluminación de una pista
         * @param idPista
         * @return
         */
        public boolean activarIluminacion(int idPista) {
            if (idPista < 0 || idPista >= iluminacion.length) {
                return false; // ID de pista inválido
            }
            iluminacion[idPista] = true;
            return true;
        }
        /**
         * 
         * @param idPista
         * @return
         */

        public boolean desactivarIluminacion(int idPista) {
            if (idPista < 0 || idPista >= iluminacion.length) {
                return false; // ID de pista inválido
            }
            iluminacion[idPista] = false;
            return true;
        }
       
    }

    /**
     * Método que permite reservar una pista
     * @param idPista Identificador de la pista
     * @param fecha Fecha de la reserva
     * @param duracion Duración de la reserva en horas
     * @return true si la reserva se realizó con éxito, false en caso contrario
     */
    public boolean reservarPista(Reserva reserva) {
    	int idPista = reserva.getIdPista();
        LocalDateTime fechaHora = reserva.getFechaHora();
        
        if (idPista < 0 || idPista >= MAX_PISTAS) {
            return false; // ID de pista inválido
        }
        for (Reserva r : reservas) {
            if (r.getIdPista() == idPista && esFechaDisponible(fechaHora, r)) {
                return false; // La pista ya está reservada en esa fecha
            }
        }
        reservas.add(new Reserva(reserva.getIdPista(), reserva.getFechaHora(), reserva.getDuracion()));
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
     * Método que permite verificar la disponibilidad de una pista
     * @param idPista Identificador de la pista
     * @param fecha fecha de la reserva
     * @param hora hora de la reserva
     * @return true si la pista está disponible, false en caso contrario
     */

    public boolean verificarDisponibilidad(int idPista, LocalDateTime fecha, String hora) {
        if (idPista < 0 || idPista >= MAX_PISTAS) {
            return false; // ID de pista inválido
        }
        for (Reserva r : reservas) {
            if (r.getIdPista() == idPista && esFechaDisponible(fecha, r)) {
                return false; // La pista no está disponible en esa fecha
            }
        }
        return true; // La pista está disponible
    }
    /**
     * 
     * @param fecha
     * @param r
     * @return
     */
	private boolean esFechaDisponible(LocalDateTime fecha, Reserva r) {
		return r.getFechaHora().equals(fecha);
	}
}
