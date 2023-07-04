package logic;

public class VolumenLogic {
	private final double galon = 3.785;
	private final double cuarto = 0.946;
	private final double pieCubico = 28.32;
	
	private static VolumenLogic instance;
	
	private VolumenLogic() {
		
	}
	
	public static VolumenLogic getInstance() {
		if(instance == null)
			instance = new VolumenLogic();
		
		return instance;
	}
	
	public double litroAGalon(double litro) {
		return litro / galon;
	}
	
	public double litroACuarto(double litro) {
		return litro / cuarto;
	}
	
	public double litroAPieCubico(double litro) {
		return litro /pieCubico;
	}
	
	public double galonALitro(double galon) {
		return galon * this.galon;
	}
	
	public double cuartoALitro(double cuarto) {
		return cuarto * this.cuarto;
	}
	
	public double pieCubicoALitro(double pieCubico) {
		return pieCubico * this.pieCubico;
	}
	
}
