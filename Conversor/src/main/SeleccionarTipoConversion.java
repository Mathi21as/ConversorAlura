package main;

import javax.swing.JOptionPane;

import logic.DivisaLogic;
import logic.LongitudLogic;
import logic.MasaLogic;
import logic.TemperaturaLogic;
import logic.VolumenLogic;

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
	
	public void masa(String opcion) {
		MasaLogic masaLogic = new MasaLogic();
		Double inputValue = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el numero a convertir"));
		
		switch(opcion) {
			case "Kilogramo a Libra": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f libras",
						masaLogic.kilogramoALibra(inputValue)));
			
				break;
				
			case "Kilogramo a Onza": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f onzas",
						masaLogic.kilogramoAOnza(inputValue)));
			
				break;
				
			case "Kilogramo a Tonelada": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f toneladas",
						masaLogic.kilogramoATonelada(inputValue)));
			
				break;
				
			case "Libra a Kilogramo": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f kilogramos",
						masaLogic.libraAKilogramo(inputValue)));
			
				break;
				
			case "Onza a Kilogramo": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f kilogramos",
						masaLogic.onzaAKilogramo(inputValue)));
			
				break;
				
			case "Tonelada a Kilogramo": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f kilogramos",
						masaLogic.toneladaAKilogramo(inputValue)));
			
				break;
		}
	}
	
	public void volumen(String opcion) {
		VolumenLogic volumenLogic = new VolumenLogic();
		Double inputValue = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el numero a convertir"));
		
		switch(opcion) {
			case "Litro a Galon": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f galones",
						volumenLogic.litroAGalon(inputValue)));
			
				break;
			
			case "Litro a Cuarto": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f cuartos",
						volumenLogic.litroACuarto(inputValue)));
			
				break;
		
			case "Litro a Pie cubico": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f pies cubicos",
						volumenLogic.litroAPieCubico(inputValue)));
			
				break;
				
			case "Galon a Litro": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f litros",
						volumenLogic.galonALitro(inputValue)));
			
				break;
				
			case "Cuartos a Litro": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f litros",
						volumenLogic.cuartoALitro(inputValue)));
			
				break;
				
			case "Pie cubico a Litro": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f litros",
						volumenLogic.pieCubicoALitro(inputValue)));
			
		}
	}
	
}
