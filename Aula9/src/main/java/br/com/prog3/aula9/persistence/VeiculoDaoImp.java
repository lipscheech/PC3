package br.com.prog3.aula9.persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.prog3.aula9.model.Veiculo;
import br.com.prog3.aula9.util.HibernateUtil;

public class VeiculoDaoImp implements VeiculoDao{
	
	private Session session;

	@Override
	public void incluir(Veiculo veiculo) {
		// TODO Auto-generated method stub
		session = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(veiculo);
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			if(session != null) {
				session.getTransaction().rollback();
			}
			e.printStackTrace();
		}finally {
			if(session != null) {
				session.close();
			}
		}
	}

	@Override
	public void alterar(Veiculo veiculo) {
		// TODO Auto-generated method stub
		
		session = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.update(veiculo);
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			if(session != null) {
				session.getTransaction().rollback();
			}
			e.printStackTrace();
		} finally {
			if(session != null) {
				session.close();
			}
		}
		
	}

	@Override
	public void excluir(Veiculo veiculo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Veiculo> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Veiculo buscarPelaPlaca(String placa) {
		// TODO Auto-generated method stub
		return null;
	}

}
