package br.com.prog3.aula9.persistence;

import java.util.List;

import org.hibernate.Session;

import br.com.prog3.aula9.model.Multa;
import br.com.prog3.aula9.model.Veiculo;

public class MultaDaoImp implements MultaDao{
	
	private Session session;

	@Override
	public void incluir(Multa multa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Multa multa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Multa multa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Multa> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Multa buscarPeloCodigo(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Multa> buscarPeloVeiculo(Veiculo veiculo) {
		// TODO Auto-generated method stub
		return null;
	}

}
