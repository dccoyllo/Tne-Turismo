package udaff.io.entities;
// Generated 08-sep-2020 16:12:38 by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * UserPerfil generated by hbm2java
 */
@Entity
@Table(name = "user_perfil", catalog = "turismo_bd")
public class UserPerfil implements java.io.Serializable {

	private int idPerfil;
	private String nombre;
	private Set<Usuario> usuarios = new HashSet<Usuario>(0);

	public UserPerfil() {
	}

	public UserPerfil(int idPerfil, String nombre) {
		this.idPerfil = idPerfil;
		this.nombre = nombre;
	}

	public UserPerfil(int idPerfil, String nombre, Set<Usuario> usuarios) {
		this.idPerfil = idPerfil;
		this.nombre = nombre;
		this.usuarios = usuarios;
	}

	@Id

	@Column(name = "id_perfil", unique = true, nullable = false)
	public int getIdPerfil() {
		return this.idPerfil;
	}

	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}

	@Column(name = "nombre", nullable = false, length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userPerfil")
	public Set<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}
