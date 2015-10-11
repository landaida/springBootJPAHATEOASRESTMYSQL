package py.com.aipotapirapire.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.data.rest.core.annotation.RestResource;

@Entity
public class Publicacion implements Serializable {

	private static final long serialVersionUID = 7900263412816328882L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@OneToOne(optional = true, mappedBy = "publicacion", cascade = CascadeType.ALL)
	@RestResource(exported = false)
	private Demanda demanda;

	@OneToOne(optional = true, mappedBy = "publicacion", cascade = CascadeType.ALL)
	@RestResource(exported = false)
	private Oferta oferta;

	@ManyToOne
	@JoinColumn(name = "ID_USUARIO")
	@RestResource(exported = false)
	private Usuario usuario;

	@Column
	private Date fecha = new Date();

	@Column(length = 1, columnDefinition = "varchar(1) default 'S'")
	private String activa = "S";

	@OneToMany(mappedBy = "publicacion", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Imagen> listImagen;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_PUBLICACION")
	private List<Operacion> listOperacion;

	@ManyToMany
	 @JoinTable(
		      name="PUBLICACION_CATEGORIA",
		      joinColumns={@JoinColumn(name="PUBLICACION_ID", referencedColumnName="ID")},
		      inverseJoinColumns={@JoinColumn(name="CATEGORIA_ID", referencedColumnName="ID")})
	private List<Categoria> listCategoria;
	
	public Publicacion() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Demanda getDemanda() {
		return demanda;
	}

	public void setDemanda(Demanda demanda) {
		this.demanda = demanda;
	}

	public Oferta getOferta() {
		return oferta;
	}

	public void setOferta(Oferta oferta) {
		this.oferta = oferta;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getActiva() {
		return activa;
	}

	public void setActiva(String activa) {
		this.activa = activa;
	}

	public List<Imagen> getListImagen() {
		return listImagen;
	}

	public void setListImagen(List<Imagen> listImagen) {
		this.listImagen = listImagen;
	}

	public List<Operacion> getListOperacion() {
		return listOperacion;
	}

	public void setListOperacion(List<Operacion> listOperacion) {
		this.listOperacion = listOperacion;
	}
	
	public List<Categoria> getListCategoria() {
		return listCategoria;
	}

	public void setListCategoria(List<Categoria> listCategoria) {
		this.listCategoria = listCategoria;
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
		Publicacion other = (Publicacion) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
