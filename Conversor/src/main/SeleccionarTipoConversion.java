package main;

import javax.swing.JOptionPane;

import logic.DivisaLogic;
import logic.LongitudLogic;
import logic.MasaLogic;
import logic.TemperaturaLogic;
import logic.VolumenLogic;

public class SeleccionarTipoConversion {
	
	private Double inputValue;
	
	static public Double entradaYValidacion() {
		String inputToValidate = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir:");
		
		if(inputToValidate.substring(0).matches("[0-9].*")) {
			return Double.parseDouble(inputToValidate);
		}
		else {
			return null;
		}
		
	}
	
	public void divisa (String opcion){
		DivisaLogic divisaLogic = DivisaLogic.getInstance();
		this.inputValue = entradaYValidacion();
		
		if(this.inputValue == null){
			JOptionPane.showMessageDialog(
					null, 
					"Valor ingresado no valido, solo se admiten numeros.", 
					"Error", 
					0);
			return;
		}
		
		switch(opcion) {
		case "Pesos a Dolares": JOptionPane.showMessageDialog(
				null,
				String.format(
						"%.2f pesos equivalen a %.2f dolares",
						this.inputValue,
						divisaLogic.pesoADolar(this.inputValue)));
		
			break;
		
		case "Pesos a Euros": JOptionPane.showMessageDialog(
				null,
				String.format(
						"%.2f pesos equivalen a %.2f euros",
						this.inputValue,
						divisaLogic.pesoAEuro(this.inputValue)));
		
			break;
		
		case "Pesos a Libras Esterlinas": JOptionPane.showMessageDialog(
				null,
				String.format(
						"%.2f pesos equivalen a %.2f libras esterlinas",
						this.inputValue,
						divisaLogic.pesoALibraEsterlina(this.inputValue)));
		
			break;
			
		case "Pesos a Yen": JOptionPane.showMessageDialog(
				null,
				String.format(
						"%.2f pesos equivalen a %.2f yenes",
						this.inputValue,
						divisaLogic.pesoAYen(this.inputValue)));
		
			break;
			
		case "Pesos a Won Coreano": JOptionPane.showMessageDialog(
				null,
				String.format(
						"%.2f pesos equivalen a %.2f won coreano",
						this.inputValue,
						divisaLogic.pesoAWon(this.inputValue)));
		
			break;
			
		case "Dolares a Pesos": JOptionPane.showMessageDialog(
				null,
				String.format(
						"%.2f dolares equivalen a %.2f pesos",
						this.inputValue,
						divisaLogic.dolarAPeso(this.inputValue)));
		
			break;
			
		case "Euros a Pesos": JOptionPane.showMessageDialog(
				null,
				String.format(
						"%.2f euros equivalen a %.2f pesos",
						this.inputValue,
						divisaLogic.euroAPeso(this.inputValue)));
		
			break;
			
		case "Libras Esterlinas a Pesos": JOptionPane.showMessageDialog(
				null,
				String.format(
						"%.2f libras esterlinas equivalen a %.2f pesos",
						this.inputValue,
						divisaLogic.libraEsterlinaAPeso(this.inputValue)));
		
			break;
			
		case "Yen a Pesos": JOptionPane.showMessageDialog(
				null,
				String.format(
						"%.2f yenes equivalen a %.2f pesos",
						this.inputValue,
						divisaLogic.yenAPeso(this.inputValue)));
		
			break;
			
		case "Won Coreano a Pesos": JOptionPane.showMessageDialog(
				null,
				String.format(
						"%.2f won coreano equivalen a %.2f pesos",
						this.inputValue,
						divisaLogic.wonAPeso(this.inputValue)));
		}
				
	}
	
	public void temperatura(String opcion) {
		TemperaturaLogic temperaturaLogic = TemperaturaLogic.getInstance();
		this.inputValue = entradaYValidacion();
		
		if(this.inputValue == null){
			JOptionPane.showMessageDialog(
					null, 
					"Valor ingresado no valido, solo se admiten numeros.", 
					"Error", 
					0);
			return;
		}
		
		switch(opcion) {
			case "Celsius a Farenheit": JOptionPane.showMessageDialog(
				null,
				String.format(
					"%.2f°C equivalen a %.2f°F",
					this.inputValue,
					temperaturaLogic.conversionFarenheit(this.inputValue, "celsiusAFarenheit")));
			
				break;
				
			case "Farenheit a Celsius": JOptionPane.showMessageDialog(
				null,
				String.format(
					"%.1f°F equivalen a %.1f°C",
					this.inputValue,
					temperaturaLogic.conversionFarenheit(this.inputValue, "farenheitACelsius")));

				break;
				
			case "Kelvin a Celsius": JOptionPane.showMessageDialog(
				null,
				String.format(
					"%.1f°K equivalen a %.1f°C",
					this.inputValue,
					temperaturaLogic.kelvinACelsius(this.inputValue)));

				break;
				
			case "Celsius a Kelvin": JOptionPane.showMessageDialog(
				null,
				String.format(
					"%.1f°C equivalen a %.1f°K",
					this.inputValue,
					temperaturaLogic.celsiusAKelvin(this.inputValue)));
			
		}
	}
	
	public void longitud(String opcion) {
		LongitudLogic longitudLogic = LongitudLogic.getInstance();
		this.inputValue = entradaYValidacion();
		
		if(this.inputValue == null){
			JOptionPane.showMessageDialog(
					null, 
					"Valor ingresado no valido, solo se admiten numeros.", 
					"Error", 
					0);
			return;
		}
		
		switch(opcion) {
			case "Metro a Pulgada": JOptionPane.showMessageDialog(
				null,
				String.format(
					"El resultado de la conversion es: %.2f  pulgadas",
					longitudLogic.metroAPulgada(this.inputValue)));
			
				break;
				
			case "Metro a Pie": JOptionPane.showMessageDialog(
				null,
				String.format(
					"El resultado de la conversion es: %.2f pies",
					longitudLogic.metroAPie(this.inputValue)));

				break;
				
			case "Metro a Yarda": JOptionPane.showMessageDialog(
				null,
				String.format(
					"El resultado de la conversion es: %.2f yardas",
					longitudLogic.metroAYarda(this.inputValue)));

				break;
				
			case "Metro a Milla": JOptionPane.showMessageDialog(
				null,
				String.format(
					"El resultado de la conversion es: %.2f millas",
					longitudLogic.metroAMilla(this.inputValue)));
			
			case "Pulgada a Metro": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f metros",
						longitudLogic.pulgadaAMetro(this.inputValue)));

					break;
			
			case "Pie a Metro": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f metros",
						longitudLogic.pieAMetro(this.inputValue)));

					break;
					
			case "Yarda a Metro": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f metros",
						longitudLogic.yardaAMetro(this.inputValue)));

					break;
					
			case "Milla a Metro": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f metros",
						longitudLogic.millaAMetro(this.inputValue)));

		}
	}
	
	public void masa(String opcion) {
		MasaLogic masaLogic = MasaLogic.getInstance();
		this.inputValue = entradaYValidacion();
		
		if(this.inputValue == null){
			JOptionPane.showMessageDialog(
					null, 
					"Valor ingresado no valido, solo se admiten numeros.", 
					"Error", 
					0);
			return;
		}
		
		switch(opcion) {
			case "Kilogramo a Libra": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f libras",
						masaLogic.kilogramoALibra(this.inputValue)));
			
				break;
				
			case "Kilogramo a Onza": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f onzas",
						masaLogic.kilogramoAOnza(this.inputValue)));
			
				break;
				
			case "Kilogramo a Tonelada": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f toneladas",
						masaLogic.kilogramoATonelada(this.inputValue)));
			
				break;
				
			case "Libra a Kilogramo": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f kilogramos",
						masaLogic.libraAKilogramo(this.inputValue)));
			
				break;
				
			case "Onza a Kilogramo": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f kilogramos",
						masaLogic.onzaAKilogramo(this.inputValue)));
			
				break;
				
			case "Tonelada a Kilogramo": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f kilogramos",
						masaLogic.toneladaAKilogramo(this.inputValue)));
			
				break;
		}
	}
	
	public void volumen(String opcion) {
		VolumenLogic volumenLogic = VolumenLogic.getInstance();
		this.inputValue = entradaYValidacion();
		
		if(this.inputValue == null){
			JOptionPane.showMessageDialog(
					null, 
					"Valor ingresado no valido, solo se admiten numeros.", 
					"Error", 
					0);
			return;
		}
		
		switch(opcion) {
			case "Litro a Galon": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f galones",
						volumenLogic.litroAGalon(this.inputValue)));
			
				break;
			
			case "Litro a Cuarto": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f cuartos",
						volumenLogic.litroACuarto(this.inputValue)));
			
				break;
		
			case "Litro a Pie cubico": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f pies cubicos",
						volumenLogic.litroAPieCubico(this.inputValue)));
			
				break;
				
			case "Galon a Litro": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f litros",
						volumenLogic.galonALitro(this.inputValue)));
			
				break;
				
			case "Cuartos a Litro": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f litros",
						volumenLogic.cuartoALitro(this.inputValue)));
			
				break;
				
			case "Pie cubico a Litro": JOptionPane.showMessageDialog(
					null,
					String.format(
						"El resultado de la conversion es: %.2f litros",
						volumenLogic.pieCubicoALitro(this.inputValue)));
			
		}
	}
	
}
