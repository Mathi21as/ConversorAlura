package main;

import javax.swing.JOptionPane;

import logic.DivisaLogic;
import logic.LongitudLogic;
import logic.TemperaturaLogic;

/**
 * 
 * @author Mathias Ledesma
 * @version 1.0.0
 *
 */


public class ConversorAlura {

	public static void main(String[] args) {
		SeleccionarTipoConversion seleccionarTipoConversion = 
				new SeleccionarTipoConversion();
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
		String opcionesLongitud[] = {
				"Metro a Pulgada",
				"Metro a Pie",
				"Metro a Yarda",
				"Metro a Milla",
				"Pulgada a Metro",
				"Pie a Metro",
				"Yarda a Metro",
				"Milla a Metro"};
		String opciones[] = {
				"Conversor de divisa",
				"Conversor de temperatura",
				"Conversor de longitud",
				"Conversor de masa",
				"Conversor de volumen",
				"Conversor de tamano de datos"};
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
						seleccionarTipoConversion.divisa(opcion);
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
						seleccionarTipoConversion.temperatura(opcion);
				}
					break;
				
				case "Conversor de longitud": {
					opcion = (String) JOptionPane.showInputDialog(
							null,
							"Elija una opcion",
							"Menu",
							JOptionPane.DEFAULT_OPTION,
							null,
							opcionesLongitud,
							opcionesLongitud[0]);
					
					if(opcion != null)
						seleccionarTipoConversion.longitud(opcion);
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
