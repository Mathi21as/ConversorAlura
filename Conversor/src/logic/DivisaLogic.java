package logic;


public class DivisaLogic {
	//los valores asignados a las divisas son su equivalente en pesos argentinos
	private final Double dolar = 483.37; //el valor corresponde al dolar blue, no al dolar convencional
	private final Double euro = 263.34;
	private final Double libraEsterlina = 307.92;
	private final Double yen = 1.84;
	private final Double won = 0.19;
	
	private static DivisaLogic instance;
	
	private DivisaLogic() {
		
	}
	
	public static DivisaLogic getInstance() {
		if(instance == null) 
			instance = new DivisaLogic();
		
		return instance;
	}
	
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
	
	public Double pesoAOtraDivisa(String divisa, Double valor) {
		switch(divisa) {
			case "USD": return Double.valueOf(valor/dolar);
				
			case "EUR": return Double.valueOf(valor/euro);
				
			case "GBP": return Double.valueOf(valor/libraEsterlina);
				
			case "JPY": return Double.valueOf(valor/yen);
			
			case "KRW": return Double.valueOf(valor/won);
			
			case "ARS": return valor;
		}
		return null;
	}
	
	public Double dolarAOtraDivisa(String divisa, Double valor) {
		switch(divisa) {
			case "USD": return valor;
				
			case "EUR": return Double.valueOf(valor/euro);
				
			case "GBP": return Double.valueOf((valor*dolar)/libraEsterlina);
				
			case "JPY": return Double.valueOf((valor*dolar)/yen);
			
			case "KRW": return Double.valueOf((valor*dolar)/won);
			
			case "ARS": return Double.valueOf(valor*dolar);
		}
		return null;
	}
	
	public Double euroAOtraDivisa(String divisa, Double valor) {
		switch(divisa) {
			case "USD": return Double.valueOf((valor*euro)/dolar);
				
			case "EUR": return valor;
				
			case "GBP": return Double.valueOf((valor*euro)/libraEsterlina);
				
			case "JPY": return Double.valueOf((valor*euro)/yen);
			
			case "KRW": return Double.valueOf((valor*euro)/won);
			
			case "ARS": return Double.valueOf(valor*euro);
		}
		return null;
	}
	
	public Double libraAOtraDivisa(String divisa, Double valor) {
		switch(divisa) {
			case "USD": return Double.valueOf((valor*libraEsterlina)/dolar);
				
			case "EUR": return Double.valueOf((valor*libraEsterlina)/euro);
				
			case "GBP": return valor;
				
			case "JPY": return Double.valueOf((valor*libraEsterlina)/yen);
			
			case "KRW": return Double.valueOf((valor*libraEsterlina)/won);
			
			case "ARS": return Double.valueOf(valor*libraEsterlina);
		}
		return null;
	}
	
	public Double yenAOtraDivisa(String divisa, Double valor) {
		switch(divisa) {
			case "USD": return Double.valueOf((valor*yen)/dolar);
				
			case "EUR": return Double.valueOf((valor*yen)/euro);
				
			case "GBP": return Double.valueOf((valor*yen)/libraEsterlina);
				
			case "JPY": return valor;
			
			case "KRW": return Double.valueOf((valor*yen)/won);
			
			case "ARS": return Double.valueOf(valor*yen);
		}
		return null;
	}
	
	public Double wonAOtraDivisa(String divisa, Double valor) {
		switch(divisa) {
			case "USD": return Double.valueOf((valor*won)/dolar);
				
			case "EUR": return Double.valueOf((valor*won)/euro);
				
			case "GBP": return Double.valueOf((valor*won)/libraEsterlina);
				
			case "JPY": return Double.valueOf((valor*won)/yen);
			
			case "KRW": return valor;
			
			case "ARS": return Double.valueOf(valor*won);
		}
		return null;
	}
	
}
