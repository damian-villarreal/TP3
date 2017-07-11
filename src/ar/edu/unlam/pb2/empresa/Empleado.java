package ar.edu.unlam.pb2.empresa;

public class Empleado {
	private String nombre;
	private Double salario;
	private Integer cumple;

	public Empleado(String nombre, Double salario, Integer cumple) {
		this.nombre = nombre;
		this.salario = salario;
		this.cumple = cumple;
	}

	public void brindarDetalles() {
		System.out.println("El nombre es: " + this.nombre);
		System.out.println("El salario es :" + this.salario);
		System.out.println("El cumpleaños es :" + this.cumple);

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Integer getCumple() {
		return cumple;
	}

	public void setCumple(Integer cumple) {
		this.cumple = cumple;
	}

}
