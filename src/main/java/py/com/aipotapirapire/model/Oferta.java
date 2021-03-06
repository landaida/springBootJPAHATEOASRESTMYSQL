package py.com.aipotapirapire.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.data.rest.core.annotation.RestResource;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Oferta implements Serializable {

	private static final long serialVersionUID = 9180456631851843863L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	private String descripcion;

	@ManyToOne
	@JoinColumn(name = "ID_USUARIO")
	@RestResource(exported = false)
	private Usuario usuario;

	@OneToOne
	@JoinColumn(name = "ID_PUBLICACION")
	@RestResource(exported = false)
	@JsonIgnore
	private Publicacion publicacion;

	public Oferta() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Oferta other = (Oferta) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
