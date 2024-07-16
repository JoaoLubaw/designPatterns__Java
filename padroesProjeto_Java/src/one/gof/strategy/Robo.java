package one.gof.strategy;

public class Robo {

	private Comportamento strategy;
	
	public void setStrategy(Comportamento comportamento) {
		this.strategy = comportamento; 
	}
	
	public void mover() {
		strategy.mover();
	}
}
