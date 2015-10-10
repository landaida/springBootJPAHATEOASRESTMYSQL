package py.com.aipotapirapire.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.springframework.data.rest.core.annotation.RestResource;

@Entity
public class Pirapire implements Serializable {

	private static final long serialVersionUID = 8198362528770937678L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@OneToOne
	@JoinColumn(name = "ID_USUARIO")
	//@PrimaryKeyJoinColumn
	@RestResource(exported = false)
	private Usuario usuario;

	@Column(columnDefinition="double default '0'", precision=10, scale=4)
	private Double saldoAnterior = 0.0;
	
	@Column(columnDefinition="double default '0'", precision=10, scale=4)
	private Double saldo = 0.0;

	public Pirapire() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Double getSaldoAnterior() {
		return saldoAnterior;
	}

	public void setSaldoAnterior(Double saldoAnterior) {
		this.saldoAnterior = saldoAnterior;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
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
		Pirapire other = (Pirapire) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
