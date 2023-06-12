package logic;

public class DivisaLogic {
	//los valores asignados a las divisas son su equivalente en pesos argentinos
	private final double dolar = 483.37; //el valor corresponde al dolar blue, no al dolar convencional
	private final double euro = 263.34;
	private final double libraEsterlina = 307.92;
	private final double yen = 1.76;
	private final double won = 0.19;
	
	//Funciones para convertir de pesos a otra divisa
	public double pesoADolar(double pesos) {
		return pesos/dolar;
	}
	
	public double pesoAEuro(double pesos) {
		return pesos/euro;
	}
	
	public double pesoALibraEsterlina(double pesos) {
		return pesos/libraEsterlina;
	}
	
	public double pesoAYen(double pesos) {
		return pesos/yen;
	}
	
	public double pesoAWon(double pesos) {
		return pesos/won;
	}
	
	//Funcion para convertir de una divisa a pesos
	public double dolarAPeso(double divisa) {
		return divisa*dolar;
	}
	
	public double euroAPeso(double divisa) {
		return divisa*euro;
	}
	
	public double libraEsterlinaAPeso(double divisa) {
		return divisa*libraEsterlina;
	}
	
	public double yenAPeso(double divisa) {
		return divisa*yen;
	}
	
	public double wonAPeso(double divisa) {
		return divisa*won;
	}
}
