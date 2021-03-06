package udaff.io.entities;
// Generated 08-sep-2020 16:12:38 by Hibernate Tools 5.2.12.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Reservacion generated by hbm2java
 */
@Entity
@Table(name = "reservacion", catalog = "turismo_bd")
public class Reservacion implements java.io.Serializable {

	private int idReservacion;
	private Tour tour;
	private String dni;
	private String nombre;
	private String apellido;
	private int edad;
	private Date fechaPartida;
	private Date fechaReservacion;
	private int cantidad;

	public Reservacion() {
	}

	public Reservacion(int idReservacion, Tour tour, String dni, String nombre, String apellido, int edad,
			Date fechaPartida, Date fechaReservacion, int cantidad) {
		this.idReservacion = idReservacion;
		this.tour = tour;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fechaPartida = fechaPartida;
		this.fechaReservacion = fechaReservacion;
		this.cantidad = cantidad;
	}

	@Id

	@Column(name = "id_reservacion", unique = true, nullable = false)
	public int getIdReservacion() {
		return this.idReservacion;
	}

	public void setIdReservacion(int idReservacion) {
		this.idReservacion = idReservacion;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tour", nullable = false)
	public Tour getTour() {
		return this.tour;
	}

	public void setTour(Tour tour) {
		this.tour = tour;
	}

	@Column(name = "dni", nullable = false, length = 8)
	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Column(name = "nombre", nullable = false, length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "apellido", nullable = false, length = 45)
	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Column(name = "edad", nullable = false)
	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_partida", nullable = false, length = 10)
	public Date getFechaPartida() {
		return this.fechaPartida;
	}

	public void setFechaPartida(Date fechaPartida) {
		this.fechaPartida = fechaPartida;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_reservacion", nullable = false, length = 10)
	public Date getFechaReservacion() {
		return this.fechaReservacion;
	}

	public void setFechaReservacion(Date fechaReservacion) {
		this.fechaReservacion = fechaReservacion;
	}

	@Column(name = "cantidad", nullable = false)
	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
