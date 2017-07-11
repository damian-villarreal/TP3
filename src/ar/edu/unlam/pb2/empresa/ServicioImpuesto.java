package ar.edu.unlam.pb2.empresa;

public class ServicioImpuesto {
	private Double tope1 = 15000.00;
	private Double tope2 = 20000.00;
	private Double tope3 = 30000.00;
	private Double SalarioConImpuestos;
	

	public Double getSalarioConImpuestos() {
		return SalarioConImpuestos;
	}

	public void setSalarioConImpuestos(Double salarioConImpuestos) {
		SalarioConImpuestos = salarioConImpuestos;
	}

	public ServicioImpuesto(Empleado empleado) {
		if (empleado.getSalario() >= this.tope3) {
			setSalarioConImpuestos(empleado.getSalario() * 0.7);
		} else {
			if (empleado.getSalario() >= this.tope2) {
				setSalarioConImpuestos(empleado.getSalario() * 0.8);
			}

			else {
				if (empleado.getSalario() >= this.tope1) {
					setSalarioConImpuestos(empleado.getSalario() * 0.9);
				} else {
					setSalarioConImpuestos(empleado.getSalario());
				}
			}
		}
	}
}
