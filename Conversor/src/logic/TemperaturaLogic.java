package logic;


public class TemperaturaLogic {
	private final double kelvin = 273.15;
	private double farenheit(double c, String tipo) {
		return tipo == "celsiusAFarenheit" ? 
				c * 1.8 + 32 
				: 
				(c - 32) / 1.8;
	}
	
	private static TemperaturaLogic instance;
	
	private TemperaturaLogic() {
		
	}
	
	public static TemperaturaLogic getInstance() {
		if(instance == null) 
			instance = new TemperaturaLogic();
		
		return instance;
	}
	
	public double celsiusAKelvin(double grados) {
		return grados + this.kelvin;
	}
	
	public double kelvinACelsius(double kelvin) {
		return kelvin - this.kelvin;
	}
	
	public double conversionFarenheit(double grados, String tipoConversion) {
		return farenheit(grados, tipoConversion);
	}
}
