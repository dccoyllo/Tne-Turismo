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
 * CantidaReservarcion generated by hbm2java
 */
@Entity
@Table(name = "cantida_reservarcion", catalog = "turismo_bd")
public class CantidaReservarcion implements java.io.Serializable {

	private int idCantidadReservacion;
	private Tour tour;
	private float total;
	private float disponible;

	public CantidaReservarcion() {
	}

	public CantidaReservarcion(int idCantidadReservacion, Tour tour, float total, float disponible) {
		this.idCantidadReservacion = idCantidadReservacion;
		this.tour = tour;
		this.total = total;
		this.disponible = disponible;
	}

	@Id

	@Column(name = "id_cantidad_reservacion", unique = true, nullable = false)
	public int getIdCantidadReservacion() {
		return this.idCantidadReservacion;
	}

	public void setIdCantidadReservacion(int idCantidadReservacion) {
		this.idCantidadReservacion = idCantidadReservacion;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tour", nullable = false)
	public Tour getTour() {
		return this.tour;
	}

	public void setTour(Tour tour) {
		this.tour = tour;
	}

	@Column(name = "total", nullable = false, precision = 12, scale = 0)
	public float getTotal() {
		return this.total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	@Column(name = "disponible", nullable = false, precision = 12, scale = 0)
	public float getDisponible() {
		return this.disponible;
	}

	public void setDisponible(float disponible) {
		this.disponible = disponible;
	}

}
