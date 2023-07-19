package logic;

public class VolumeLogic {
	private final Double gallon = 3.785;
	private final Double cuarto = 0.946;
	private final Double cubicFoot = 28.32;
	
	private static VolumeLogic instance;
	
	private VolumeLogic() {
		
	}
	
	public static VolumeLogic getInstance() {
		if(instance == null)
			instance = new VolumeLogic();
		
		return instance;
	}
	
	public Double literToOtherVolume (String volume, Double value) {
		switch(volume) {
			case "Litro" : return value;
			
			case "Galon": return value / gallon;
			
			case "Cuarto": return value / cuarto;
			
			case "Pie Cubico": return value / cubicFoot;
		
			default: return null;
		}
	}
	
	public Double gallonToOtherVolume (String volume, Double value) {
		switch(volume) {
			case "Litro" : return value * gallon;
			
			case "Galon": return value;
			
			case "Cuarto": return (value / gallon) * cuarto;
			
			case "Pie Cubico": return (value * gallon) / cubicFoot;
		
			default: return null;
		}
	}
	
	public Double cuartoToOtherVolume (String volume, Double value) {
		switch(volume) {
			case "Litro" : return value * cuarto;
			
			case "Galon": return value / gallon * cuarto;
			
			case "Cuarto": return value;
			
			case "Pie Cubico": return value / cubicFoot * cuarto;
		
			default: return null;
		}
	}
	
	public Double cubicFootToOtherVolume (String volume, Double value) {
		switch(volume) {
			case "Litro" : return value * cubicFoot;
			
			case "Galon": return value / gallon * cubicFoot;
			
			case "Cuarto": return value / cuarto * cubicFoot;
			
			case "Pie Cubico": return value;
		
			default: return null;
		}
	}
}
