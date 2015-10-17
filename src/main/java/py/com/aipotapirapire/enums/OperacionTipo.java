package py.com.aipotapirapire.enums;

public enum OperacionTipo {
	DEBITO("D"), CREDITO("C");

	private String value;

	private OperacionTipo(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}	
}
