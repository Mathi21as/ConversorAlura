package logic;

public class MassLogic {
	private final Double libra = 0.453;
	private final Double ounce = 0.028;
	/*no use la equivalencia de ton del sistema
	ingles, use la equivalencia internacional*/
	private final Double ton = 1000.0;
	
	private static MassLogic instance;
	
	private MassLogic() {}
	
	public static MassLogic getInstance() {
		if(instance == null)
			instance = new MassLogic();
		
		return instance;
	}
	
	public Double kiloToOtherWeight(String mass, Double value) {
		switch(mass) {
			case "Kilogramo": return value;
			
			case "Libra": return Double.valueOf(value / libra);
			
			case "Onza": return Double.valueOf(value / ounce);
			
			case "Tonelada": return Double.valueOf(value / ton);
			
			default: return null;
		}
	}
	
	public Double libraToOtherWeight(String mass, Double value) {
		switch(mass) {
			case "Kilogramo": return Double.valueOf(value * libra);
			
			case "Libra": return value;
			
			case "Onza": return Double.valueOf((value * libra) / ounce);
			
			case "Tonelada": return Double.valueOf((value * libra) / ton);
			
			default: return null;
		}
	}
	
	public Double ounceToOtherWeight(String mass, Double value) {
		switch(mass) {
			case "Kilogramo": return Double.valueOf(value * ounce);
			
			case "Libra": return Double.valueOf((value * ounce) / libra);
			
			case "Onza": return value;
			
			case "Tonelada": return Double.valueOf((value * ounce) / ton);
			
			default: return null;
		}
	}
	
	public Double tonToOtherWeight(String mass, Double value) {
		switch(mass) {
			case "Kilogramo": return Double.valueOf(value * ton);
			
			case "Libra": return Double.valueOf((value * ton) / libra);
			
			case "Onza": return Double.valueOf((value * ton) / ounce);
			
			case "Tonelada": return value;
			
			default: return null;
		}
	}
	
}
