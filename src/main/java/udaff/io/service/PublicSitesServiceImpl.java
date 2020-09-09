package udaff.io.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import udaff.io.dao.PublicSitesDao;
import udaff.io.entities.CategoriaTour;
import udaff.io.entities.LugarTuristico;
import udaff.io.entities.Tour;
import udaff.io.entities.Viewagencia;
import udaff.io.entities.Vredsocial;

@Service
@Transactional
public class PublicSitesServiceImpl implements PublicSitesService{
	@Autowired
	private PublicSitesDao publicSitesDao;

	@Override
	public List<Viewagencia> getViewAgencia(int longitud) {
		// TODO Auto-generated method stub
		return publicSitesDao.getViewAgencia(longitud);
	}

	@Override
	public List<CategoriaTour> getAllCategoriaTour() {
		// TODO Auto-generated method stub
		return publicSitesDao.getAllCategoriaTour();
	}

	@Override
	public List<LugarTuristico> getAllLugarTuristico(int longitud) {
		// TODO Auto-generated method stub
		return publicSitesDao.getAllLugarTuristico(longitud);
	}

	@Override
	public List<Tour> getAllTourRecientes(int longitud) {
		// TODO Auto-generated method stub
		return publicSitesDao.getAllTourRecientes(longitud);
	}

	@Override
	public List<Vredsocial> getViewRedSocial() {
		// TODO Auto-generated method stub
		return publicSitesDao.getViewRedSocial();
	}

}
