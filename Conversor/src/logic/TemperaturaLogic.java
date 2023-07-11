package logic;


public class TemperaturaLogic {
	private final Double kelvin = 273.15;
	private static TemperaturaLogic instance;
	
	private TemperaturaLogic() {}
	
	public static TemperaturaLogic getInstance() {
		if(instance == null) 
			instance = new TemperaturaLogic();
		
		return instance;
	}
	
	public Double celsiusAOtraTemperatura(String temperatura, Double valor) {
		switch(temperatura) {
			case "Celsius (°C)": return valor;
			
			case "Farenheit (°F)": return valor * 1.8 + 32;
				
			case "Kelvin (K)": return valor + kelvin;
			
			default: return null;
		}
	}
	
	public Double farenheitAOtraTemperatura(String temperatura, Double valor) {
		switch(temperatura) {
			case "Celsius (°C)": return (valor - 32) / 1.8;
			
			case "Farenheit (°F)": return valor;
				
			case "Kelvin (K)": return (valor - 32) / 1.8 + kelvin;
			
			default: return null;
		}
	}
	
	public Double kelvinAOtraTemperatura(String temperatura, Double valor) {
		switch(temperatura) {
			case "Celsius (°C)": return kelvin - valor;
			
			case "Farenheit (°F)": return (valor - kelvin) * 1.8 + 32;
				
			case "Kelvin (K)": return valor;
			
			default: return null;
		}
	}
 
}
