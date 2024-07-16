package one.gof.facade;

import one.gof.subsistema1.crm.CrmService;
import one.gof.subsistema2.cep.CepApi;

public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);

		CrmService.gravarCliente(nome, cep, estado, cidade);
	}
}
