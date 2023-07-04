package logic;

public class LongitudLogic {
	private final double pulgada = 0.0254;
	private final double pie = 0.3048;
	private final double yarda = 0.9144;
	private final double milla = 1609.0;
	
	private static LongitudLogic instance;
	
	private LongitudLogic() {
		
	}
	
	public static LongitudLogic getInstance() {
		if(instance == null)
			instance = new LongitudLogic();
		
		return instance;
	}
	
	public double metroAPulgada(double metros) {
		return metros / pulgada;
	}
	
	public double metroAPie(double metros) {
		return metros / pie;
	}
	
	public double metroAYarda(double metros) {
		return metros / yarda;
	}
	
	public double metroAMilla(double metros) {
		return metros / milla;
	}
	
	public double pulgadaAMetro(double pulgada) {
		return pulgada * this.pulgada;
	}
	
	public double pieAMetro(double pie) {
		return pie * this.pie;
	}
	
	public double yardaAMetro(double yarda) {
		return yarda * this.yarda;
	}
	
	public double millaAMetro(double milla) {
		return milla * this.milla;
	}
}
