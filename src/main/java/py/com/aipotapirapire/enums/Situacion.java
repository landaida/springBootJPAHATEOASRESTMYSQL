package py.com.aipotapirapire.enums;

public enum Situacion {
	ACTIVO("A"), INACTIVO("I");

	private String value;

	private Situacion(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}	
}
