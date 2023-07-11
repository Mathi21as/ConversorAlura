package logic;


public class LongitudLogic {
	
	private final Double pulgada = 0.0254;
	private final Double pie = 0.3048;
	private final Double yarda = 0.9144;
	private final Double milla = 1609.0;
	
	private static LongitudLogic instance;
	
	private LongitudLogic() {
		
	}
	
	public static LongitudLogic getInstance() {
		if(instance == null)
			instance = new LongitudLogic();
		
		return instance;
	}
	
	public Double metroAOtraLongitud(String longitud, Double valor) {
		switch(longitud) {
			case "Metro" : return valor;
			
			case "Pulgada": return Double.valueOf(valor/pulgada);
			
			case "Pie": return Double.valueOf(valor/pie);
			
			case "Yarda": return Double.valueOf(valor/yarda);
			
			case "Milla": return Double.valueOf(valor/milla);
			
			default: return null;
		}
	}
	
	public Double pulgadaAOtraLongitud(String longitud, Double valor) {
		switch(longitud) {
			case "Metro" : return Double.valueOf(valor * pulgada);
			
			case "Pulgada": return valor;
			
			case "Pie": return Double.valueOf((valor*pulgada)/pie);
			
			case "Yarda": return Double.valueOf((valor*pulgada)/yarda);
			
			case "Milla": return Double.valueOf((valor*pulgada)/milla);
			
			default: return null;
		}
	}
	
	public Double pieAOtraLongitud(String longitud, Double valor) {
		switch(longitud) {
			case "Metro" : return valor * pie;
			
			case "Pulgada": return Double.valueOf((valor*pie)/pulgada);
			
			case "Pie": return valor;
			
			case "Yarda": return Double.valueOf((valor*pie)/yarda);
			
			case "Milla": return Double.valueOf((valor*pie)/milla);
			
			default: return null;
		}
	}
	
	public Double yardaAOtraLongitud(String longitud, Double valor) {
		switch(longitud) {
			case "Metro" : return valor * yarda;
			
			case "Pulgada": return Double.valueOf((valor*yarda)/pulgada);
			
			case "Pie": return Double.valueOf((valor*yarda)/pie);
			
			case "Yarda": return valor;
			
			case "Milla": return Double.valueOf((valor*yarda)/milla);
			
			default: return null;
		}
	}
	
	public Double millaAOtraLongitud(String longitud, Double valor) {
		switch(longitud) {
			case "Metro" : return valor * milla;
			
			case "Pulgada": return Double.valueOf((valor*milla)/pulgada);
			
			case "Pie": return Double.valueOf((valor*milla)/pie);
			
			case "Yarda": return Double.valueOf((valor*milla)/yarda);
			
			case "Milla": return valor;
			
			default: return null;
		}
	}
	
}
