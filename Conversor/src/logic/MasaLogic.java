package logic;

public class MasaLogic {
	private final Double libra = 0.453;
	private final Double onza = 0.028;
	/*no use la equivalencia de tonelada del sistema
	ingles, use la equivalencia internacional*/
	private final Double tonelada = 1000.0;
	
	private static MasaLogic instance;
	
	private MasaLogic() {
		
	}
	
	public static MasaLogic getInstance() {
		if(instance == null)
			instance = new MasaLogic();
		
		return instance;
	}
	
	public double kilogramoALibra(double kilogramo) {
		return kilogramo / libra;
	}
	
	public double kilogramoAOnza(double kilogramo) {
		return kilogramo / onza;
	}
	
	public double kilogramoATonelada(double kilogramo) {
		return kilogramo * tonelada;
	}
	
	public double libraAKilogramo(double libra) {
		return libra * this.libra;
	}
	
	public double onzaAKilogramo(double onza) {
		return onza * this.onza;
	}
	
	public double toneladaAKilogramo(double tonelada) {
		return tonelada / this.tonelada;
	}
	
	public Double kiloAOtroPeso(String masa, Double valor) {
		switch(masa) {
			case "Kilogramo": return valor;
			
			case "Libra": return Double.valueOf(valor / libra);
			
			case "Onza": return Double.valueOf(valor / onza);
			
			case "Tonelada": return Double.valueOf(valor / tonelada);
		}
		return null;
	}
	
	public Double libraAOtroPeso(String masa, Double valor) {
		switch(masa) {
			case "Kilogramo": return Double.valueOf(valor / libra);
			
			case "Libra": return valor;
			
			case "Onza": return Double.valueOf((valor * libra) / onza);
			
			case "Tonelada": return Double.valueOf((valor * libra) / tonelada);
		}
		return null;
	}
	
	public Double onzaAOtroPeso(String masa, Double valor) {
		switch(masa) {
			case "Kilogramo": return Double.valueOf(valor / onza);
			
			case "Libra": return Double.valueOf((valor * onza) / libra);
			
			case "Onza": return valor;
			
			case "Tonelada": return Double.valueOf((valor * onza) / tonelada);
		}
		return null;
	}
	
	public Double toneladaAOtroPeso(String masa, Double valor) {
		switch(masa) {
			case "Kilogramo": return Double.valueOf(valor * tonelada);
			
			case "Libra": return Double.valueOf((valor * tonelada) / libra);
			
			case "Onza": return Double.valueOf((valor * tonelada) / onza);
			
			case "Tonelada": return valor;
		}
		return null;
	}
	
}
