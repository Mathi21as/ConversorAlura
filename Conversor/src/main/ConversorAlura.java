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
 * NOTA: En los switch de la clase SeleccionarTipoConversion no 
 * coloque un caso por defecto (default) ya que no es posible que 
 * en el uso del programa se ingrese una opcion diferente a las 
 * pretederminadas y el default estaria de mas.
 *
 */


public class ConversorAlura {
	
	static public void cerrarPrograma() {
		if(JOptionPane.showConfirmDialog(
				null, 
				"Desea continuar?", 
				"Seleccione una opcion", 
				0
				) == 1) {
			JOptionPane.showMessageDialog(
					null, 
					"Programa terminado", 
					"Cerrando...", 
					1);
			System.exit(0);
		}
	}

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
		String opcionesMasa[] = {
				"Libra a Kilogramo",
				"Onza a Kilogramo",
				"Tonelada a Kilogramo",
				"Kilogramo a Libra",
				"Kilogramo a Onza",
				"Kilogramo a Tonelada",};
		String opcionesVolumen[] = {
				"Litro a Galon",
				"Litro a Cuarto",
				"Litro a Pie cubico",
				"Galon a Litro",
				"Cuarto a Litro",
				"Pie cubico a Litro"};
		String opciones[] = {
				"Conversor de divisa",
				"Conversor de temperatura",
				"Conversor de longitud",
				"Conversor de masa",
				"Conversor de volumen"};
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
					
					cerrarPrograma();
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
					
					cerrarPrograma();
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
					
					cerrarPrograma();
				}
					break;
					
				case "Conversor de masa": {
					opcion = (String) JOptionPane.showInputDialog(
							null,
							"Elija una opcion",
							"Menu",
							JOptionPane.DEFAULT_OPTION,
							null,
							opcionesMasa,
							opcionesMasa[0]);
					
					if(opcion != null)
						seleccionarTipoConversion.masa(opcion);
					
					cerrarPrograma();
				}
					break;
					
				case "Conversor de volumen": {
					opcion = (String) JOptionPane.showInputDialog(
							null,
							"Elija una opcion",
							"Menu",
							JOptionPane.DEFAULT_OPTION,
							null,
							opcionesVolumen,
							opcionesVolumen[0]);
					
					if(opcion != null)
						seleccionarTipoConversion.volumen(opcion);
					
					cerrarPrograma();
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
