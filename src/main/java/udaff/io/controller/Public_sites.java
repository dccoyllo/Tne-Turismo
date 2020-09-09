package udaff.io.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import udaff.io.entities.CategoriaTour;
import udaff.io.entities.LugarTuristico;
import udaff.io.entities.TipoRedSocial;
import udaff.io.entities.Tour;
import udaff.io.entities.UserAgencia;
import udaff.io.entities.Viewagencia;
import udaff.io.entities.Vredsocial;
import udaff.io.service.PublicSitesService;

@Controller
public class Public_sites {
	@Autowired
	private PublicSitesService publicSitesService;
	
	@GetMapping("/")
	@ResponseBody
	public String getIndex() {
		return "<h2 style='color:red;'>El server está activado</h2>"
				+ "<h5>para más información contactarse con el administrador</h5>";
	}
	
	//vista de agencias
	@GetMapping("/age")
	@ResponseBody
	public List<Viewagencia> agencia(@RequestParam int len) {
		List<Viewagencia> vagencia = publicSitesService.getViewAgencia(len);
		
		return vagencia;
	}
	
	//vista de categorias
	@GetMapping("/cate")
	@ResponseBody
	public List<CategoriaTour> categoria() {
		List<CategoriaTour> categoriaTour = publicSitesService.getAllCategoriaTour();
		return categoriaTour;
	}
	
	//vista de lugares turisticos
	@GetMapping("/ltours")
	@ResponseBody
	public List<LugarTuristico> lugar_turistico(@RequestParam int len) {
		List<LugarTuristico> lugarTuristico = publicSitesService.getAllLugarTuristico(len);
		
		return lugarTuristico;
	}
	
	//vista de tours recientes
	@GetMapping("/tours")
	@ResponseBody
	public List<Tour> tourRecientes(@RequestParam int len) {
		List<Tour> tour = publicSitesService.getAllTourRecientes(len);
		return tour;
	}
	
	//vista de tipo red social
	@GetMapping("/tiposocial")
	@ResponseBody
	public List<Vredsocial> tipoRedSocial() {
		List<Vredsocial> vredsocial = publicSitesService.getViewRedSocial();
		return vredsocial;
	}
	
	//vista de busqueda
	@GetMapping("/result")
	public String search() {
		
		return "";
	}
	

}
