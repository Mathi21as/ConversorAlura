package controller;

import logic.ByteLogic;
import logic.DivisaLogic;
import logic.LongitudLogic;
import logic.MasaLogic;
import logic.TemperaturaLogic;
import logic.VolumenLogic;

public class ConversionController {
	
	private static DivisaLogic divisaLogic = DivisaLogic.getInstance();
	private static TemperaturaLogic temperaturaLogic = TemperaturaLogic.getInstance();
	private static LongitudLogic longitudLogic = LongitudLogic.getInstance();
	private static MasaLogic masaLogic = MasaLogic.getInstance();
	private static VolumenLogic volumenLogic = VolumenLogic.getInstance();
	private static ByteLogic byteLogic = ByteLogic.getInstance();
	private static ConversionController instance;
	
	private ConversionController() {}
	
	public static ConversionController getInstance() {
		if(instance == null) {
			instance = new ConversionController();
		}
		return instance;
	}
	
	public Double sendInputToDivisaObject(String type, String toConvert, Double value) {
		switch(type) {
			case "Dolar USD": return divisaLogic.dolarAOtraDivisa(toConvert, value);
			
			case "Euro EUR": return divisaLogic.euroAOtraDivisa(toConvert, value);
			
			case "Libra Esterlina GBP": return divisaLogic.libraAOtraDivisa(toConvert, value);
			
			case "Yen Japones JPY": return divisaLogic.yenAOtraDivisa(toConvert, value);
			
			case "Won Coreano KRW": return divisaLogic.wonAOtraDivisa(toConvert, value);
			
			case "Peso Argentino ARS": return divisaLogic.pesoAOtraDivisa(toConvert, value);
			
			default: return null;
		}
	}
	
	public Double sendInputToTemperaturaObject(String type, String toConvert, Double value) {
		switch(type) {
			case "Celsius (°C)": return temperaturaLogic.celsiusAOtraTemperatura(toConvert, value);
			
			case "Farenheit (°F)": return temperaturaLogic.farenheitAOtraTemperatura(toConvert, value);
			
			case "Kelvin (K)": return temperaturaLogic.kelvinAOtraTemperatura(toConvert, value);
			
			default: return null;
		}
	}
	
	public Double sendInputToLongitudObject(String type, String toConvert, Double value) {
		switch(type) {
			case "Metro": return longitudLogic.metroAOtraLongitud(toConvert, value);
			
			case "Pulgada": return longitudLogic.pulgadaAOtraLongitud(toConvert, value);
			
			case "Pie": return longitudLogic.pieAOtraLongitud(toConvert, value);
			
			case "Yarda": return longitudLogic.yardaAOtraLongitud(toConvert, value);
			
			case "Milla": return longitudLogic.millaAOtraLongitud(toConvert, value);
			
			default: return null;
		}
	}
	
	public Double sendInputToMasaObject(String type, String toConvert, Double value) {
		switch(type) {
			case "Kilogramo": return masaLogic.kiloAOtroPeso(toConvert, value);
			
			case "Onza": return masaLogic.onzaAOtroPeso(toConvert, value);
			
			case "Libra": return masaLogic.libraAOtroPeso(toConvert, value);
			
			case "Tonelada": return masaLogic.toneladaAOtroPeso(toConvert, value);
			
			default: return null;
		}
	}
	
	public Double sendInputToVolumenObject(String type, String toConvert, Double value) {
		switch(type) {
			case "Litro": return volumenLogic.litroAOtroVolumen(toConvert, value);
			
			case "Galon": return volumenLogic.galonAOtroVolumen(toConvert, value);
			
			case "Cuarto": return volumenLogic.cuartoAOtroVolumen(toConvert, value);
			
			case "Pie Cubico": return volumenLogic.pieCubicoAOtroVolumen(toConvert, value);
			
			default: return null;
		}
	}
	
	public Double sendInputToByteObject(String type, String toConvert, Double value) {
		switch(type) {
			case "Byte": return byteLogic.byteAOtraUnidad(toConvert, value);
			
			case "Kilobyte": return byteLogic.kilobyteAOtraUnidad(toConvert, value);
			
			case "Megabyte": return byteLogic.megabyteAOtraUnidad(toConvert, value);
			
			case "Gigabyte GB": return byteLogic.gigabyteAOtraUnidad(toConvert, value);
			
			case "Terabyte TB": return byteLogic.terabyteAOtraUnidad(toConvert, value);
			
			default: return null;
		}
	}
	
}
