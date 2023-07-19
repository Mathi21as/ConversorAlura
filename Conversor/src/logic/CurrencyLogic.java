package logic;


public class CurrencyLogic {
	//los valuees asignados a las currencys son su equivalente en pesos argentinos
	private final Double dolar = 262.54;  // 483.37; //el value corresponde al dolar blue, no al dolar convencional
	private final Double euro = 288.77;
	private final Double libraEsterlina = 307.92;
	private final Double yen = 1.84;
	private final Double won = 0.19;
	
	private static CurrencyLogic instance;
	
	private CurrencyLogic() {
		
	}
	
	public static CurrencyLogic getInstance() {
		if(instance == null) 
			instance = new CurrencyLogic();
		
		return instance;
	}
	
	public Double pesoToOtherCurrency(String currency, Double value) {
		switch(currency) {
			case "Dolar USD": return Double.valueOf(value/dolar);
				
			case "Euro EUR": return Double.valueOf(value/euro);
				
			case "Libra Esterlina GBP": return Double.valueOf(value/libraEsterlina);
				
			case "Yen Japones JPY": return Double.valueOf(value/yen);
			
			case "Won Coreano KRW": return Double.valueOf(value/won);
			
			case "Peso Argentino ARS": return value;
		}
		return null;
	}
	
	public Double dolarToOtherCurrency(String currency, Double value) {
		switch(currency) {
			case "Dolar USD": return value;
				
			case "Euro EUR": return Double.valueOf((value*dolar)/euro);
				
			case "Libra Esterlina GBP": return Double.valueOf((value*dolar)/libraEsterlina);
				
			case "Yen Japones JPY": return Double.valueOf((value*dolar)/yen);
			
			case "Won Coreano KRW": return Double.valueOf((value*dolar)/won);
			
			case "Peso Argentino ARS": return Double.valueOf(value*dolar);
		}
		return null;
	}
	
	public Double euroToOtherCurrency(String currency, Double value) {
		switch(currency) {
			case "Dolar USD": return Double.valueOf((value*euro)/dolar);
				
			case "Euro EUR": return value;
				
			case "Libra Esterlina GBP": return Double.valueOf((value*euro)/libraEsterlina);
				
			case "Yen Japones JPY": return Double.valueOf((value*euro)/yen);
			
			case "Won Coreano KRW": return Double.valueOf((value*euro)/won);
			
			case "Peso Argentino ARS": return Double.valueOf(value*euro);
		}
		return null;
	}
	
	public Double libraToOtherCurrency(String currency, Double value) {
		switch(currency) {
			case "Dolar USD": return Double.valueOf((value*libraEsterlina)/dolar);
				
			case "Euro EUR": return Double.valueOf((value*libraEsterlina)/euro);
				
			case "Libra Esterlina GBP": return value;
				
			case "Yen Japones JPY": return Double.valueOf((value*libraEsterlina)/yen);
			
			case "Won Coreano KRW": return Double.valueOf((value*libraEsterlina)/won);
			
			case "Peso Argentino ARS": return Double.valueOf(value*libraEsterlina);
		}
		return null;
	}
	
	public Double yenToOtherCurrency(String currency, Double value) {
		switch(currency) {
			case "Dolar USD": return Double.valueOf((value*yen)/dolar);
				
			case "Euro EUR": return Double.valueOf((value*yen)/euro);
				
			case "Libra Esterlina GBP": return Double.valueOf((value*yen)/libraEsterlina);
				
			case "Yen Japones JPY": return value;
			
			case "Won Coreano KRW": return Double.valueOf((value*yen)/won);
			
			case "Peso Argentino ARS": return Double.valueOf(value*yen);
		}
		return null;
	}
	
	public Double wonToOtherCurrency(String currency, Double value) {
		switch(currency) {
			case "Dolar USD": return Double.valueOf((value*won)/dolar);
				
			case "Euro EUR": return Double.valueOf((value*won)/euro);
				
			case "Libra Esterlina GBP": return Double.valueOf((value*won)/libraEsterlina);
				
			case "Yen Japones JPY": return Double.valueOf((value*won)/yen);
			
			case "Won Coreano KRW": return value;
			
			case "Peso Argentino ARS": return Double.valueOf(value*won);
		}
		return null;
	}
	
}
