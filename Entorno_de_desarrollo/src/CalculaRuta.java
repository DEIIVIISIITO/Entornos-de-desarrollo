import java.util.List;

public class CalculaRuta {
	public static String rutaMasRapida(String origen, String destino) {
		// Simulación de cálculo de ruta más rápida
		return "Ruta rápida de" + origen + "a " + destino + " via autopista";
	}

	public String rutaMasEconomica(String origen, String destino, double presupuesto) {
		// Simulación de cálculo de ruta más económica
		return "Ruta 2";
	}

	public String rutaConLugaresDeInteres(String origen, String destino, List<String> lugaresDeInteres) {
        // Simulación de cálculo de ruta con lugares de interés
        return "Ruta 3";
    }

	public String rutaConGasolineras(String origen, String destino, int numGasolineras) {
		// Simulación de cálculo de ruta con gasolineras
		return "Ruta 4";
	}
}
