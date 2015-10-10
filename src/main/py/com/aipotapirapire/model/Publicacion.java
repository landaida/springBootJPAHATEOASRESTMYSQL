package py.com.aipotapirapire.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Publicacion implements Serializable {

	private static final long serialVersionUID = 7900263412816328882L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@OneToOne(optional = true)
	@JoinColumn(name = "ID_DEMANDA")
	private Demanda demanda;

	@OneToOne(optional = true)
	@JoinColumn(name = "ID_OFERTA")
	private Oferta oferta;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_USUARIO")
	private Usuario usuario;

	@Column
	private Date fecha;

	@Column(length = 1, columnDefinition = "varchar(1) default 'A'")
	private String activa;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PUBLICACION")
	private List<Imagen> listImagen;

	@OneToMany
	@JoinColumn(name = "ID_PUBLICACION")
	private List<Operacion> listOperacion;

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
