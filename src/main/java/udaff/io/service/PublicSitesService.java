package udaff.io.service;

import java.util.List;

import udaff.io.entities.CategoriaTour;
import udaff.io.entities.LugarTuristico;
import udaff.io.entities.Tour;
import udaff.io.entities.Viewagencia;
import udaff.io.entities.Vredsocial;

public interface PublicSitesService {
	public List<Viewagencia> getViewAgencia(int longitud);
	public List<CategoriaTour> getAllCategoriaTour();
	public List<LugarTuristico> getAllLugarTuristico(int longitud);
	public List<Tour> getAllTourRecientes(int longitud);

	//Datos para usar con cuenta
	public List<Vredsocial> getViewRedSocial();
}
