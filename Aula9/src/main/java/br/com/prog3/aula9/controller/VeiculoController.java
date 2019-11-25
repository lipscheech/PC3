package br.com.prog3.aula9.controller;

import br.com.prog3.aula9.model.Veiculo;
import br.com.prog3.aula9.persistence.VeiculoDaoImp;

public class VeiculoController {
	
	public void inclui(Veiculo veiculo) {
		VeiculoDaoImp vd = new VeiculoDaoImp();
		vd.incluir(veiculo);
	}
	
	public void alterar (Veiculo veiculo) {
		VeiculoDaoImp vd = new VeiculoDaoImp();
		vd.alterar(veiculo);
	}

}
