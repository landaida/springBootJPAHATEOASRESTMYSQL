package py.com.aipotapirapire.enums;

public enum CalificacionValores {
	UNO(1), UNO_MEDIO(1.5), DOS(2), DOS_MEDIO(2.5), TRES(3), TRES_MEDIO(3.5), CUATRO(
			4), CUATRO_MEDIO(4.5), CINCO(5);

	private double value;

	private CalificacionValores(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}	
}
