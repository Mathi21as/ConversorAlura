package logic;

public class VolumenLogic {
	private final Double galon = 3.785;
	private final Double cuarto = 0.946;
	private final Double pieCubico = 28.32;
	
	private static VolumenLogic instance;
	
	private VolumenLogic() {
		
	}
	
	public static VolumenLogic getInstance() {
		if(instance == null)
			instance = new VolumenLogic();
		
		return instance;
	}
	
	public Double litroAOtroVolumen (String volumen, Double valor) {
		switch(volumen) {
			case "Litro" : return valor;
			
			case "Galon": return valor / galon;
			
			case "Cuarto": return valor / cuarto;
			
			case "Pie Cubico": return valor / pieCubico;
		
			default: return null;
		}
	}
	
	public Double galonAOtroVolumen (String volumen, Double valor) {
		switch(volumen) {
			case "Litro" : return valor * galon;
			
			case "Galon": return valor;
			
			case "Cuarto": return (valor / galon) * cuarto;
			
			case "Pie Cubico": return (valor * galon) / pieCubico;
		
			default: return null;
		}
	}
	
	public Double cuartoAOtroVolumen (String volumen, Double valor) {
		switch(volumen) {
			case "Litro" : return valor * cuarto;
			
			case "Galon": return valor / galon * cuarto;
			
			case "Cuarto": return valor;
			
			case "Pie Cubico": return valor / pieCubico * cuarto;
		
			default: return null;
		}
	}
	
	public Double pieCubicoAOtroVolumen (String volumen, Double valor) {
		switch(volumen) {
			case "Litro" : return valor * pieCubico;
			
			case "Galon": return valor / galon * pieCubico;
			
			case "Cuarto": return valor / cuarto * pieCubico;
			
			case "Pie Cubico": return valor;
		
			default: return null;
		}
	}
}
