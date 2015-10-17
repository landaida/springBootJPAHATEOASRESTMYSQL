package py.com.aipotapirapire.model;

import java.io.Serializable;

import javax.persistence.Entity;

import py.com.aipotapirapire.enums.OperacionTipo;

@Entity
public class Venta extends Operacion implements Serializable {

	private static final long serialVersionUID = -7924862278413962195L;

	public Venta() {
		super();
		this.setTipo(OperacionTipo.CREDITO.getValue());
	}

}
