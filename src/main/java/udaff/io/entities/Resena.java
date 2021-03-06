package udaff.io.entities;
// Generated 08-sep-2020 16:12:38 by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Resena generated by hbm2java
 */
@Entity
@Table(name = "resena", catalog = "turismo_bd")
public class Resena implements java.io.Serializable {

	private int idResena;
	private Tour tour;
	private String descripcion;
	private int estrellas;

	public Resena() {
	}

	public Resena(int idResena, Tour tour, String descripcion, int estrellas) {
		this.idResena = idResena;
		this.tour = tour;
		this.descripcion = descripcion;
		this.estrellas = estrellas;
	}

	@Id

	@Column(name = "id_resena", unique = true, nullable = false)
	public int getIdResena() {
		return this.idResena;
	}

	public void setIdResena(int idResena) {
		this.idResena = idResena;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tour", nullable = false)
	public Tour getTour() {
		return this.tour;
	}

	public void setTour(Tour tour) {
		this.tour = tour;
	}

	@Column(name = "descripcion", nullable = false, length = 500)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "estrellas", nullable = false)
	public int getEstrellas() {
		return this.estrellas;
	}

	public void setEstrellas(int estrellas) {
		this.estrellas = estrellas;
	}

}
