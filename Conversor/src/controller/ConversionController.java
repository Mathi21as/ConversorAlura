package controller;

import javax.swing.JOptionPane;

import logic.DivisaLogic;
import logic.LongitudLogic;
import logic.MasaLogic;
import logic.TemperaturaLogic;
import logic.VolumenLogic;

public class ConversionController {
	
	private Double inputValue;
	private static DivisaLogic divisaLogic = DivisaLogic.getInstance();
	private static ConversionController instance;
	
	private ConversionController() {
		
	}
	
	public static ConversionController getInstance() {
		if(instance == null) {
			instance = new ConversionController();
		}
		return instance;
	}
	
	public Double sendInputToObject(String type, String toConvert, Double value) {
		switch(type) {
			case "Dolar USD": return divisaLogic.dolarAOtraDivisa(toConvert, value);
			
			case "Euro EUR": return divisaLogic.euroAOtraDivisa(toConvert, value);
			
			case "Libra Esterlina GBP": return divisaLogic.libraAOtraDivisa(toConvert, value);
			
			case "Yen Japone JPY": return divisaLogic.yenAOtraDivisa(toConvert, value);
			
			case "Won Coreano KRW": return divisaLogic.wonAOtraDivisa(toConvert, value);
			
			case "Peso Argentino ARS": return divisaLogic.pesoAOtraDivisa(toConvert, value);
		}
		return null;
	}
	
}
