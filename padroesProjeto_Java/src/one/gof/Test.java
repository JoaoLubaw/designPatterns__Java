package one.gof;

import one.gof.facade.Facade;
import one.gof.singleton.SingletonEager;
import one.gof.singleton.SingletonLazy;
import one.gof.singleton.SingletonLazyHolder;

import one.gof.strategy.Comportamento;
import one.gof.strategy.ComportamentoAgressivo;
import one.gof.strategy.ComportamentoDefensivo;
import one.gof.strategy.ComportamentoNormal;
import one.gof.strategy.Robo;


public class Test {
	
	public static void main(String[] args) {
		
		// Singleton 
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyholder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyholder);
		lazyholder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyholder);
		
		// Strategy
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setStrategy(normal);
		robo.mover();
		robo.mover();
		robo.setStrategy(agressivo);
		robo.mover();
		robo.mover();
		robo.setStrategy(defensivo);
		robo.mover();
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("João", "89108000");
		
		                                                                                                                               
		
	}
}
