package udaff.io.entities;
// Generated 08-sep-2020 16:12:38 by Hibernate Tools 5.2.12.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Tour generated by hbm2java
 */
@Entity
@Table(name = "tour", catalog = "turismo_bd")
public class Tour implements java.io.Serializable {

	private Integer idTour;
	private CategoriaTour categoriaTour;
	private UserAgencia userAgencia;
	private String nombre;
	private byte[] imagen;
	private float precio;
	private String descripcion;
	private Date horaSalida;
	private String guiadorNombre;
	private Date fechaCreacion;
	private Set<Reservacion> reservacions = new HashSet<Reservacion>(0);
	private Set<GaleriaTour> galeriaTours = new HashSet<GaleriaTour>(0);
	private Set<Resena> resenas = new HashSet<Resena>(0);
	private Set<CantidaReservarcion> cantidaReservarcions = new HashSet<CantidaReservarcion>(0);

	public Tour() {
	}

	public Tour(CategoriaTour categoriaTour, UserAgencia userAgencia, String nombre, float precio, Date horaSalida,
			Date fechaCreacion) {
		this.categoriaTour = categoriaTour;
		this.userAgencia = userAgencia;
		this.nombre = nombre;
		this.precio = precio;
		this.horaSalida = horaSalida;
		this.fechaCreacion = fechaCreacion;
	}

	public Tour(CategoriaTour categoriaTour, UserAgencia userAgencia, String nombre, byte[] imagen, float precio,
			String descripcion, Date horaSalida, String guiadorNombre, Date fechaCreacion,
			Set<Reservacion> reservacions, Set<GaleriaTour> galeriaTours, Set<Resena> resenas,
			Set<CantidaReservarcion> cantidaReservarcions) {
		this.categoriaTour = categoriaTour;
		this.userAgencia = userAgencia;
		this.nombre = nombre;
		this.imagen = imagen;
		this.precio = precio;
		this.descripcion = descripcion;
		this.horaSalida = horaSalida;
		this.guiadorNombre = guiadorNombre;
		this.fechaCreacion = fechaCreacion;
		this.reservacions = reservacions;
		this.galeriaTours = galeriaTours;
		this.resenas = resenas;
		this.cantidaReservarcions = cantidaReservarcions;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_tour", unique = true, nullable = false)
	public Integer getIdTour() {
		return this.idTour;
	}

	public void setIdTour(Integer idTour) {
		this.idTour = idTour;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_categoria", nullable = false)
	public CategoriaTour getCategoriaTour() {
		return this.categoriaTour;
	}

	public void setCategoriaTour(CategoriaTour categoriaTour) {
		this.categoriaTour = categoriaTour;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cuenta", nullable = false)
	public UserAgencia getUserAgencia() {
		return this.userAgencia;
	}

	public void setUserAgencia(UserAgencia userAgencia) {
		this.userAgencia = userAgencia;
	}

	@Column(name = "nombre", nullable = false, length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "imagen")
	public byte[] getImagen() {
		return this.imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

	@Column(name = "precio", nullable = false, precision = 12, scale = 0)
	public float getPrecio() {
		return this.precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Column(name = "descripcion", length = 500)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "hora_salida", nullable = false, length = 19)
	public Date getHoraSalida() {
		return this.horaSalida;
	}

	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}

	@Column(name = "guiador_nombre", length = 100)
	public String getGuiadorNombre() {
		return this.guiadorNombre;
	}

	public void setGuiadorNombre(String guiadorNombre) {
		this.guiadorNombre = guiadorNombre;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_creacion", nullable = false, length = 10)
	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tour")
	public Set<Reservacion> getReservacions() {
		return this.reservacions;
	}

	public void setReservacions(Set<Reservacion> reservacions) {
		this.reservacions = reservacions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tour")
	public Set<GaleriaTour> getGaleriaTours() {
		return this.galeriaTours;
	}

	public void setGaleriaTours(Set<GaleriaTour> galeriaTours) {
		this.galeriaTours = galeriaTours;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tour")
	public Set<Resena> getResenas() {
		return this.resenas;
	}

	public void setResenas(Set<Resena> resenas) {
		this.resenas = resenas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tour")
	public Set<CantidaReservarcion> getCantidaReservarcions() {
		return this.cantidaReservarcions;
	}

	public void setCantidaReservarcions(Set<CantidaReservarcion> cantidaReservarcions) {
		this.cantidaReservarcions = cantidaReservarcions;
	}

}
