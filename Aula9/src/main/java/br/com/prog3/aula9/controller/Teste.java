package br.com.prog3.aula9.controller;

import br.com.prog3.aula9.model.Veiculo;


public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HibernateUtil.getSessionFactory();
		Veiculo v = new Veiculo();
		VeiculoController vc = new VeiculoController();
		
		v.setPlaca("JIB4590");
		v.setAnoFabricacao(2015);
		v.setAnoModelo(2016);
		v.setCor("Azul");
		vc.alterar(v);

	}

}
