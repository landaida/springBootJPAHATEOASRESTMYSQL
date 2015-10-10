package py.com.aipotapirapire.model;

import java.io.Serializable;

import javax.persistence.Entity;

import py.com.aipotapirapire.OperacionTipo;

@Entity
public class Venta extends Operacion implements Serializable{

	private static final long serialVersionUID = 2098299143654688710L;

	public Venta() {
		super();
		this.setTipo(CREDITO);
	}


	
}
