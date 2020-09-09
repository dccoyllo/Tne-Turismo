package udaff.io.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import udaff.io.entities.CategoriaTour;
import udaff.io.entities.LugarTuristico;
import udaff.io.entities.Tour;
import udaff.io.entities.Viewagencia;
import udaff.io.entities.Vredsocial;

@Repository
public class PublicSitesDaoImpl implements PublicSitesDao{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Viewagencia> getViewAgencia(int longitud) {
		// TODO Auto-generated method stub
		return em.createQuery("From Viewagencia", Viewagencia.class).setMaxResults(longitud).getResultList();
	}

	@Override
	public List<CategoriaTour> getAllCategoriaTour() {
		// TODO Auto-generated method stub
		return em.createQuery("From CategoriaTour", CategoriaTour.class).getResultList();
	}

	@Override
	public List<LugarTuristico> getAllLugarTuristico(int longitud) {
		// TODO Auto-generated method stub
		return em.createQuery("From LugarTuristico", LugarTuristico.class).setMaxResults(longitud).getResultList();
	}

	@Override
	public List<Tour> getAllTourRecientes(int longitud) {
		// TODO Auto-generated method stub
		return em.createQuery("From Tour", Tour.class).setMaxResults(longitud).getResultList();
	}

	@Override
	public List<Vredsocial> getViewRedSocial(){
		// TODO Auto-generated method stub
		return em.createQuery("From Vredsocial", Vredsocial.class).getResultList();
	}

}
