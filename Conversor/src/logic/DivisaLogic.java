package logic;


public class DivisaLogic {
	//los valores asignados a las divisas son su equivalente en pesos argentinos
	private final Double dolar = 262.54;  // 483.37; //el valor corresponde al dolar blue, no al dolar convencional
	private final Double euro = 288.77;
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
	
	public Double pesoAOtraDivisa(String divisa, Double valor) {
		switch(divisa) {
			case "Dolar USD": return Double.valueOf(valor/dolar);
				
			case "Euro EUR": return Double.valueOf(valor/euro);
				
			case "Libra Esterlina GBP": return Double.valueOf(valor/libraEsterlina);
				
			case "Yen Japones JPY": return Double.valueOf(valor/yen);
			
			case "Won Coreano KRW": return Double.valueOf(valor/won);
			
			case "Peso Argentino ARS": return valor;
		}
		return null;
	}
	
	public Double dolarAOtraDivisa(String divisa, Double valor) {
		switch(divisa) {
			case "Dolar USD": return valor;
				
			case "Euro EUR": return Double.valueOf((valor*dolar)/euro);
				
			case "Libra Esterlina GBP": return Double.valueOf((valor*dolar)/libraEsterlina);
				
			case "Yen Japones JPY": return Double.valueOf((valor*dolar)/yen);
			
			case "Won Coreano KRW": return Double.valueOf((valor*dolar)/won);
			
			case "Peso Argentino ARS": return Double.valueOf(valor*dolar);
		}
		return null;
	}
	
	public Double euroAOtraDivisa(String divisa, Double valor) {
		switch(divisa) {
			case "Dolar USD": return Double.valueOf((valor*euro)/dolar);
				
			case "Euro EUR": return valor;
				
			case "Libra Esterlina GBP": return Double.valueOf((valor*euro)/libraEsterlina);
				
			case "Yen Japones JPY": return Double.valueOf((valor*euro)/yen);
			
			case "Won Coreano KRW": return Double.valueOf((valor*euro)/won);
			
			case "Peso Argentino ARS": return Double.valueOf(valor*euro);
		}
		return null;
	}
	
	public Double libraAOtraDivisa(String divisa, Double valor) {
		switch(divisa) {
			case "Dolar USD": return Double.valueOf((valor*libraEsterlina)/dolar);
				
			case "Euro EUR": return Double.valueOf((valor*libraEsterlina)/euro);
				
			case "Libra Esterlina GBP": return valor;
				
			case "Yen Japones JPY": return Double.valueOf((valor*libraEsterlina)/yen);
			
			case "Won Coreano KRW": return Double.valueOf((valor*libraEsterlina)/won);
			
			case "Peso Argentino ARS": return Double.valueOf(valor*libraEsterlina);
		}
		return null;
	}
	
	public Double yenAOtraDivisa(String divisa, Double valor) {
		switch(divisa) {
			case "Dolar USD": return Double.valueOf((valor*yen)/dolar);
				
			case "Euro EUR": return Double.valueOf((valor*yen)/euro);
				
			case "Libra Esterlina GBP": return Double.valueOf((valor*yen)/libraEsterlina);
				
			case "Yen Japones JPY": return valor;
			
			case "Won Coreano KRW": return Double.valueOf((valor*yen)/won);
			
			case "Peso Argentino ARS": return Double.valueOf(valor*yen);
		}
		return null;
	}
	
	public Double wonAOtraDivisa(String divisa, Double valor) {
		switch(divisa) {
			case "Dolar USD": return Double.valueOf((valor*won)/dolar);
				
			case "Euro EUR": return Double.valueOf((valor*won)/euro);
				
			case "Libra Esterlina GBP": return Double.valueOf((valor*won)/libraEsterlina);
				
			case "Yen Japones JPY": return Double.valueOf((valor*won)/yen);
			
			case "Won Coreano KRW": return valor;
			
			case "Peso Argentino ARS": return Double.valueOf(valor*won);
		}
		return null;
	}
	
}
