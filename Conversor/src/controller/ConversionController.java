package controller;

import logic.ByteLogic;
import logic.CurrencyLogic;
import logic.LengthLogic;
import logic.MassLogic;
import logic.TemperatureLogic;
import logic.VolumeLogic;

public class ConversionController {
	
	private static CurrencyLogic currencyLogic = CurrencyLogic.getInstance();
	private static TemperatureLogic temperatureLogic = TemperatureLogic.getInstance();
	private static LengthLogic lengthLogic = LengthLogic.getInstance();
	private static MassLogic massLogic = MassLogic.getInstance();
	private static VolumeLogic volumenLogic = VolumeLogic.getInstance();
	private static ByteLogic byteLogic = ByteLogic.getInstance();
	private static ConversionController instance;
	
	private ConversionController() {}
	
	public static ConversionController getInstance() {
		if(instance == null) {
			instance = new ConversionController();
		}
		return instance;
	}
	
	public Double sendInputToCurrencyObject(String type, String toConvert, Double value) {
		switch(type) {
			case "Dolar USD": return currencyLogic.dolarToOtherCurrency(toConvert, value);
			
			case "Euro EUR": return currencyLogic.euroToOtherCurrency(toConvert, value);
			
			case "Libra Esterlina GBP": return currencyLogic.libraToOtherCurrency(toConvert, value);
			
			case "Yen Japones JPY": return currencyLogic.yenToOtherCurrency(toConvert, value);
			
			case "Won Coreano KRW": return currencyLogic.wonToOtherCurrency(toConvert, value);
			
			case "Peso Argentino ARS": return currencyLogic.pesoToOtherCurrency(toConvert, value);
			
			default: return null;
		}
	}
	
	public Double sendInputToTemperatureObject(String type, String toConvert, Double value) {
		switch(type) {
			case "Celsius (°C)": return temperatureLogic.celsiusToOtherTemperature(toConvert, value);
			
			case "Farenheit (°F)": return temperatureLogic.farenheitToOtherTemperature(toConvert, value);
			
			case "Kelvin (K)": return temperatureLogic.kelvinToOtherTemperature(toConvert, value);
			
			default: return null;
		}
	}
	
	public Double sendInputToLengthObject(String type, String toConvert, Double value) {
		switch(type) {
			case "Metro": return lengthLogic.meterToOtherLength(toConvert, value);
			
			case "Pulgada": return lengthLogic.inchToOtherLength(toConvert, value);
			
			case "Pie": return lengthLogic.footToOtherLength(toConvert, value);
			
			case "Yarda": return lengthLogic.yardToOtherLength(toConvert, value);
			
			case "Milla": return lengthLogic.mileToOtherLength(toConvert, value);
			
			default: return null;
		}
	}
	
	public Double sendInputToMassObject(String type, String toConvert, Double value) {
		switch(type) {
			case "Kilogramo": return massLogic.kiloToOtherWeight(toConvert, value);
			
			case "Onza": return massLogic.ounceToOtherWeight(toConvert, value);
			
			case "Libra": return massLogic.libraToOtherWeight(toConvert, value);
			
			case "Tonelada": return massLogic.tonToOtherWeight(toConvert, value);
			
			default: return null;
		}
	}
	
	public Double sendInputToVolumeObject(String type, String toConvert, Double value) {
		switch(type) {
			case "Litro": return volumenLogic.literToOtherVolume(toConvert, value);
			
			case "Galon": return volumenLogic.gallonToOtherVolume(toConvert, value);
			
			case "Cuarto": return volumenLogic.cuartoToOtherVolume(toConvert, value);
			
			case "Pie Cubico": return volumenLogic.cubicFootToOtherVolume(toConvert, value);
			
			default: return null;
		}
	}
	
	public Double sendInputToByteObject(String type, String toConvert, Double value) {
		switch(type) {
			case "Byte": return byteLogic.byteToOtherUnit(toConvert, value);
			
			case "Kilobyte KB": return byteLogic.kilobyteToOtherUnit(toConvert, value);
			
			case "Megabyte MB": return byteLogic.megabyteToOtherUnit(toConvert, value);
			
			case "Gigabyte GB": return byteLogic.gigabyteToOtherUnit(toConvert, value);
			
			case "Terabyte TB": return byteLogic.terabyteToOtherUnit(toConvert, value);
			
			default: return null;
		}
	}
	
}
