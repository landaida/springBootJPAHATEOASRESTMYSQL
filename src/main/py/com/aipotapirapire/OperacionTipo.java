package py.com.aipotapirapire;

public enum OperacionTipo {
	DEBITO("D"), CREDITO("C");
	private final String name;
	
	private OperacionTipo(String name) {
		this.name = name;
	}

	public boolean equalsName(String otherName) {
        return (otherName == null) ? false : name.equals(otherName);
    }

    public String toString() {
       return this.name;
    }
}
