package logic;


public class LengthLogic {
	
	private final Double inch = 0.0254;
	private final Double foot = 0.3048;
	private final Double yard = 0.9144;
	private final Double mile = 1609.0;
	
	private static LengthLogic instance;
	
	private LengthLogic() {
		
	}
	
	public static LengthLogic getInstance() {
		if(instance == null)
			instance = new LengthLogic();
		
		return instance;
	}
	
	public Double meterToOtherLength(String length, Double value) {
		switch(length) {
			case "Metro" : return value;
			
			case "Pulgada": return value/inch;
			
			case "Pie": return value/foot;
			
			case "Yarda": return value/yard;
			
			case "Milla": return value/mile;
			
			default: return null;
		}
	}
	
	public Double inchToOtherLength(String length, Double value) {
		switch(length) {
			case "Metro" : return value * inch;
			
			case "Pulgada": return value;
			
			case "Pie": return (value*inch)/foot;
			
			case "Yarda": return (value*inch)/yard;
			
			case "Milla": return (value*inch)/mile;
			
			default: return null;
		}
	}
	
	public Double footToOtherLength(String length, Double value) {
		switch(length) {
			case "Metro" : return value * foot;
			
			case "Pulgada": return (value*foot)/inch;
			
			case "Pie": return value;
			
			case "Yarda": return (value*foot)/yard;
			
			case "Milla": return (value*foot)/mile;
			
			default: return null;
		}
	}
	
	public Double yardToOtherLength(String length, Double value) {
		switch(length) {
			case "Metro" : return value * yard;
			
			case "Pulgada": return (value*yard)/inch;
			
			case "Pie": return (value*yard)/foot;
			
			case "Yarda": return value;
			
			case "Milla": return (value*yard)/mile;
			
			default: return null;
		}
	}
	
	public Double mileToOtherLength(String length, Double value) {
		switch(length) {
			case "Metro" : return value * mile;
			
			case "Pulgada": return Double.valueOf((value*mile)/inch);
			
			case "Pie": return Double.valueOf((value*mile)/foot);
			
			case "Yarda": return Double.valueOf((value*mile)/yard);
			
			case "Milla": return value;
			
			default: return null;
		}
	}
	
}
