import java.time.LocalDateTime;

/**
 * Representa una reserva en el sistema de reservas deportivas.
 * Contiene información sobre la pista, la fecha y la duración de la reserva.
 * 
 * @author David Cruz Yanez
 * @version 1.0
 */
public class Reserva {

    private int idPista;
    private LocalDateTime fechaHora;
    private int duracion;

    /**
     * Constructor para crear una nueva reserva.
     * 
     * @param idPista   El identificador de la pista reservada.
     * @param fechaHora La fecha y hora en la que se realiza la reserva.
     * @param duracion  La duración de la reserva en minutos.
     */
    public Reserva(int idPista, LocalDateTime fechaHora, int duracion) {
        this.idPista = idPista;
        this.fechaHora = fechaHora;
        this.duracion = duracion;
    }
/**
 * Método que devuelve el identificador de la pista
 * @return El identificador de la pista
 */
    public int getIdPista() {
        return idPista;
    }
/**
 * Método que devuelve la fecha y hora
 * @return
 */
    public LocalDateTime getFechaHora() {
        return fechaHora;
    }
/**
 * Método que devuelve la duración de la reserva
 * @return
 */
    public int getDuracion() {
        return duracion;
    }
}