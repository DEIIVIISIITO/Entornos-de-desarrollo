
public class Calculadora {

	public int sumar (Integer valora, Integer valorb) {
		if(valora!=null && valorb!=null) 
		return valora+valorb;
		else {
			System.out.println("Los valores de entreda no pueden ser null");
			return 0;
		}
		
	}
	public int restar (Integer valora, Integer valorb) {
		if(valora!=null && valorb!=null) 
		return valora-valorb;
		else {
			System.out.println("Los valores de entreda no pueden ser null");
			return 0;
		}
	
	}
	public int multiplicar(Integer valora, Integer valorb) {
		if(valora!=null && valorb!=null) 
		return valora*valorb;
		else {
			System.out.println("Los valores de entreda no pueden ser null");
			return 0;
		}
	}
	
	public int dividir(Integer valora, Integer valorb) {
		if(valora!=null && valorb!=null) 
		return valora/valorb;
		else {
			System.out.println("Los valores de entreda no pueden ser null");
			return 0;
		}
	}
}
