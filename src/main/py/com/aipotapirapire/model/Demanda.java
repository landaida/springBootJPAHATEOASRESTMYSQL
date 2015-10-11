package py.com.aipotapirapire.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.data.rest.core.annotation.RestResource;

@Entity
public class Demanda implements Serializable {

	private static final long serialVersionUID = -5586206340710881417L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	private String descripcion;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "INTERESADOS", joinColumns = { @JoinColumn(name = "ID_DEMANDA") }, inverseJoinColumns = { @JoinColumn(name = "ID_USUARIO") })
	private List<Usuario> interesados;

	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "ELEGIDO")
	private Usuario elegido;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_USUARIO")
	@RestResource(exported = false)
	private Usuario usuario;

	@OneToOne
	@JoinColumn(name = "ID_PUBLICACION")
	@RestResource(exported = false)
	private Publicacion publicacion;

	public Demanda() {
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

	public List<Usuario> getInteresados() {
		return interesados;
	}

	public void setInteresados(List<Usuario> interesados) {
		this.interesados = interesados;
	}

	public Usuario getElegido() {
		return elegido;
	}

	public void setElegido(Usuario elegido) {
		this.elegido = elegido;
	}

	public Publicacion getPublicacion() {
		return publicacion;
	}

	public void setPublicacion(Publicacion publicacion) {
		this.publicacion = publicacion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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
		Demanda other = (Demanda) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
