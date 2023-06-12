package main;

import javax.swing.JOptionPane;

import logic.DivisaLogic;

/**
 * 
 * @author Mathias Ledesma
 * @version 1.0.0
 *
 */

public class ConversorAlura {
	
	public static void seleccionarTipoDeConversion (String opcion){
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
			break;
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
					
					seleccionarTipoDeConversion(opcion);
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
