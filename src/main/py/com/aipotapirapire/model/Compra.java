package py.com.aipotapirapire.model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Compra extends Operacion implements Serializable {

	private static final long serialVersionUID = 7049922356184930817L;

	public Compra() {
		super();
		this.setTipo(DEBITO);
	}

	

}
