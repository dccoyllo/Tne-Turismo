package udaff.io.entities;
// Generated 08-sep-2020 16:12:38 by Hibernate Tools 5.2.12.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Viewagencia generated by hbm2java
 */
@Entity
@Table(name = "viewagencia", catalog = "turismo_bd")
public class Viewagencia implements java.io.Serializable {

	private ViewagenciaId id;

	public Viewagencia() {
	}

	public Viewagencia(ViewagenciaId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "cuenta", column = @Column(name = "cuenta", nullable = false, length = 45)),
			@AttributeOverride(name = "nombre", column = @Column(name = "nombre", nullable = false, length = 45)),
			@AttributeOverride(name = "ruc", column = @Column(name = "ruc", nullable = false, length = 11)),
			@AttributeOverride(name = "imagen", column = @Column(name = "imagen")),
			@AttributeOverride(name = "direccion", column = @Column(name = "direccion", length = 45)),
			@AttributeOverride(name = "telefono", column = @Column(name = "telefono", length = 9)),
			@AttributeOverride(name = "descripcion", column = @Column(name = "descripcion", length = 500)) })
	public ViewagenciaId getId() {
		return this.id;
	}

	public void setId(ViewagenciaId id) {
		this.id = id;
	}

}