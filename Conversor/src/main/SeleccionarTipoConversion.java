package main;

import javax.swing.JOptionPane;

import logic.DivisaLogic;
import logic.LongitudLogic;
import logic.TemperaturaLogic;

public class SeleccionarTipoConversion {
	public void divisa (String opcion){
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
	
	public void temperatura(String opcion) {
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
	
	public void longitud(String opcion) {
		LongitudLogic longitudLogic = new LongitudLogic();
		Double inputValue = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el numero a convertir"));
		
		switch(opcion) {
			case "Metro a Pulgada": JOptionPane.showMessageDialog(
				null,
				String.format(
					"El resultado de la conversion es: %.2f  pulgadas",
					longitudLogic.metroAPulgada(inputValue)));
			
				break;
				
			case "Metro a Pie": JOptionPane.showMessageDialog(
				null,
				String.format(
					"El resultado de la conversion es: %.2f pies",
					longitudLogic.metroAPie(inputValue)));

				break;
				
			case "Metro a Yarda": JOptionPane.showMessageDialog(
				null,
				String.format(
					"El resultado de la conversion es: %.2f yardas",
					longitudLogic.metroAYarda(inputValue)));

				break;
				
			case "Metro a Milla": JOptionPane.showMessageDialog(
				null,
				String.format(
					"El resultado de la conversion es: %.2f millas",
					longitudLogic.metroAMilla(inputValue)));
			
			case "Pulgada a Metro": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f metros",
						longitudLogic.pulgadaAMetro(inputValue)));

					break;
			
			case "Pie a Metro": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f metros",
						longitudLogic.pieAMetro(inputValue)));

					break;
					
			case "Yarda a Metro": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f metros",
						longitudLogic.yardaAMetro(inputValue)));

					break;
					
			case "Milla a Metro": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f metros",
						longitudLogic.millaAMetro(inputValue)));

		}
	}
}
