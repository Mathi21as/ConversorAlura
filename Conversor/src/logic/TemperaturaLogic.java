package logic;


public class TemperaturaLogic {
	private final double kelvin = 273.15;
	private double farenheit(double c, String tipo) {
		return tipo == "celsiusAFarenheit" ? 
				c * 1.8 + 32 
				: 
				(c - 32) / 1.8;
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
