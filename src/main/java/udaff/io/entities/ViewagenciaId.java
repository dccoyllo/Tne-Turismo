package udaff.io.entities;
// Generated 08-sep-2020 16:12:38 by Hibernate Tools 5.2.12.Final

import java.util.Arrays;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ViewagenciaId generated by hbm2java
 */
@Embeddable
public class ViewagenciaId implements java.io.Serializable {

	private String cuenta;
	private String nombre;
	private String ruc;
	private byte[] imagen;
	private String direccion;
	private String telefono;
	private String descripcion;

	public ViewagenciaId() {
	}

	public ViewagenciaId(String cuenta, String nombre, String ruc) {
		this.cuenta = cuenta;
		this.nombre = nombre;
		this.ruc = ruc;
	}

	public ViewagenciaId(String cuenta, String nombre, String ruc, byte[] imagen, String direccion, String telefono,
			String descripcion) {
		this.cuenta = cuenta;
		this.nombre = nombre;
		this.ruc = ruc;
		this.imagen = imagen;
		this.direccion = direccion;
		this.telefono = telefono;
		this.descripcion = descripcion;
	}

	@Column(name = "cuenta", nullable = false, length = 45)
	public String getCuenta() {
		return this.cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	@Column(name = "nombre", nullable = false, length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "ruc", nullable = false, length = 11)
	public String getRuc() {
		return this.ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	@Column(name = "imagen")
	public byte[] getImagen() {
		return this.imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

	@Column(name = "direccion", length = 45)
	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Column(name = "telefono", length = 9)
	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Column(name = "descripcion", length = 500)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ViewagenciaId))
			return false;
		ViewagenciaId castOther = (ViewagenciaId) other;

		return ((this.getCuenta() == castOther.getCuenta()) || (this.getCuenta() != null
				&& castOther.getCuenta() != null && this.getCuenta().equals(castOther.getCuenta())))
				&& ((this.getNombre() == castOther.getNombre()) || (this.getNombre() != null
						&& castOther.getNombre() != null && this.getNombre().equals(castOther.getNombre())))
				&& ((this.getRuc() == castOther.getRuc()) || (this.getRuc() != null && castOther.getRuc() != null
						&& this.getRuc().equals(castOther.getRuc())))
				&& ((this.getImagen() == castOther.getImagen()) || (this.getImagen() != null
						&& castOther.getImagen() != null && Arrays.equals(this.getImagen(), castOther.getImagen())))
				&& ((this.getDireccion() == castOther.getDireccion()) || (this.getDireccion() != null
						&& castOther.getDireccion() != null && this.getDireccion().equals(castOther.getDireccion())))
				&& ((this.getTelefono() == castOther.getTelefono()) || (this.getTelefono() != null
						&& castOther.getTelefono() != null && this.getTelefono().equals(castOther.getTelefono())))
				&& ((this.getDescripcion() == castOther.getDescripcion())
						|| (this.getDescripcion() != null && castOther.getDescripcion() != null
								&& this.getDescripcion().equals(castOther.getDescripcion())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCuenta() == null ? 0 : this.getCuenta().hashCode());
		result = 37 * result + (getNombre() == null ? 0 : this.getNombre().hashCode());
		result = 37 * result + (getRuc() == null ? 0 : this.getRuc().hashCode());
		result = 37 * result + (getImagen() == null ? 0 : Arrays.hashCode(this.getImagen()));
		result = 37 * result + (getDireccion() == null ? 0 : this.getDireccion().hashCode());
		result = 37 * result + (getTelefono() == null ? 0 : this.getTelefono().hashCode());
		result = 37 * result + (getDescripcion() == null ? 0 : this.getDescripcion().hashCode());
		return result;
	}

}