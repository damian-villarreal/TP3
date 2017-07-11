package ar.edu.unlam.pb2.empresa;

public class Director extends Gerente {

	private Double extraGastos;

	public Director(String nombre, Double salario, Integer cumple,
			Integer cochera, Double extraGastos) {
		super(nombre, salario, cumple, cochera);
		this.extraGastos = extraGastos;
	}

	public void brindarDetalles() {
		super.brindarDetalles();
		System.out.println("El extra por gastos de vehiculo es de: "
				+ this.extraGastos);
	}

	public Double getExtraGastos() {
		return extraGastos;
	}

	public void setExtraGastos(Double extraGastos) {
		this.extraGastos = extraGastos;
	}

}
