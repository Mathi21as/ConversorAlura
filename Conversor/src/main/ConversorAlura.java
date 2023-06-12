package main;

import javax.swing.JOptionPane;

import logic.DivisaLogic;
import logic.TemperaturaLogic;

/**
 * 
 * @author Mathias Ledesma
 * @version 1.0.0
 *
 */

public class ConversorAlura {
	
	public static void seleccionarTipoDeConversionDivisa (String opcion){
		DivisaLogic divisaLogic = new DivisaLogic();
		Double inputValue = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el numero a convertir"));
		
		switch(opcion) {
		case "Pesos a Dolares": JOptionPane.showMessageDialog(
				null,
				String.format(
						"El resultado de la conversion es: %.2f dolares",
						divisaLogic.pesoADolar(inputValue)));
		
			break;
		
		case "Pesos a Euros": JOptionPane.showMessageDialog(
				null,
				String.format(
						"El resultado de la conversion es: %.2f euros",
						divisaLogic.pesoAEuro(inputValue)));
		
			break;
		
		case "Pesos a Libras Esterlinas": JOptionPane.showMessageDialog(
				null,
				String.format(
						"El resultado de la conversion es: %.2f libras esterlinas",
						divisaLogic.pesoALibraEsterlina(inputValue)));
		
			break;
			
		case "Pesos a Yen": JOptionPane.showMessageDialog(
				null,
				String.format(
						"El resultado de la conversion es: %.2f yenes",
						divisaLogic.pesoAYen(inputValue)));
		
			break;
			
		case "Pesos a Won Coreano": JOptionPane.showMessageDialog(
				null,
				String.format(
						"El resultado de la conversion es: %.2f won coreano",
						divisaLogic.pesoAWon(inputValue)));
		
			break;
			
		case "Dolares a Pesos": JOptionPane.showMessageDialog(
				null,
				String.format(
						"El resultado de la conversion es: %.2f pesos",
						divisaLogic.dolarAPeso(inputValue)));
		
			break;
			
		case "Euros a Pesos": JOptionPane.showMessageDialog(
				null,
				String.format(
						"El resultado de la conversion es: %.2f pesos",
						divisaLogic.euroAPeso(inputValue)));
		
			break;
			
		case "Libras Esterlinas a Pesos": JOptionPane.showMessageDialog(
				null,
				String.format(
						"El resultado de la conversion es: %.2f pesos",
						divisaLogic.libraEsterlinaAPeso(inputValue)));
		
			break;
			
		case "Yen a Pesos": JOptionPane.showMessageDialog(
				null,
				String.format(
						"El resultado de la conversion es: %.2f pesos",
						divisaLogic.yenAPeso(inputValue)));
		
			break;
			
		case "Won Coreano a Pesos": JOptionPane.showMessageDialog(
				null,
				String.format(
						"El resultado de la conversion es: %.2f pesos",
						divisaLogic.wonAPeso(inputValue)));
		}
				
	}
	
	static public void seleccionarTipoDeConversionTemperatura(String opcion) {
		TemperaturaLogic temperaturaLogic = new TemperaturaLogic();
		Double inputValue = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el numero a convertir"));
		
		switch(opcion) {
			case "Celsius a Farenheit": JOptionPane.showMessageDialog(
				null,
				String.format(
					"El resultado de la conversion es: %.2f  °F",
					temperaturaLogic.conversionFarenheit(inputValue, "celsiusAFarenheit")));
			
				break;
				
			case "Farenheit a Celsius": JOptionPane.showMessageDialog(
				null,
				String.format(
					"El resultado de la conversion es: %.2f °C",
					temperaturaLogic.conversionFarenheit(inputValue, "farenheitACelsius")));

				break;
				
			case "Kelvin a Celsius": JOptionPane.showMessageDialog(
				null,
				String.format(
					"El resultado de la conversion es: %.2f °C",
					temperaturaLogic.kelvinACelsius(inputValue)));

				break;
				
			case "Celsius a Kelvin": JOptionPane.showMessageDialog(
				null,
				String.format(
					"El resultado de la conversion es: %.2f K",
					temperaturaLogic.celsiusAKelvin(inputValue)));
			
		}
	}
		

	public static void main(String[] args) {
		String opcionesDivisas[] = {
				"Pesos a Dolares",
				"Pesos a Euros",
				"Pesos a Libras Esterlinas",
				"Pesos a Yen",
				"Pesos a Won Coreano",
				"Dolares a Pesos",
				"Euros a Pesos",
				"Libras Esterlinas a Pesos",
				"Yen a Pesos",
				"Won Coreano a Pesos"};
		String opcionesTemperatura[] = {
				"Celsius a Farenheit",
				"Celsius a Kelvin",
				"Farenheit a Celsius",
				"Kelvin a Celsius"};
		String opciones[] = {
				"Conversor de divisa",
				"Conversor de temperatura",
				"Conversor de bit"};
		String opcion = (String) JOptionPane.showInputDialog(
				null,
				"Elija una opcion",
				"Menu",
				JOptionPane.DEFAULT_OPTION,
				null,
				opciones,
				opciones[0]);
		
		while(opcion != null) {
			switch(opcion) {
				case "Conversor de divisa": {
					opcion = (String) JOptionPane.showInputDialog(
							null,
							"Elija una opcion",
							"Menu",
							JOptionPane.DEFAULT_OPTION,
							null,
							opcionesDivisas,
							opcionesDivisas[0]);
					
					if(opcion != null)
						seleccionarTipoDeConversionDivisa(opcion);
				}
					break;
					
				case "Conversor de temperatura": {
					opcion = (String) JOptionPane.showInputDialog(
							null,
							"Elija una opcion",
							"Menu",
							JOptionPane.DEFAULT_OPTION,
							null,
							opcionesTemperatura,
							opcionesTemperatura[0]);
					
					if(opcion != null)
						seleccionarTipoDeConversionTemperatura(opcion);
				}
					break;
			}
			
			opcion = (String) JOptionPane.showInputDialog(
					null,
					"Elija una opcion",
					"Menu",
					JOptionPane.DEFAULT_OPTION,
					null,
					opciones,
					opciones[0]);
			
		}
		
	}
	
}
