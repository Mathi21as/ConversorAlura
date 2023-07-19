package logic;


public class TemperatureLogic {
	private final Double kelvin = 273.15;
	private static TemperatureLogic instance;
	
	private TemperatureLogic() {}
	
	public static TemperatureLogic getInstance() {
		if(instance == null) 
			instance = new TemperatureLogic();
		
		return instance;
	}
	
	public Double celsiusToOtherTemperature(String temperature, Double value) {
		switch(temperature) {
			case "Celsius (°C)": return value;
			
			case "Farenheit (°F)": return value * 1.8 + 32;
				
			case "Kelvin (K)": return value + kelvin;
			
			default: return null;
		}
	}
	
	public Double farenheitToOtherTemperature(String temperature, Double value) {
		switch(temperature) {
			case "Celsius (°C)": return (value - 32) / 1.8;
			
			case "Farenheit (°F)": return value;
				
			case "Kelvin (K)": return (value - 32) / 1.8 + kelvin;
			
			default: return null;
		}
	}
	
	public Double kelvinToOtherTemperature(String temperature, Double value) {
		switch(temperature) {
			case "Celsius (°C)": return kelvin - value;
			
			case "Farenheit (°F)": return (value - kelvin) * 1.8 + 32;
				
			case "Kelvin (K)": return value;
			
			default: return null;
		}
	}
 
}
