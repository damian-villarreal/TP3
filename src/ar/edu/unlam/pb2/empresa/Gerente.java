package ar.edu.unlam.pb2.empresa;

public class Gerente extends Empleado {

	private Integer cochera;

	public Gerente(String nombre, Double salario, Integer cumple,
			Integer cochera) {
		super(nombre, salario, cumple);
		this.cochera = cochera;
	}

	public void brindarDetalles() {
		super.brindarDetalles();
		System.out.println("El numero de cochera es: " + this.cochera);
	}

	public Integer getCochera() {
		return cochera;
	}

	public void setCochera(Integer cochera) {
		this.cochera = cochera;
	}
}
