package ar.edu.unlam.pb2.empresa;

import org.junit.Assert;
import org.junit.Test;

public class EmpresaTest {
	@Test
	public void testQueDevuelvaLosDetallesDelEmpleado() {

		Gerente mario = new Director("Mario", 15000.00, 19121986, 1321, 120.00);
		mario.brindarDetalles();
		
	}
	
	@Test
	public void testDeterminarImpuestos(){
		Gerente mario = new Director("Mario", 15000.00, 19121986, 1321, 120.00);
		ServicioImpuesto se=new ServicioImpuesto(mario);
		Double salarioEsperado=13500.0;
		Assert.assertEquals(salarioEsperado, se.getSalarioConImpuestos());
		
	}
}