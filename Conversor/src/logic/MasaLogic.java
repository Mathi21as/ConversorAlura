package logic;

public class MasaLogic {
	private final double libra = 0.453;
	private final double onza = 0.028;
	/*no use la equivalencia de tonelada del sistema
	ingles, use la equivalencia internacional*/
	private final double tonelada = 1000.0;
	
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
	
}
